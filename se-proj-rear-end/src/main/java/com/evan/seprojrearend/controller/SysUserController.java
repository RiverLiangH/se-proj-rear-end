package com.evan.seprojrearend.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.fastjson.JSONObject;
import com.evan.seprojrearend.common.JsonResult;
import com.evan.seprojrearend.po.SysMember;
import com.evan.seprojrearend.po.SysUser;
import com.evan.seprojrearend.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
@CrossOrigin
public class SysUserController {
    @Autowired
    private SysUserService SysUserService;

    @GetMapping("user/v1/{email}")
    public JsonResult findSysUser(@PathVariable String email)throws Exception {
        return JsonResult.isOk(SysUserService.findSysUser(email));
    }

    //1.1 用户登录验证
    @GetMapping("user/log_in_valid/{email}/{password}")
    public JsonResult validSysUser(@PathVariable String email,@PathVariable String password)throws Exception{
        String re = null;
        try {
            re=SysUserService.isInSysUser(email,password);
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }

    //1.2 用户注册
    @PostMapping("user/sys_sign_up/{email}/{password}")
    public JsonResult newSysUser(@PathVariable String email,@PathVariable String password)throws Exception{
        String re = null;
        try {
            re = SysUserService.newSysUser(email,password);
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }

    //1.3 批量导入学生账户
    @PostMapping(value = "user/import_stu/{school_id}")
    public JsonResult importStudentByExcel(@RequestPart("file") MultipartFile file,@PathVariable Integer school_id) throws IOException {
        String re = null;
        try {
            List<SysMember> list = EasyExcel.read(file.getInputStream())
                    .head(SysMember.class)
                    .sheet()
                    .doReadSync();
            re = SysUserService.importStudentByExcel(list,school_id);
            /*
            //测试用
            for (SysMember SysMember : list) {
                System.out.println(SysMember);
            }*/
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }

    //1.4 批量导入教师账户
    @PostMapping(value = "user/import_tea/{school_id}")
    public JsonResult importTeacherByExcel(@RequestPart("file") MultipartFile file,@PathVariable Integer school_id) throws IOException {
        String re = null;
        try {
            List<SysMember> list = EasyExcel.read(file.getInputStream())
                    .head(SysMember.class)
                    .sheet()
                    .doReadSync();
            re = SysUserService.importTeacherByExcel(list,school_id);
            /*
            //测试用
            for (SysMember SysMember : list) {
                System.out.println(SysMember);
            }*/
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }

    //1.5 用户绑定虚拟账户
    @PostMapping("user/bond_vir_account/{email}/{school_id}")
    public JsonResult bindVirtualAccount(@PathVariable String email,@PathVariable Integer school_id)throws Exception{
        String re = null;
        try {
            re = SysUserService.bindVirtualAccount(email,school_id);
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }

    //1.6 返回用户拥有的系统
    @GetMapping("user/user_school_mes/{email}")
    public JsonResult userSchoolMes(@PathVariable String email){
        String re = null;
        /*
        List<JSONObject> result = SysUserService.getUserSchoolMesStu(email);
        result.addAll(SysUserService.getUserSchoolMesTea(email));
        result.addAll(SysUserService.getUserSchoolMesAd(email));
        re = result.toString();*/
        try {
            List<JSONObject> result = SysUserService.getUserSchoolMesStu(email);
            result.addAll(SysUserService.getUserSchoolMesTea(email));
            result.addAll(SysUserService.getUserSchoolMesAd(email));
            re = result.toString();
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }

}
