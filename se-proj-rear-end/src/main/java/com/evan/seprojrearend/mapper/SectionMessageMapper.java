package com.evan.seprojrearend.mapper;

import com.evan.seprojrearend.po.SectionMessageExample;
import com.evan.seprojrearend.po.SectionMessageKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SectionMessageMapper {
    long countByExample(SectionMessageExample example);

    int deleteByExample(SectionMessageExample example);

    int deleteByPrimaryKey(SectionMessageKey key);

    int insert(SectionMessageKey record);

    int insertSelective(SectionMessageKey record);

    List<SectionMessageKey> selectByExample(SectionMessageExample example);

    int updateByExampleSelective(@Param("record") SectionMessageKey record, @Param("example") SectionMessageExample example);

    int updateByExample(@Param("record") SectionMessageKey record, @Param("example") SectionMessageExample example);
}