package com.ccst.endserver.vo;

import com.ccst.endserver.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author liufuping
 * @Date 2023/11/28 8:20
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageVo<T> {
    private Integer code;
    private Boolean success;
    private String message;
    private List<T> data;
    private Integer pageTotal;//商品总数量
    private Integer pageIndex;//当前页

    public PageVo(String message, List<T> data, Integer pageTotal, Integer pageIndex) {
        this.code = 200;
        this.success = true;
        this.message = message;
        this.data = data;
        this.pageIndex = pageIndex;
        this.pageTotal = pageTotal;
    }
    public PageVo(String message) {
        this.code = 200;
        this.success = true;
        this.message = message;
    }
}
