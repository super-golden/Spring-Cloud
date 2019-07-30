package com.boot.demo;

import com.boot.demo.aop.TargetClass;
import com.boot.demo.pojo.SMS;
import com.boot.demo.util.SpringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootDemoApplicationTests {

    @Autowired
    SMS sm;

    @Test
    public void contextLoads() {

        System.out.println(sm.getRetryLimitationMinutes());

        System.out.println(sm.getVaildityMinute());

        System.out.println(sm.getTypes());
    }

    @Autowired
    SpringUtil springUtil;

    @Test
    public void testAop(){



        ApplicationContext ctx = springUtil.getApplicationContext();

        TargetClass targetClass = (TargetClass) ctx.getBean("targetClass");

        //3、使用bean
        String result = targetClass.joint("spring","aop");
        System.out.println("result:" + result);

    }

}
