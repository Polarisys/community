package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @anthor sily
 * @date 2020/2/10 - 15:17
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
