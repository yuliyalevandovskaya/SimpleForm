package com.julia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Julia on 4/12/2017.
 */
@Controller
public class MyController {

    @RequestMapping("/")
    public String test()
    {
        return "welcome";
    }
}
