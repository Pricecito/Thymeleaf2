package com.thymeleaf.thymeleaf2.controllers;

import java.util.ArrayList;
import java.util.List;

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
    public String messageExpression(Model model) {
        return "message/index";
    }

    @GetMapping("link-expression")
    public String linkExpression(Model model) {
        model.addAttribute("id", 1);
        return "link/index";
    }

    @GetMapping("fragment-expression")
    public String fragmentExpression() {
        return "fragment/index";
    }

    @GetMapping("iterations")
    public String interations(Model modelo) {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Ramesh", "ramesh@gmail.com", "125"));
        users.add(new User(2, "John", "john@gmail.com", "123"));
        users.add(new User(3, "Mike", "mike@gmail.com", "456"));
        modelo.addAttribute("users", users);
        return "iteration/index";
    }

}
