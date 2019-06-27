package com.boot.demo;

import com.boot.demo.pojo.SMS;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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

}
