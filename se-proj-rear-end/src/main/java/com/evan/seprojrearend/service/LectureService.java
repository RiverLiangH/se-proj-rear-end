package com.evan.seprojrearend.service;

import com.alibaba.fastjson.JSONObject;
import com.evan.seprojrearend.po.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class LectureService {
    @Autowired
    private final com.evan.seprojrearend.mapper.ExperimentMapper ExperimentMapper;

    @Autowired
    private final com.evan.seprojrearend.mapper.CourseMapper CourseMapper;

    @Autowired
    private final com.evan.seprojrearend.mapper.TeacherMapper TeacherMapper;
    @Autowired
    private final com.evan.seprojrearend.mapper.CourSectionMapper CourSectionMapper;

    @Autowired
    private final com.evan.seprojrearend.mapper.SectionInfoMapper SectionInfoMapper;

    @Autowired
    private final com.evan.seprojrearend.mapper.ReportsMapper ReportsMapper;

    public LectureService(com.evan.seprojrearend.mapper.ExperimentMapper experimentMapper, com.evan.seprojrearend.mapper.CourseMapper courseMapper, com.evan.seprojrearend.mapper.TeacherMapper teacherMapper, com.evan.seprojrearend.mapper.CourSectionMapper courSectionMapper, com.evan.seprojrearend.mapper.SectionInfoMapper sectionInfoMapper, com.evan.seprojrearend.mapper.ReportsMapper reportsMapper) {
        ExperimentMapper = experimentMapper;
        CourseMapper = courseMapper;
        TeacherMapper = teacherMapper;
        CourSectionMapper = courSectionMapper;
        SectionInfoMapper = sectionInfoMapper;
        ReportsMapper = reportsMapper;
    }

    //2.1.1.1 设立课程
    public String createCourse(String cour_name, BigDecimal res_teacher_id, BigDecimal school_id,String outline){
        //插入
        Course newCourse = new Course();
        newCourse.setCourseName(cour_name);
        newCourse.setResTeacherId(res_teacher_id);
        newCourse.setIsDeleted(BigDecimal.valueOf(0));
        newCourse.setSchoolId(school_id);
        newCourse.setCourseOutline(outline);
        CourseMapper.insert(newCourse);
        return "True";
    }

    //2.1.1.2 返回设立课程列表
    public String getCourseList(Integer res_id) throws JsonProcessingException {
        CourseExample findCourse = new CourseExample();
        CourseExample.Criteria criteria = findCourse.createCriteria();
        criteria.andResTeacherIdEqualTo(BigDecimal.valueOf(res_id));
        criteria.andIsDeletedEqualTo(BigDecimal.valueOf(0));
        List<Course> queryAllCourse = CourseMapper.selectByExample(findCourse);
        return new ObjectMapper().writeValueAsString(queryAllCourse);
    }

    //2.1.1.3 删除课程
    public String deleteCourse(Integer course_id){
        //查找需要删除的课程
        CourseExample findCourse = new CourseExample();
        CourseExample.Criteria criteria = findCourse.createCriteria();
        criteria.andCourseIdEqualTo(BigDecimal.valueOf(course_id));
        //修改isdelete属性
        Course delCourse = new Course();
        delCourse.setIsDeleted(BigDecimal.valueOf(1));
        CourseMapper.updateByExampleSelective(delCourse,findCourse);
        return "True";
    }

    //2.1.2.1 导入选课信息
    public String importSectionInfo(List<SecInfoExcel> sec_info_list, Integer school_id){
        for (SecInfoExcel SecInfoExcel : sec_info_list) {
            SectionInfo newInfo = new SectionInfo();
            newInfo.setSectionId(SecInfoExcel.getSecId());
            newInfo.setStudentId(SecInfoExcel.getStudentId());
            newInfo.setSchoolId(BigDecimal.valueOf(school_id));
            SectionInfoMapper.insertSelective(newInfo);
        }
        return "True";
    }

    //2.1.3.1 教师查看课程列表
    public List<JSONObject> getTeacherTakeList(Integer teacher_id){
        return CourSectionMapper.selectTakeByTeacherId(BigDecimal.valueOf(teacher_id));
    }

    //2.1.4.1 学生查看课程列表
    public List<JSONObject> getStudentTakeList(Integer student_id){
        return CourSectionMapper.selectTakeByStudentId(BigDecimal.valueOf(student_id));
    }

    //2.2.1.1 设立section
    public String createSection(Integer course_id, Integer teacher_id, String Section_time,Integer school_id){
        CourSection newSec = new CourSection();
        newSec.setCourseId(BigDecimal.valueOf(course_id));
        newSec.setTeacherId(BigDecimal.valueOf(teacher_id));
        newSec.setSectionTime(Section_time);
        newSec.setSchoolId(BigDecimal.valueOf(school_id));
        CourSectionMapper.insertSelective(newSec);
        return "True";
    }

    //2.2.1.2 删除section
    public String deleteSection(Integer sec_id){
        //查找需要删除的section
        CourSectionExample findSection = new CourSectionExample();
        CourSectionExample.Criteria criteria = findSection.createCriteria();
        criteria.andSectionIdEqualTo(BigDecimal.valueOf(sec_id));
        //修改isdelete属性
        CourSection delSec = new CourSection();
        delSec.setIsDelete(BigDecimal.valueOf(1));
        CourSectionMapper.updateByExampleSelective(delSec,findSection);
        return "True";
    }

    //2.2.1.3 修改section
    public String modifySection(Integer sec_id,Integer teacher_id,String sec_time){
        //查找需要删除的section
        CourSectionExample findSection = new CourSectionExample();
        CourSectionExample.Criteria criteria = findSection.createCriteria();
        criteria.andSectionIdEqualTo(BigDecimal.valueOf(sec_id));
        //修改isdelete属性
        CourSection modSec = new CourSection();
        modSec.setSectionTime(sec_time);
        modSec.setTeacherId(BigDecimal.valueOf(teacher_id));
        CourSectionMapper.updateByExampleSelective(modSec,findSection);
        return "True";
    }

    //2.2.2.1 返回课程section列表
    public String getSectionList(Integer course_id) throws JsonProcessingException {
        CourSectionExample findSection = new CourSectionExample();
        CourSectionExample.Criteria criteria = findSection.createCriteria();
        criteria.andCourseIdEqualTo(BigDecimal.valueOf(course_id));
        criteria.andIsDeleteEqualTo(BigDecimal.valueOf(0));
        List<CourSection> queryAllSection = CourSectionMapper.selectByExample(findSection);
        return new ObjectMapper().writeValueAsString(queryAllSection);
    }


    //2.3.1.1 教师发布实验
    public String newExperiment(String exp_name,Integer sec_id,Integer teacher_id,Integer school_id,String exp_content){
        Experiment newExp = new Experiment();
        newExp.setExperimentName(exp_name);
        newExp.setSectionId(BigDecimal.valueOf(sec_id));
        newExp.setTeacherId(BigDecimal.valueOf(teacher_id));
        newExp.setSchoolId(BigDecimal.valueOf(school_id));
        newExp.setIsDeleted(BigDecimal.valueOf(0));
        newExp.setExperimentContext(exp_content);
        ExperimentMapper.insert(newExp);
        return "True";
    }

    //2.3.2.1 返回某课程已发布实验列表
    public String getExpList(Integer sec_id) throws JsonProcessingException {
        //查找该section下的实验
        ExperimentExample findSection = new ExperimentExample();
        ExperimentExample.Criteria criteria = findSection.createCriteria();
        criteria.andSectionIdEqualTo(BigDecimal.valueOf(sec_id));
        criteria.andIsDeletedEqualTo(BigDecimal.valueOf(0));//未删除
        List<Experiment> queryAllExp = ExperimentMapper.selectByExample(findSection);
        return new ObjectMapper().writeValueAsString(queryAllExp);
    }

    //2.3.2.2 返回具体的实验内容
    public List<JSONObject> getExpInfo(BigDecimal exp_id,BigDecimal student_id,BigDecimal school_id){
        return ExperimentMapper.selectExperimentInfo(exp_id,student_id,school_id);
    }

    //2.4.1.1 学生上传报告
    public String uploadReport(String report_url,Integer exp_id,Integer stu_id,Integer school_id){
        //获取当前时间
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date curDate = new Date(System.currentTimeMillis());
        //创建新报告
        Reports newReport = new Reports();
        newReport.setReportAddress(report_url);
        newReport.setExperimentId(BigDecimal.valueOf(exp_id));
        newReport.setStudentId(BigDecimal.valueOf(stu_id));
        newReport.setSchoolId(BigDecimal.valueOf(school_id));
        newReport.setFinData(curDate);

        ReportsMapper.insertSelective(newReport);
        return "True";
    }



}
