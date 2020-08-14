package controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

public class ConvertController {
    @GetMapping("/")
    public String showConverterForm() {
        return "index";
    }

    @PostMapping("/result")
    public String convert(@RequestParam double usd, @RequestParam double rate, Model model) {
        model.addAttribute("usd", usd);
        model.addAttribute("rate", rate);
        double vnd = usd * rate;
        model.addAttribute("vnd", vnd);
        return "index";
    }
}
