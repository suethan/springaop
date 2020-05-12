package com.ethan.springbootaspact.control;

import com.ethan.springbootaspact.services.serviceimpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ethan.liu
 * @Date: 2020/5/12 15:24
 */
@RestController
@RequestMapping("user")
public class TestController {
    @Autowired
    UserServiceImpl userService;
    @GetMapping("test")
    public String test(){
        userService.get();
        return "123";
    }
}
