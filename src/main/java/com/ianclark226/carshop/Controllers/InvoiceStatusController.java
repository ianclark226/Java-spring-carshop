package com.ianclark226.carshop.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvoiceStatusController {

    @GetMapping("/employee-status")
    public String getModel() {
        return "invoice-status";
    }
}
