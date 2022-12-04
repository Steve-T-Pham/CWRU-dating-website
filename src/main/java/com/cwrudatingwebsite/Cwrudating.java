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
import java.util.*;



@Controller
public class Cwrudating {
    
    @Autowired
    private AccountRepository repo;

    //test method *has no functionality atm*
    @RequestMapping("/resource")
    public void home(@AuthenticationPrincipal Account user) {
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }

    //renders login page
    @GetMapping("")
    public ModelAndView firstPage(){
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
     public ModelAndView thirdPage(Model model){
         Questionnaire questionnaire = new Questionnaire();
         model.addAttribute("questionnaire", questionnaire);
         List<String> listMajor = Arrays.asList("Developer", "Tester", "Architect");
        model.addAttribute("listMajor", listMajor);
         return new ModelAndView("questionnaire");
     }
 
     @PostMapping("/process_questionnaire")
     public ModelAndView processQuestionnaire(@ModelAttribute Questionnaire questionnaire){
         return new ModelAndView("test");
     }

    //renders dashboard page
    @GetMapping("/dashboard")
    public ModelAndView fourthPage(){
        return new ModelAndView("dashboard");
    }

    //renders profile page
    @GetMapping("/profile")
    public ModelAndView fifthPage(@ModelAttribute Account account, Model model){
        model.addAttribute("account", account);
        return new ModelAndView("profile");
    }
}