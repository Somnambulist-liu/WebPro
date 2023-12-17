package com.ccst.endserver.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author liufuping
 * @Date 2023/12/16 15:37
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Page {
    private Integer pageIndex;
    private Integer pageSize;
    private Integer pageTotal;
    private String searchWord;
}
