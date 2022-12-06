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
         personalQuestionnaire personalQuestionnaire = new personalQuestionnaire();
         model.addAttribute("personalQuestionnaire", personalQuestionnaire);
         List<String> listMajor = Arrays.asList("Accountancy", "Accounting", "Architect", "Aerospace Engineering", 
         "Ancient Near Eastern and Egyptian Studies", "Anesthesia", "Anthropology", "Applied Mathematics", 
         "Art Education", "Art History and Museum Studies", "Art History", "Asian Studies", "Astronomy", 
         "Biochemistry", "Bioethics and Medical Humanities", "Bioethics", "Biology", 
         "Biomedical and Health Informatics", "Business Administration", "Business Analytics and Intelligence", 
         "Biomedical Engineering", "Chemical Biology", "Chemistry", "Chinese", "Civil Engineering", "Classics", 
         "Cognitive Science", "Computer Engineering", "Dance", "Computer Science", "Dance", 
         "Data Science and Analytics", "Economics", "Electrical Engineering", "Engineering Physics", "English", 
         "Evolutionary Biology", "Environmental Geology", "Environmental Studies", "French", "General Engineering",
         "Geological Science", "German", "Gerontological Studies", "History and Philosophy of Science", 
         "International Studies", "Japanese Studies", "Material Science and Engineering", "Mathematics and Physics", 
         "Mathematics", "Military Ethics", "Music Education", "Music", "Natural Sciences", "Neuroscience", "Nursing", 
         "Nutrition", "Nutritional Biochemistry and Metabolism", "Origins Science", "Philosophy", "Physics", 
         "Political Science", "Polymer Science and Engineering", "Religious Studies", "Sociology", "Spanish", "Statistics", 
         "Systems and Control Engineering", "Systems Biology", "Teacher Education", "Theater Arts", "Women's and Gender Studies", 
         "World Literature", "Others");
        model.addAttribute("listMajor", listMajor);
         return new ModelAndView("questionnaire");
     }
 
     @PostMapping("/process_questionnaire")
     public ModelAndView processQuestionnaire(@ModelAttribute personalQuestionnaire personalQuestionnaire){
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