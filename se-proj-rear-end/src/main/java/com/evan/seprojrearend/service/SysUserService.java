package com.evan.seprojrearend.service;

import com.evan.seprojrearend.mapper.AdministratorMapper;
import com.evan.seprojrearend.po.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

@Service
public class SysUserService {
    @Autowired
    private com.evan.seprojrearend.mapper.SysUserMapper SysUserMapper;

    @Autowired
    private com.evan.seprojrearend.mapper.StudentMapper StudentMapper;

    @Autowired
    private com.evan.seprojrearend.mapper.TeacherMapper TeacherMapper;

    @Autowired
    private com.evan.seprojrearend.mapper.AdministratorMapper AdminitratorMapper;

    public SysUserService(com.evan.seprojrearend.mapper.SysUserMapper sysUserMapper, com.evan.seprojrearend.mapper.StudentMapper studentMapper, com.evan.seprojrearend.mapper.TeacherMapper teacherMapper, AdministratorMapper adminitratorMapper) {
        SysUserMapper = sysUserMapper;
        StudentMapper = studentMapper;
        TeacherMapper = teacherMapper;
        AdminitratorMapper = adminitratorMapper;
    }

    public SysUser findSysUser(String email) {
        return SysUserMapper.selectByPrimaryKey(email);
    }

    //登录验证
    public String isInSysUser(String email, String password){

        SysUser thisUser = SysUserMapper.selectByPrimaryKey(email);
        if(thisUser!=null&&Objects.equals(thisUser.getPassword(), password))
            return "True";
        else
            return "False";
    }

    //创建新用户
    public String newSysUser(String email,String password){

        SysUser newUser = new SysUser();
        newUser.setEmail(email);
        newUser.setPassword(password);
        if(SysUserMapper.insert(newUser)==1)
            return "True";
        else
            return "False";
    }

    //绑定虚拟账户
    public String bindVirtualAccount(String email, Integer school_id){
        //查找学生身份
        StudentExample findMatchStu = new StudentExample();
        StudentExample.Criteria criteria0 = findMatchStu.createCriteria();
        criteria0.andMailAddressEqualTo(email);
        criteria0.andSchoolIdEqualTo(BigDecimal.valueOf(school_id));
        List<Student> stuResult = StudentMapper.selectByExample(findMatchStu);
        if(!stuResult.isEmpty()){
            //修改虚拟账户的绑定状态
            Student updateStudent = new Student();
            updateStudent.setIsBond(BigDecimal.valueOf(1));
            StudentMapper.updateByExampleSelective(updateStudent,findMatchStu);
            return "True";
        }
        else{
            //查找教师身份
            TeacherExample findMatchTea = new TeacherExample();
            TeacherExample.Criteria criteria1 = findMatchTea.createCriteria();
            criteria1.andMailAddressEqualTo(email);
            criteria1.andSchoolIdEqualTo(BigDecimal.valueOf(school_id));
            List<Teacher> teaResult = TeacherMapper.selectByExample(findMatchTea);
            if(!teaResult.isEmpty()){
                //修改虚拟账户的绑定状态
                Teacher updateTeacher = new Teacher();
                updateTeacher.setIsBond(BigDecimal.valueOf(1));
                TeacherMapper.updateByExampleSelective(updateTeacher,findMatchTea);
                return "True";
            }
            else{
                //查找管理员身份
                //AdministratorExample findMatchAdmin = new AdministratorExample();
                //AdministratorExample.Criteria criteria2 =  findMatchAdmin.createCriteria();
                //criteria2.andMailAddressEqualTo(email);
                //criteria2.andSchoolIdEqualTo(BigDecimal.valueOf(school_id));
                //List<Administrator> isAdmin = AdministratorMapper.selectByExample(findMatchAdmin);
                //if(!isAdmin.isEmpty()){
                    //修改虚拟账户的绑定状态
                    //isAdmin.get(0).setIsBond(BigDecimal.valueOf(1));
                    //return "True";
                //}
            }
        }
        return "False";
    }
}
