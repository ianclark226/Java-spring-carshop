package com.ianclark226.carshop.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleModelController {

    @GetMapping("/vehicle-models")
    public String getModel() {
        return "vehicle-model";
    }
}
