package com.ethan.springbootaspact.acpact;

import jdk.nashorn.internal.ir.JoinPredecessor;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.hibernate.validator.constraints.Mod11Check;
import org.springframework.stereotype.Component;

/**
 * @Author: ethan.liu
 * @Date: 2020/5/12 14:50
 *
 * ProceedingJoinPoint 支持环绕切面，可以动态调用目标方法,其他的几个切面只需要用到joinpoint
 */
@Aspect
@Component
public class LoggerAnnotaion {
    @Pointcut("execution(* com.ethan.springbootaspact.services..*.*(..))")
    public void pointcut(){}

    @Before("pointcut()")
    public void before(JoinPoint joinPoint){
        System.out.println("before"+joinPoint.getSignature());
        System.out.println("before");
    }


    @After("pointcut()")
    public void after(){
        System.out.println("after");
    }

    @AfterReturning(value="pointcut()",returning = "retVal")
    public void returning(Object retVal){
        System.out.println("AfterReturning");
    }
    @Around("pointcut()")
    public void around(ProceedingJoinPoint joinPredecessor){
        try {
            System.out.println("方法名称："+joinPredecessor.getSignature());
            joinPredecessor.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }


    }

}
