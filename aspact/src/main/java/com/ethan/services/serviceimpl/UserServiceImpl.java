package com.ethan.services.serviceimpl;

import com.ethan.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Author: ethan.liu
 * @Date: 2020/5/12 09:57
 */
public class UserServiceImpl implements UserService {
    public String add(String test) {
        System.out.println("user===add");
        return "456";

    }
    public String get() {
        System.out.println("user===get");
        return "test";
    }

    public void printThrowException() {
        throw new IllegalArgumentException();
    }

    public static void main(String args[]){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beansannotation.xml");
        UserService student = (UserService) context.getBean("userService");
        student.get();

       // student.printThrowException();
    }
}
