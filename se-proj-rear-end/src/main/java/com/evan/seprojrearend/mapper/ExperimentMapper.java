package com.evan.seprojrearend.mapper;

import com.alibaba.fastjson.JSONObject;
import com.evan.seprojrearend.po.Experiment;
import com.evan.seprojrearend.po.ExperimentExample;
import com.evan.seprojrearend.po.ExperimentKey;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExperimentMapper {
    long countByExample(ExperimentExample example);

    int deleteByExample(ExperimentExample example);

    int deleteByPrimaryKey(ExperimentKey key);

    int insert(Experiment record);

    int insertSelective(Experiment record);

    List<Experiment> selectByExampleWithBLOBs(ExperimentExample example);

    List<Experiment> selectByExample(ExperimentExample example);

    List<JSONObject> selectExperimentInfo(@Param("experimentId") BigDecimal experimentId, @Param("studentId") BigDecimal studentId, @Param("schoolId") BigDecimal schoolId);

    Experiment selectByPrimaryKey(ExperimentKey key);

    int updateByExampleSelective(@Param("record") Experiment record, @Param("example") ExperimentExample example);

    int updateByExampleWithBLOBs(@Param("record") Experiment record, @Param("example") ExperimentExample example);

    int updateByExample(@Param("record") Experiment record, @Param("example") ExperimentExample example);

    int updateByPrimaryKeySelective(Experiment record);

    int updateByPrimaryKeyWithBLOBs(Experiment record);

    int updateByPrimaryKey(Experiment record);
}