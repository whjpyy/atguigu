package com.atguigu.config;

import com.atguigu.bean.Color;
import com.atguigu.bean.Person;
import com.atguigu.condition.LinuxCondition;
import com.atguigu.condition.MyImportSelector;
import com.atguigu.condition.WindowCondition;
import org.springframework.context.annotation.*;

/**
 * 主配置类
 *
 * @author 陈友增
 * @date 2021/4/13
 */
// 放在类上是统一处理
//@Conditional({WindowCondition.class})
@Configuration
@Import({Color.class, MyImportSelector.class})
public class MainConfig2 {

    /**
     * 单实例(默认)：容器启动时加载
     * 多实例：容器启动时不加载
     * @return
     */
    @Bean
    @Scope(scopeName = "prototype")
    public Person person() {
        System.out.println("给容器中添加person.....");
        return new Person("chen", 31);
    }

    /**
     * @Conditional: 按照一定的条件进行判断，满足条件在容器中注册
     */
    @Bean
    @Conditional({WindowCondition.class})
    public Person bill(){
        return new Person("bill", 11);
    }

    @Bean
    @Conditional({LinuxCondition.class})
    public Person linus(){
        return new Person("linus", 22);
    }

    /**
     * 给容器中注册组件
     * 1）包扫描+组件标注注解 （自己使用）
     * 2) @Bean[导入第三方包里面的组件]
     * 3) @Import 快速导入
     *  1.直接import(类名)， id默认是全类名
     *  2.ImportSelector:返回需要导入的全类名
     */
}
