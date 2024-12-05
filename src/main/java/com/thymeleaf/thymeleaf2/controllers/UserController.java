package com.thymeleaf.thymeleaf2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.thymeleaf.thymeleaf2.domain.User;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @GetMapping("selection-expression")
    public String selectionExpression(Model modelo) {
        User user = new User(1, "Ramesh", "ramesh@gmail.com", "125");
        modelo.addAttribute("user", user);
        return "selection/index";
    }

    @GetMapping("message-expression")
    public String getMethodName(Model model) {
        return "message/index";
    }

}
