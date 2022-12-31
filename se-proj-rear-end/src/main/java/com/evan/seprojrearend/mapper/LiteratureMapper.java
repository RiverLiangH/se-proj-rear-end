package com.evan.seprojrearend.mapper;

import com.alibaba.fastjson.JSONObject;
import com.evan.seprojrearend.po.Literature;
import com.evan.seprojrearend.po.LiteratureExample;
import com.evan.seprojrearend.po.LiteratureKey;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LiteratureMapper {
    long countByExample(LiteratureExample example);

    int deleteByExample(LiteratureExample example);

    int deleteByPrimaryKey(LiteratureKey key);

    int insert(Literature record);

    int insertSelective(Literature record);

    List<Literature> selectByExample(LiteratureExample example);

    Literature selectByPrimaryKey(LiteratureKey key);

    List<JSONObject> selectLiteratureList(@Param("experimentId") BigDecimal experimentId,@Param("schoolId") BigDecimal schoolId);

    List<JSONObject> selectLiteratureUrl(@Param("literatureId") BigDecimal literatureId,@Param("schoolId") BigDecimal schoolId);

    int updateByExampleSelective(@Param("record") Literature record, @Param("example") LiteratureExample example);

    int updateByExample(@Param("record") Literature record, @Param("example") LiteratureExample example);

    int updateByPrimaryKeySelective(Literature record);

    int updateByPrimaryKey(Literature record);
}