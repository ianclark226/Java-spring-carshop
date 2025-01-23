package com.ianclark226.carshop.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleTypeController {

    @GetMapping("/vehicle-types")
    public String getModel() {
        return "vehicle-type";
    }
}
