package com.evan.seprojrearend.controller;

import com.evan.seprojrearend.common.JsonResult;
import com.evan.seprojrearend.service.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@CrossOrigin
public class MarkController {
    @Autowired
    private com.evan.seprojrearend.service.MarkService MarkService;

    //4.1 批改成绩
    @PostMapping("mark/set_report_mark/{exp_id}/{student_id}/{school_id}/{mark}")
    public JsonResult setReportMark(@PathVariable Integer exp_id,@PathVariable Integer student_id,@PathVariable Integer school_id,@PathVariable Integer mark){
        String re = null;
        //re = MarkService.setReportMark(exp_id,student_id,school_id,mark);
        try {
            re = MarkService.setReportMark(exp_id,student_id,school_id,mark);
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }

    //4.2 查看报告成绩
    @GetMapping("mark/check_report_mark/{student_id}/{school_id}")
    public JsonResult checkReportMark(@PathVariable BigDecimal student_id, @PathVariable BigDecimal school_id){
        String re = null;
        //re = MarkService.checkReportMark(student_id,school_id).toString();
        try {
            re = MarkService.checkReportMark(student_id,school_id).toString();
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }

    //4.3 导出学生成绩
    @PostMapping("mark/import_mark")
    public JsonResult importStudentMark(){
        String re = null;
        //re = MarkService.setReportMark(exp_id,student_id,school_id,mark);
        try {
            //re = MarkService.checkReportMark()
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }
}
