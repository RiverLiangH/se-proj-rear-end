package com.evan.seprojrearend.controller;

import com.evan.seprojrearend.common.JsonResult;
import com.evan.seprojrearend.service.LiteratureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@CrossOrigin
public class LiteratureController {
    @Autowired
    private LiteratureService LiteratureService;

    public LiteratureController(com.evan.seprojrearend.service.LiteratureService literatureService) {
        LiteratureService = literatureService;
    }

    //3.1 上传教学资料
    @PostMapping("literature/upload/{name}/{exp_id}/{literature_url}/{school_id}")
    public JsonResult uploadLiterature(@PathVariable String name,@PathVariable Integer exp_id,@PathVariable String literature_url,@PathVariable Integer school_id){
        String re = null;
        try {
            re = LiteratureService.upload_literature(name,exp_id,literature_url,school_id);
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }

    //3.2 下载教学资料
    @GetMapping("literature/download/{literature_id}/{school_id}")
    public JsonResult downloadLiterature(@PathVariable BigDecimal literature_id,@PathVariable BigDecimal school_id){
        String re = null;
        re = LiteratureService.download_literature(literature_id,school_id).toString();
        /*
        try {
            re = LiteratureService.download_literature(literature_id,school_id).toString();
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }*/
        return JsonResult.isOk(re);
    }

    //3.3 返回某实验下所有教学资料列表
    @GetMapping("literature/get_literature_list/{experiment_id}/{school_id}")
    public JsonResult getLiteratureList(@PathVariable BigDecimal experiment_id,@PathVariable BigDecimal school_id){
        String re = null;
        try {
            re = LiteratureService.getLiteratureList(experiment_id,school_id).toString();
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }

}
