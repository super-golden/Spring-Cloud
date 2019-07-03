package com.zw.antion;


import com.zw.filter.LogFiterAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(LogFiterAutoConfiguration.class)//引入这个配置类
@Documented
public @interface EnableLogFilter {
}
