package com.evan.seprojrearend.po;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;

import java.math.BigDecimal;
@Data
public class SecInfoExcel {
    @ExcelProperty("SEC_ID")
    @ColumnWidth(20)
    private BigDecimal secId;

    @ExcelProperty("STUDENT_ID")
    @ColumnWidth(20)
    private BigDecimal studentId;

}
