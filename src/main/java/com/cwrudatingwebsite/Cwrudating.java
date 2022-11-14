package com.cwrudatingwebsite;

import org.springframework.beans.factory.annotation.Autowired;
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

    //renders login page
    @GetMapping("/login")
    public ModelAndView firstPage(@ModelAttribute Account account, Model model){
        model.addAttribute("username", account.getUsername());
        return new ModelAndView("login");
    }

    //renders the register page
    @RequestMapping("/register")
    public ModelAndView secondPage(Model model){
        model.addAttribute("account", new Account(null, null, null, null, null));
        return new ModelAndView("register");
    }
    
    //password encryption
    @PostMapping("/process_register")
    public ModelAndView processRegisteration(@ModelAttribute Account account){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(account.getPassword());
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
    public ModelAndView fourthPage(@ModelAttribute Account account, Model model){
        model.addAttribute("account", account);
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