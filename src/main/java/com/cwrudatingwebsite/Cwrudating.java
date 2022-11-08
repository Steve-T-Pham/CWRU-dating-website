package com.cwrudatingwebsite;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Cwrudating {
    
    @Autowired
    private AccountRepository repo;

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
    public ModelAndView secondPage(Model model){
        model.addAttribute("user", new Account(null, null, null, null, null));
        return new ModelAndView("register");
    }
  
    
    @PostMapping("/process_register")
    public ModelAndView processRegisteration(@ModelAttribute Account user){
        repo.save(user);
        return new ModelAndView("index");
    }

    //renders the questionnaire page
    @RequestMapping("/questionnaire")
    public ModelAndView thirdPage(){
        return new ModelAndView("questionnaire");
    }

    //broken at the moment *for showing all members*
    @GetMapping("/list_accounts")
    public ModelAndView viewAccounts(Model model){
        List<Account> listAccount = repo.findAll();
        model.addAttribute("listAccount", listAccount);
        return new ModelAndView("accounts");
    }
}