package com.ianclark226.carshop.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SupplierController {

    @GetMapping("/suppliers")
    public String getModel() {
        return "supplier";
    }
}
