package com.evan.seprojrearend.mapper;

import com.evan.seprojrearend.po.SysSchoolMesExample;
import com.evan.seprojrearend.po.SysSchoolMesKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysSchoolMesMapper {
    long countByExample(SysSchoolMesExample example);

    int deleteByExample(SysSchoolMesExample example);

    int deleteByPrimaryKey(SysSchoolMesKey key);

    int insert(SysSchoolMesKey record);

    int insertSelective(SysSchoolMesKey record);

    List<SysSchoolMesKey> selectByExample(SysSchoolMesExample example);

    int updateByExampleSelective(@Param("record") SysSchoolMesKey record, @Param("example") SysSchoolMesExample example);

    int updateByExample(@Param("record") SysSchoolMesKey record, @Param("example") SysSchoolMesExample example);
}