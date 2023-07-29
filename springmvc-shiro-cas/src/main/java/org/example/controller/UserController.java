package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/user/index")
    public String userIndex() {
        return "/WEB-INF/user.jsp";
    }
}
