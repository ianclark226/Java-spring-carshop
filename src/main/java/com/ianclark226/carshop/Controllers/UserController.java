package com.ianclark226.carshop.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/users")
    public String getModel() {
        return "user";
    }
}
