package com.evan.seprojrearend.mapper;

import com.alibaba.fastjson.JSONObject;
import com.evan.seprojrearend.po.SysSchoolMesExample;
import com.evan.seprojrearend.po.SysSchoolMesKey;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysSchoolMesMapper {
    long countByExample(SysSchoolMesExample example);

    int deleteByExample(SysSchoolMesExample example);

    int deleteByPrimaryKey(SysSchoolMesKey key);

    int insert(SysSchoolMesKey record);

    int insertSelective(SysSchoolMesKey record);

    List<SysSchoolMesKey> selectByExample(SysSchoolMesExample example);

    List<JSONObject> selectUserIsStudent(@Param("email") String email);

    List<JSONObject> selectUserIsTeacher(@Param("email") String email);

    List<JSONObject> selectUserIsAdministrator(@Param("email") String email);

    int updateByExampleSelective(@Param("record") SysSchoolMesKey record, @Param("example") SysSchoolMesExample example);

    int updateByExample(@Param("record") SysSchoolMesKey record, @Param("example") SysSchoolMesExample example);
}