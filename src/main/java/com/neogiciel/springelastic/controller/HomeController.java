package com.neogiciel.springelastic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neogiciel.springelastic.manager.LivreRepository;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;


@Controller
public class HomeController {

    @GetMapping
    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping
    @RequestMapping("/page")
    public String page(Model model) {
        
        model.addAttribute("msg", "Bonjour Patrice");
        return "page";
    }

}


