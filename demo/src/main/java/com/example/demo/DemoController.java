package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class DemoController {
    @GetMapping
    public String index(Model model) {
        model.addAttribute("user", new User("Alice", 15));

        Map<String, String> capitalsOfTheWorld = new HashMap<>();
        capitalsOfTheWorld.put("Belgium", "Brussels");
        capitalsOfTheWorld.put("The Netherlands", "Amsterdam");
        model.addAttribute("capitalsOfTheWorld", capitalsOfTheWorld);

        List<Vehicle> vehiclesList = List.of(new Vehicle("Tesla Model S"));
        model.addAttribute("vehiclesList", vehiclesList);

        Car car = new Car("Tesla", "Model 3", "Electric", "Red");
        model.addAttribute("car", car);

        model.addAttribute("searchTerm", "Spring Boot");
        model.addAttribute("index", 1);
        model.addAttribute("userId", "user123");
        model.addAttribute("totalPrice", 50000);
        model.addAttribute("username", "Bob");
        model.addAttribute("languages", List.of(new Language("English"), new Language("French")));
        model.addAttribute("title", "dashboard.title");

        return "index";
    }
}
