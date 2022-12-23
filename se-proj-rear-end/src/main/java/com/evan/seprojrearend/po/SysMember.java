package com.evan.seprojrearend.po;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class SysMember {
    /**
     * EasyExcel使用：导出时忽略该字段
     */
    /*
    @ExcelIgnore
    private Integer id;
     */

    @ExcelProperty("ID")
    @ColumnWidth(20)
    private BigDecimal Id;

    @ExcelProperty("NAME")
    @ColumnWidth(20)
    private String name;

    @ExcelProperty("MAIL")
    @ColumnWidth(20)
    private String mail;
}
