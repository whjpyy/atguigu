package com.atguigu.bean;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * TODO: 文件注释
 *
 * @author 陈友增
 * @date 2021/4/13
 */
@Data
@AllArgsConstructor
public class Person {

    private String name;
    private Integer age;
}
