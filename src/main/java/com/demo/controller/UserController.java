package com.demo.controller;

import com.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@RequestMapping("/user")
@Controller
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/userlist")
    public String name(Model model){
        String name = userService.getUserDOById(1).getUsername();
        model.addAttribute("user",name);
        return "user/userlist";
    }
}
