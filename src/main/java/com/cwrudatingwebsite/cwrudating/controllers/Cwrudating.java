package com.cwrudatingwebsite.cwrudating.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cwrudatingwebsite.Account;

@Controller
public class Cwrudating {
    
    //renders login page
    @RequestMapping("/login")
    public ModelAndView firstPage(){
        return new ModelAndView("index");
    }

    //returns information from login form and redirects to dashboard page
    @PostMapping("/processForm")
    public ModelAndView processForm(@ModelAttribute Account user, Model model){
        model.addAttribute("username", user.getUsername());
        return new ModelAndView("dashboard");
    }

    //renders the register page
    @RequestMapping("/register")
    public ModelAndView secondPage(){
        return new ModelAndView("register");
    }

    //renders the questionnaire page
    @RequestMapping("/questionnaire")
    public ModelAndView thirdPage(){
        return new ModelAndView("questionnaire");
    }
}