package com.evan.seprojrearend.controller;

import com.evan.seprojrearend.common.JsonResult;
import com.evan.seprojrearend.service.LiteratureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
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
    @PostMapping("literature/download")
    public JsonResult downloadLiterature(){
        String re = null;
        try {
            //re = LiteratureService.upload_literature(name,exp_id,literature_url,school_id);
        }catch (Exception e){
            return JsonResult.isError(10001,"未知错误");
        }
        return JsonResult.isOk(re);
    }

}
