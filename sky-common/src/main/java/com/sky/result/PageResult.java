package com.sky.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 封装分页查询结果
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageResult implements Serializable {
//    分页查询：总记录数=页数*每页记录数，数据集合为封装好的对象集合
    private long total; //总记录数

    private List records; //当前页数据集合

}
