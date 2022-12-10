package com.evan.seprojrearend.mapper;

import com.evan.seprojrearend.po.SectionInfo;
import com.evan.seprojrearend.po.SectionInfoExample;
import com.evan.seprojrearend.po.SectionInfoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SectionInfoMapper {
    long countByExample(SectionInfoExample example);

    int deleteByExample(SectionInfoExample example);

    int deleteByPrimaryKey(SectionInfoKey key);

    int insert(SectionInfo record);

    int insertSelective(SectionInfo record);

    List<SectionInfo> selectByExample(SectionInfoExample example);

    SectionInfo selectByPrimaryKey(SectionInfoKey key);

    int updateByExampleSelective(@Param("record") SectionInfo record, @Param("example") SectionInfoExample example);

    int updateByExample(@Param("record") SectionInfo record, @Param("example") SectionInfoExample example);

    int updateByPrimaryKeySelective(SectionInfo record);

    int updateByPrimaryKey(SectionInfo record);
}