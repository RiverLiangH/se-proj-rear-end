package com.evan.seprojrearend.mapper;

import com.alibaba.fastjson.JSONObject;
import com.evan.seprojrearend.po.CourSection;
import com.evan.seprojrearend.po.CourSectionExample;
import com.evan.seprojrearend.po.CourSectionKey;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourSectionMapper {
    long countByExample(CourSectionExample example);

    int deleteByExample(CourSectionExample example);

    int deleteByPrimaryKey(CourSectionKey key);

    int insert(CourSection record);

    int insertSelective(CourSection record);

    List<CourSection> selectByExampleWithBLOBs(CourSectionExample example);

    List<CourSection> selectByExample(CourSectionExample example);

    List<JSONObject> selectTakeByTeacherId(@Param("teacherId") BigDecimal teacherId);

    List<JSONObject> selectTakeByStudentId(@Param("studentId")BigDecimal studentId);

    CourSection selectByPrimaryKey(CourSectionKey key);

    int updateByExampleSelective(@Param("record") CourSection record, @Param("example") CourSectionExample example);

    int updateByExampleWithBLOBs(@Param("record") CourSection record, @Param("example") CourSectionExample example);

    int updateByExample(@Param("record") CourSection record, @Param("example") CourSectionExample example);

    int updateByPrimaryKeySelective(CourSection record);

    int updateByPrimaryKeyWithBLOBs(CourSection record);

    int updateByPrimaryKey(CourSection record);
}