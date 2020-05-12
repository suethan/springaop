package com.ethan.aspact;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author: ethan.liu
 * @Date: 2020/5/12 14:50
 */
@Aspect
@Component
public class LoggerAnnotaion {
    @Pointcut("execution(* com.ethan.services..*.*(..))")
    public void pointcut(){}

    @Before("pointcut()")
    public void before(){
        System.out.println("before");
    }


    @After("pointcut()")
    public void after(){
        System.out.println("after");
    }

    @AfterReturning(value="pointcut()",returning = "retVal")
    public void returning(Object retVal){
        System.out.println("after");
    }

}
