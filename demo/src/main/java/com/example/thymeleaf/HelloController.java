package com.example.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: SJH
 * @ClassName: HelloController
 * @Description:
 */
@Controller
public class HelloController {

    @RequestMapping("/login")
    public String index(ModelMap map) {
        map.addAttribute(  "message","http://www.ityouknow.com");
        System.out.println("555");
        return "hello";
    }
}
