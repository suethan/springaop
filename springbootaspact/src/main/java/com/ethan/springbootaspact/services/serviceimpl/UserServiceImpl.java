package com.ethan.springbootaspact.services.serviceimpl;

import com.ethan.springbootaspact.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @Author: ethan.liu
 * @Date: 2020/5/12 09:57
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String add(String test) {
        System.out.println("user===add");
        return "456";

    }
    @Override
    public String get() {
        System.out.println("user===get");
        return "test";
    }

    @Override
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
