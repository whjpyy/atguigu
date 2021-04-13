package com.atguigu.config;

import com.atguigu.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;


@ComponentScan(value = "com.atguigu", excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class, Service.class})
})
//@ComponentScan(value = "com.atguigu", useDefaultFilters = false, includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class, Service.class})
//})
/**
 * 主配置类
 *
 * @author 陈友增
 * @date 2021/4/13
 */
@Configuration
@ComponentScan(value = "com.atguigu", excludeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class, Service.class})
//        @ComponentScan.Filter(type = FilterType.CUSTOM, value = {MyTypeFilter.class})
})
public class MainConfig {

    @Bean
    public Person person() {
        return new Person("chen", 31);
    }
}
