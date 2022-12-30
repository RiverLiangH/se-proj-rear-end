package com.evan.seprojrearend.service;

import com.evan.seprojrearend.po.Literature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class LiteratureService {
    @Autowired
    private final com.evan.seprojrearend.mapper.LiteratureMapper LiteratureMapper;

    public LiteratureService(com.evan.seprojrearend.mapper.LiteratureMapper literatureMapper) {
        LiteratureMapper = literatureMapper;
    }

    //3.1 上传教学资料
    public String upload_literature(String name,Integer exp_id,String literature_url,Integer school_id){
        Literature newLit = new Literature();
        newLit.setExperimentId(BigDecimal.valueOf(exp_id));
        newLit.setAutoIncrementName(name);
        newLit.setLitertureAddress(literature_url);
        newLit.setSchoolId(BigDecimal.valueOf(school_id));
        LiteratureMapper.insertSelective(newLit);
        return "True";
    }

    //3.2 下载教学资料
    public String download_literature(){

        return "True";
    }

}
