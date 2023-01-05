package com.evan.seprojrearend.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.fastjson.JSONObject;
import com.evan.seprojrearend.common.JsonResult;
import com.evan.seprojrearend.po.SecInfoExcel;
import com.evan.seprojrearend.po.SysMember;
import com.evan.seprojrearend.service.LectureService;
import com.evan.seprojrearend.service.OssTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
public class LectureController {
    @Autowired
    private LectureService LectureService;

    @Autowired
    private OssTemplate OssTemplate;

    //2.1.1.1 责任教师设立课程
    @PostMapping("lecture/set_course/{cour_name}/{res_teacher_id}/{school_id}")
    public JsonResult createCourse(@RequestPart("file") MultipartFile file, @PathVariable String cour_name,@PathVariable BigDecimal res_teacher_id,@PathVariable BigDecimal school_id){
        String re = null;
        try {
            re = LectureService.createCourse(cour_name,res_teacher_id,school_id,OssTemplate.upload(file));
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }

    //2.1.1.2 返回设立课程列表
    @GetMapping("lecture/course_list/{res_teacher_id}")
    public JsonResult getCourseList(@PathVariable Integer res_teacher_id){
        String re = null;
        try {
            re = LectureService.getCourseList(res_teacher_id);
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }

    //2.1.1.3 删除课程
    @PostMapping("lecture/delete_course/{course_id}")
    public JsonResult deleteCourse(@PathVariable Integer course_id){
        String re = null;
        try {
            re = LectureService.deleteCourse(course_id);
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }

    //2.1.2.1 导入选课信息
    @PostMapping("lecture/import_sec_info/{school_id}")
    public JsonResult importSectionInfo(@RequestPart("file") MultipartFile file, @PathVariable Integer school_id) throws IOException {
        String re = null;
        /*
        List<SecInfoExcel> list = EasyExcel.read(info_file.getInputStream())
                .head(SecInfoExcel.class)
                .sheet()
                .doReadSync();
        re = LectureService.importSectionInfo(list,school_id);*/

        try {
            List<SecInfoExcel> list = EasyExcel.read(file.getInputStream())
                    .head(SysMember.class)
                    .sheet()
                    .doReadSync();
            re = LectureService.importSectionInfo(list,school_id);
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }

    //2.1.3.1 教师查看课程列表
    @GetMapping("lecture/get_teacher_take/{teacher_id}")
    public JsonResult getTeacherTakeList(@PathVariable Integer teacher_id){
        String re = null;
        try {
            re = LectureService.getTeacherTakeList(teacher_id).toString();
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }

    //2.1.4.1 学生查看课程列表
    @GetMapping("lecture/get_student_take/{student_id}")
    public JsonResult getStudentTakeList(@PathVariable Integer student_id){
        String re = null;
        try {
            re = LectureService.getStudentTakeList(student_id).toString();
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }

    //2.2.1.1 责任教师设立section
    @PostMapping("lecture/set_sec/{course_id}/{teacher_id}/{section_time}/{school_id}")
    public JsonResult createSection(@PathVariable Integer course_id,@PathVariable Integer teacher_id,@PathVariable String section_time,@PathVariable Integer school_id){
        String re = null;
        //re = LectureService.createSection(course_id,teacher_id,section_time,school_id);
        try {
            re = LectureService.createSection(course_id,teacher_id,section_time,school_id);
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }

    //2.2.1.2 删除section
    @PostMapping("lecture/delete_section/{section_id}")
    public JsonResult deleteSection(@PathVariable Integer section_id){
        String re = null;
        //re = LectureService.deleteSection(section_id);
        try {
            re = LectureService.deleteSection(section_id);
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }

    //2.2.1.3 修改section
    @PostMapping("lecture/modify_section/{section_id}/{teacher_id}/{section_time}")
    public JsonResult modifySection(@PathVariable Integer section_id,@PathVariable Integer teacher_id,@PathVariable String section_time){
        String re = null;
        //re = LectureService.deleteSection(section_id);
        try {
            re = LectureService.modifySection(section_id,teacher_id,section_time);
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }

    //2.2.1.4 section_info中增加学生
    @PostMapping("lecture/addStudentInSecInfo/{section_id}/{student_id}/{school_id}")
    public JsonResult addStudentInSecInfo(@PathVariable BigDecimal section_id,@PathVariable BigDecimal student_id,@PathVariable BigDecimal school_id){
        String re = null;
        try {
            re = LectureService.addStudentInSecInfo(section_id,student_id,school_id);
            //re = LectureService.modifySection(section_id,teacher_id,section_time);
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }

    //2.2.1.5 section_info中删除学生
    @PostMapping("lecture/delStudentInSecInfo/{section_id}/{student_id}/{school_id}")
    public JsonResult delStudentInSecInfo(@PathVariable BigDecimal section_id,@PathVariable BigDecimal student_id,@PathVariable BigDecimal school_id){
        String re = null;
        try {
            re = LectureService.deleteStudentInSecInfo(section_id,student_id,school_id);
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }

    //2.2.2.1 返回课程section列表
    @GetMapping("lecture/sec_list/{course_id}")
    public JsonResult getSectionList(@PathVariable Integer course_id){
        String re = null;
        try {
            re = LectureService.getSectionList(course_id);
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }

    //2.2.2.2 返回某section的学生选课信息列表
    @GetMapping("lecture/sec_info_list/{section_id}/{school_id}")
    public JsonResult getSectionInfoList(@PathVariable BigDecimal section_id,@PathVariable BigDecimal school_id){
        String re = null;
        //re = LectureService.getSecInfoList(section_id,school_id).toString();
        try {
            re = LectureService.getSecInfoList(section_id,school_id).toString();
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }

    //2.3.1.1 教师发布实验
    @PostMapping("lecture/create_exp/{experiment_name}/{section_id}/{teacher_id}/{school_id}/{deadline}")
    public JsonResult createExp(@PathVariable String experiment_name, @PathVariable Integer section_id, @PathVariable Integer teacher_id, @PathVariable Integer school_id, @PathVariable String deadline)throws Exception {
        String re = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date ddl_time=sdf.parse(deadline);
            re = LectureService.newExperiment(experiment_name,section_id,teacher_id,school_id,ddl_time);
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }

    //2.3.2.1 返回某课程已发布实验列表
    @GetMapping("lecture/get_exp_list/{section_id}")
    public JsonResult getExpList(@PathVariable Integer section_id)throws Exception {
        String re = null;
        try {
            re = LectureService.getExpList(section_id);
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }

    //2.3.2.2 返回具体的实验内容
    @GetMapping("lecture/get_exp_info/{experiment_id}/{student_id}/{school_id}")
    public JsonResult getExperimentInfo(@PathVariable Integer experiment_id,@PathVariable Integer student_id,@PathVariable Integer school_id){
        String re = null;
        //re = LectureService.getExpInfo(BigDecimal.valueOf(experiment_id),BigDecimal.valueOf(student_id),BigDecimal.valueOf(school_id)).toString();
        try {
            re = LectureService.getExpInfo(BigDecimal.valueOf(experiment_id),BigDecimal.valueOf(student_id),BigDecimal.valueOf(school_id)).toString();
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }

    //2.4.1.1 学生上传报告
    @PostMapping(value = "lecture/upload_report/{exp_id}/{stu_id}/{school_id}")
    public JsonResult uploadReport(@RequestPart("file") MultipartFile file,@PathVariable Integer exp_id,@PathVariable Integer stu_id,@PathVariable Integer school_id){
        String re = null;
        //re = LectureService.uploadReport(OssTemplate.upload(file),exp_id,stu_id,school_id);
        try {
            re = LectureService.uploadReport(OssTemplate.upload(file),exp_id,stu_id,school_id);
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }

    //2.4.2.1 教师下载报告
    @GetMapping("lecture/get_report/{experiment_id}/{student_id}/{school_id}")
    public JsonResult getReport(@PathVariable BigDecimal experiment_id,@PathVariable BigDecimal student_id,@PathVariable BigDecimal school_id){
        String re = null;
        //re = LectureService.getExpInfo(BigDecimal.valueOf(experiment_id),BigDecimal.valueOf(student_id),BigDecimal.valueOf(school_id)).toString();
        try {
            re = LectureService.downloadReport(experiment_id,student_id,school_id).toString();
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }

    //2.4.2.2 返回某实验下的报告列表
    @GetMapping("lecture/get_report_list/{experiment_id}/{school_id}")
    public JsonResult getReportList(@PathVariable BigDecimal experiment_id,@PathVariable BigDecimal school_id){
        String re = null;
        //re = LectureService.getReportList(experiment_id,school_id).toString();
        try {
            re = LectureService.getReportList(experiment_id,school_id).toString();
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }

}
