package com.me.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagesController {

    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("name", "Infosys Technologies");
        model.addAttribute("YoutubeChannel", "code with Rahul");
        model.addAttribute("Github", "https://github.com/VSrihub");
        System.out.println("home page");

        return "home";
        
    }

    @RequestMapping("/about")
    public String aboutPage(){
        System.out.println("ABout");
        return "about";
    }

    @RequestMapping("/service")
    public String servicePage(){
        System.out.println("service");
        return "service";
    }
    

}
