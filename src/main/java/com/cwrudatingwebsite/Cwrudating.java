package com.cwrudatingwebsite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
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

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller

public class Cwrudating {


    @Autowired
    private AccountRepository repo;
   @Autowired
   private CustomAccountDetailsService customAccountDetailsService;
    @Autowired
    private QuestionnaireRepository questionnaireRepository;
    @Autowired
    private QuestionnaireService questionnaireService;

<<<<<<< HEAD
    @Autowired
    private MatchesRepository repo2;

    @GetMapping("/login")
=======

    private List<String> usernameMatchList;


    //test method *has no functionality atm*
    @RequestMapping("/resource")
    public void home(@AuthenticationPrincipal Account user) {
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }

    //renders login page
    @GetMapping("")
>>>>>>> ce842d8169d0314bfd712a85a5a9618376c91452
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
        ModelAndView modelAndView=new ModelAndView();
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(account.getPassword());
        account.setPassword(encodedPassword);
        repo.save(account);

        return new ModelAndView("login");
    }

<<<<<<< HEAD
    @RequestMapping("/prefQuestionnaire")
    public ModelAndView hiddenPage(Model model){
        prefQuestionnaire prefQuestionnaire = new prefQuestionnaire();
        model.addAttribute("prefQuestionnaire", prefQuestionnaire);
        return new ModelAndView("prefQuestionnaire");
    }

    @PostMapping("/process_prefQuestionnaire")
    public ModelAndView processPrefQuestionnaire(@ModelAttribute prefQuestionnaire prefQuestionnaire){
        return new ModelAndView("process_prefQuestionnaire");
    }
    
=======
>>>>>>> ce842d8169d0314bfd712a85a5a9618376c91452
     //renders the questionnaire page
     @RequestMapping("/questionnaire")
     public ModelAndView thirdPage(Model model,@ModelAttribute Questionnaire questionnaire) throws SQLException {
        String currentUser=getCurrentUser();
         List<Questionnaire> usernameList=questionnaireRepository.findByUsername(currentUser);
        // System.out.println(usernameList.get(0).getUsername());
       //  System.out.println(usernameList.get(0).getSex());
         if(usernameList.size()>0) {
           /*  List<Questionnaire> questionnaireList=questionnaireRepository.findAll();
             List<String> matchList = questionnaireService.findMatch(questionnaireList,usernameList.get(0));
             model.addAttribute("MatchedUsernames",matchList);
              System.out.println("The model attribute is "+model.getAttribute("MatchedUsernames"));
             //return new ModelAndView("UserExists");*/
             return new ModelAndView("redirect:/matching");
         }
         model.addAttribute("questionnaire", questionnaire);
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
        System.out.println("Questionnaire Username "+questionnaire.getUsername());

         return new ModelAndView("questionnaire");
     }

    @PostMapping("/process_questionnaire")
    public ModelAndView processQuestionnaire(@ModelAttribute Questionnaire questionnaire,Model model){
        String currentUserName=getCurrentUser();
        questionnaire.setUsername(currentUserName);
        List<Questionnaire> questionnaireList=questionnaireRepository.findAll();
        List<String> matchList = questionnaireService.findMatch(questionnaireList,questionnaire);
       // model.addAttribute("MatchedUsernames",matchList);
        questionnaireRepository.save(questionnaire);
       // return new ModelAndView("test");
        return new ModelAndView("redirect:/matching");
    }

    @GetMapping("/matching")
    public ModelAndView matchPage(Model model)
    {
        String currentUser = getCurrentUser();
        List<Questionnaire> usernameList = questionnaireRepository.findByUsername(currentUser);
        List<Questionnaire> questionnaireList = questionnaireRepository.findAll();

        // Find the matching usernames and store them in the usernameMatchList variable
        usernameMatchList = questionnaireService.findMatch(questionnaireList, usernameList.get(0));

        // Retrieve the Account objects for the matching usernames
        List<Account> matchedUsernames = new ArrayList<>();
        for (String username : usernameMatchList) {
            Account account = repo.findByUsername(username);
            matchedUsernames.add(account);
        }

        // Add the matched usernames to the model
        model.addAttribute("MatchedUsernames", matchedUsernames);
        return new ModelAndView("match");
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

    public String getCurrentUser(){
        String currentUserName="";
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            currentUserName = authentication.getName();
            System.out.println("The current user logged in is "+currentUserName);
        }
        return currentUserName;

    }

}