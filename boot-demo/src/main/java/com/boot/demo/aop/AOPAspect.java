package com.boot.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.lang.reflect.Modifier;

/**
 * @Description:
 * @Author:fei-long-zhang
 * @Date:2019/7/30 10:43
 **/

@Component
@Aspect
public class AOPAspect {

    //定义切点
    @Pointcut("execution(* com.boot.demo.aop.*.*(..))")
    public void declareJoinPointExpression() {

    }

    /**
     * 前置方法,在目标方法执行前执行
     *
     * @param joinPoint 封装了代理方法信息的对象,若用不到则可以忽略不写
     */

    @Before("declareJoinPointExpression()")
    public void beforeMethod(JoinPoint joinPoint) {

        System.out.println("目标方法名为：" + joinPoint.getSignature().getName());
        System.out.println("目标方法所属类的简单类名：" + joinPoint.getSignature().getDeclaringType());
        System.out.println("目标方法所属类的类名：" + joinPoint.getSignature().getDeclaringTypeName());
        System.out.println("目标方法声明类型：" + Modifier.toString(joinPoint.getSignature().getModifiers()));
        //方法的参数
        Object[] args = joinPoint.getArgs();
        for (int i = 0; i < args.length; i++) {
            System.out.println("第" + (i + 1) + "个参数为：" + args[i]);
        }

        System.out.println("被代理的对象：" + joinPoint.getTarget());
        System.out.println("代理对象自己：" + joinPoint.getThis());

    }

    @Around("declareJoinPointExpression()")
    public Object aroundMethod(ProceedingJoinPoint point) {
        Object result = null;
        try {
            //前置通知
            System.out.println("目标方法执行前。。。。");
            //用新的参数执行目标方法
            result = point.proceed(new Object[]{"newSpring", "newAop"});
            //返回通知
            System.out.println("目标方法返回结果后。。。。。。");


        } catch (Throwable e) {

            //异常通知
            System.out.println("执行目标方法异常后。。。。");
            throw new RuntimeException(e);
        }

        //后置通知
        System.out.println("目标方法执行后。。。。");

        return result;
    }


}