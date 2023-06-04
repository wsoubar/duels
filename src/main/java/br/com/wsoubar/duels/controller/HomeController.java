package br.com.wsoubar.duels.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    
    @RequestMapping("/")
    public String start() {
        System.out.println("start.....");
        return "index";
    }

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("user", "Wagner Barbosa");
        System.out.println("home.....");
        return "home/home";
    }

}
