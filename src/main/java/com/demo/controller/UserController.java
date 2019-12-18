package com.demo.controller;

import com.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Api
@RequestMapping("/user")
@Controller
public class UserController {
    @Resource
    private UserService userService;

    @ApiOperation(value = "get username", notes = "11")
    @GetMapping("/userlist")
    public String name(Model model){
        String name = userService.getUserDOById(1).getUsername();
        model.addAttribute("user",name);
        return "user/userlist";
    }
}
