package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", defaultValue = "5") ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Car1");
        messages.add("Car1");
        messages.add("Car1");
        messages.add("Car1");
        model.addAttribute("messages", messages);
        return "cars";
    }
}
