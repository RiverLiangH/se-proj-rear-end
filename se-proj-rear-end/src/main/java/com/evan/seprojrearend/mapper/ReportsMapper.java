package com.evan.seprojrearend.mapper;

import com.evan.seprojrearend.po.Reports;
import com.evan.seprojrearend.po.ReportsExample;
import com.evan.seprojrearend.po.ReportsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReportsMapper {
    long countByExample(ReportsExample example);

    int deleteByExample(ReportsExample example);

    int deleteByPrimaryKey(ReportsKey key);

    int insert(Reports record);

    int insertSelective(Reports record);

    List<Reports> selectByExample(ReportsExample example);

    Reports selectByPrimaryKey(ReportsKey key);

    int updateByExampleSelective(@Param("record") Reports record, @Param("example") ReportsExample example);

    int updateByExample(@Param("record") Reports record, @Param("example") ReportsExample example);

    int updateByPrimaryKeySelective(Reports record);

    int updateByPrimaryKey(Reports record);
}