package com.sunyard.backsystem.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController {

    @RequestMapping("/main")
    public String main(){
        return "main";
    }

    @RequestMapping("/index")
    public ModelAndView index(){
    	ModelAndView modelAndView = new ModelAndView("Navside");
        return modelAndView;
    }
}
