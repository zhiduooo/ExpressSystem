package com.cz.express.controller;


import com.cz.express.service.adminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @Autowired
    private adminService adminservice;

    @RequestMapping("/login")
    public String login(String username,String password){
        System.out.println(username+password);
        Boolean b  = adminservice.selectadmin(username, password);
        if(b){
            return "index";
        }
        else {
            return  "login";
        }

    }
}
