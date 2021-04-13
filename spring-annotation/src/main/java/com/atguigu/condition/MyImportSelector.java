package com.atguigu.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * TODO: 文件注释
 *
 * @author 陈友增
 * @date 2021/4/13
 */
public class MyImportSelector implements ImportSelector {

    /**
     * 返回值，就是导入到容器中的组件全类名
     * @param importingClassMetadata 当前Import注解类的全信息
     * @return
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.atguigu.bean.Blue"};
    }
}
