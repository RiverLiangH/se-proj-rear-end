package com.evan.seprojrearend.controller;

import com.evan.seprojrearend.service.JsonResult;
import com.evan.seprojrearend.service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LectureController {
    @Autowired
    private LectureService LectureService;
    //2.1 责任教师设立课程

    //2.2 责任教师修改课程

    //2.3 用户查看课程

    //2.4 教师发布实验
    @PostMapping("lecture/v4/{experiment_name}/{section_id}/{teacher_id}/{school_id}")
    public JsonResult findSysUser(@PathVariable String experiment_name,@PathVariable Integer section_id,@PathVariable Integer teacher_id,@PathVariable Integer school_id)throws Exception {
        return JsonResult.isOk(LectureService.newExperiment(experiment_name,section_id,teacher_id,school_id));
    }
}
