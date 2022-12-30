package com.evan.seprojrearend.service;

import com.evan.seprojrearend.po.Course;
import com.evan.seprojrearend.po.CourseExample;
import com.evan.seprojrearend.po.Reports;
import com.evan.seprojrearend.po.ReportsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class MarkService {
    @Autowired
    private final com.evan.seprojrearend.mapper.ReportsMapper ReportsMapper;

    public MarkService(com.evan.seprojrearend.mapper.ReportsMapper reportsMapper) {
        ReportsMapper = reportsMapper;
    }

    //4.1 批改成绩
    public String setReportMark(Integer exp_id,Integer student_id,Integer school_id,Integer mark){
        //查找需要删除的课程
        ReportsExample findReport = new ReportsExample();
        ReportsExample.Criteria criteria = findReport.createCriteria();
        criteria.andExperimentIdEqualTo(BigDecimal.valueOf(exp_id));
        criteria.andSchoolIdEqualTo(BigDecimal.valueOf(school_id));
        criteria.andStudentIdEqualTo(BigDecimal.valueOf(student_id));

        //修改mark属性
        Reports markRe = new Reports();
        markRe.setMark(BigDecimal.valueOf(mark));
        ReportsMapper.updateByExampleSelective(markRe,findReport);
        return "True";
    }
}
