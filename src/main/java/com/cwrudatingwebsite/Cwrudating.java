package com.cwrudatingwebsite;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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


    @RequestMapping("/resource")
    public void home(@AuthenticationPrincipal Account user) {
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }

    //renders login page
    @GetMapping("")
    public ModelAndView firstPage(){
        return new ModelAndView("login");
    }

    /*returns information from login form and redirects to dashboard page
    @PostMapping("/processForm")
    public ModelAndView processForm(@ModelAttribute Account user, Model model){
        model.addAttribute("username", user.getUsername());
        return new ModelAndView("dashboard");
    }
    */
    
    //renders the register page
    @RequestMapping("/register")
    public ModelAndView secondPage(Model model){
        model.addAttribute("account", new Account());
        return new ModelAndView("register");
    }
    
    //password encryption
    @PostMapping("/process_register")
    public ModelAndView processRegisteration(@ModelAttribute Account account, Model model){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(account.getPassword());
        model.addAttribute("account", account);
		account.setPassword(encodedPassword);
        repo.save(account);
        return new ModelAndView("login");
    }

    //renders the questionnaire page
    @RequestMapping("/questionnaire")
    public ModelAndView thirdPage(){
        return new ModelAndView("questionnaire");
    }

    @GetMapping("/dashboard")
    public ModelAndView fourthPage(){
        return new ModelAndView("dashboard");
    }

    @GetMapping("/profile")
    public ModelAndView fifthPage(@ModelAttribute Account account, Model model){
        model.addAttribute("account", account);
        return new ModelAndView("profile");
    }

    /* 
    //broken at the moment *for showing all members*
    @GetMapping("/list_accounts")
    public ModelAndView viewAccounts(Model model){
        List<Account> listAccount = repo.findAll();
        model.addAttribute("listAccount", listAccount);
        return new ModelAndView("accounts");
    }*/
}