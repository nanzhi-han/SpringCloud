package com.example.demo.web;

import org.apache.catalina.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: SJH
 * @ClassName: HelloWorldController
 * @Description:
 */
//@RestController的意思就是controller里面的方法都以json格式输出
@RestController
public class HelloWorldController {

    @RequestMapping(value = "hello")
    public String index() {
        return "Hello World";
    }

    @RequestMapping(value = "getuser")
    public SecurityProperties.User getuser() {
        SecurityProperties.User user = new SecurityProperties.User();
        user.setName("55");
        user.setPassword("55");
        return user;
    }

}
