package com.me.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


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
    public String about(){
        System.out.println("ABout");
        return "about";
    }

    @RequestMapping("/service")
    public String service(){
        System.out.println("service");
        return "service";
    }

    @GetMapping("/contact")
    public String contact( ){
        System.out.println("contact");
        return new String("contact");
    }

    @GetMapping("/login")
    public String login( ){
        System.out.println("login");
        return new String("login");
    }

    @GetMapping("/register")
    public String register(){
        System.out.println("register");
       return  "register";
    }
    
    //processing register
     @RequestMapping(value = "/do-register",method = RequestMethod.POST)
public String processRegister(){

    return "redirect:/register";
}


}
