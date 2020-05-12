package com.ethan.aspact;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Author: ethan.liu
 * @Date: 2020/5/12 10:00
 */
public class Logger {
    //之前
    public void beforeAdvice(){
        System.out.println("beforeAdvice.");
    }
    //之后
    public void afterAdvice(){
        System.out.println("afterAdvice.");
    }

    //返回 这里的返回值是方法的返回值
    public void afterReturningAdvice(Object retVal){
        System.out.println("Returning:" +retVal.toString() );
    }
    public void around(final ProceedingJoinPoint joinPoint){
        try {
            System.out.println("执行方法之前");
            joinPoint.proceed();
            System.out.println("执行方法之后");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
    //异常
    public void AfterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("Exception: " + ex.toString());
    }
}
