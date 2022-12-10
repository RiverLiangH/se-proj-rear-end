package com.evan.seprojrearend.service;

import com.evan.seprojrearend.po.Experiment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class LectureService {
    @Autowired
    private com.evan.seprojrearend.mapper.ExperimentMapper ExperimentMapper;

    //2.4 教师发布实验
    public String newExperiment(String exp_name,Integer sec_id,Integer teacher_id,Integer school_id){
        Experiment newExp = new Experiment();
        newExp.setExperimentName(exp_name);
        newExp.setSectionId(BigDecimal.valueOf(sec_id));
        newExp.setTeacherId(BigDecimal.valueOf(teacher_id));
        newExp.setSchoolId(BigDecimal.valueOf(school_id));
        newExp.setIsDeleted(BigDecimal.valueOf(0));
        ExperimentMapper.insert(newExp);
        return "True";
    }
}
