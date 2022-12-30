package com.evan.seprojrearend.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.fastjson.JSONObject;
import com.evan.seprojrearend.common.JsonResult;
import com.evan.seprojrearend.po.SecInfoExcel;
import com.evan.seprojrearend.po.SysMember;
import com.evan.seprojrearend.service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
public class LectureController {
    @Autowired
    private LectureService LectureService;
    //2.1.1.1 责任教师设立课程
    @PostMapping("lecture/set_course/{cour_name}/{res_teacher_id}")
    public JsonResult createCourse(@PathVariable String cour_name,@PathVariable Integer res_teacher_id){
        String re = null;
        re = LectureService.createCourse(cour_name,res_teacher_id);
        /*
        try {
            re = LectureService.createCourse(cour_name,res_teacher_id);
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }*/
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
    public JsonResult importSectionInfo(@RequestPart("info_file") MultipartFile info_file, @PathVariable Integer school_id) throws IOException {
        String re = null;
        /*
        List<SecInfoExcel> list = EasyExcel.read(info_file.getInputStream())
                .head(SecInfoExcel.class)
                .sheet()
                .doReadSync();
        re = LectureService.importSectionInfo(list,school_id);*/

        try {
            List<SecInfoExcel> list = EasyExcel.read(info_file.getInputStream())
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
    @PostMapping("lecture/set_sec/{course_id}/{teacher_id}/{section_time}")
    public JsonResult createSection(@PathVariable Integer course_id,@PathVariable Integer teacher_id,@PathVariable String section_time){
        String re = null;
        try {
            re = LectureService.createSection(course_id,teacher_id,section_time);
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

    //2.3.1.1 教师发布实验
    @PostMapping("lecture/create_exp/{experiment_name}/{section_id}/{teacher_id}/{school_id}/{exp_content}")
    public JsonResult createExp(@PathVariable String experiment_name,@PathVariable Integer section_id,@PathVariable Integer teacher_id,@PathVariable Integer school_id,@PathVariable String exp_content)throws Exception {
        String re = null;
        try {
            re = LectureService.newExperiment(experiment_name,section_id,teacher_id,school_id,exp_content);
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }

    //2.3.2.1 返回某课程已发布实验列表
    @PostMapping("lecture/get_exp_list/{section_id}")
    public JsonResult getExpList(@PathVariable Integer section_id)throws Exception {
        String re = null;
        try {
            re = LectureService.getExpList(section_id);
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }

    //2.4.1.1 学生上传报告
    @PostMapping("lecture/upload_report/{report_url}/{exp_id}/{stu_id}/{school_id}")
    public JsonResult uploadReport(@PathVariable String report_url,@PathVariable Integer exp_id,@PathVariable Integer stu_id,@PathVariable Integer school_id){
        String re = null;
        try {
            re = LectureService.uploadReport(report_url,exp_id,stu_id,school_id);
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }

}
