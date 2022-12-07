package com.cwrudatingwebsite;

import java.util.Map;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.*;



@Controller
public class Cwrudating {
    
    @Autowired
    private AccountRepository repo;

    @Autowired
    private personalQuestionnaireRepository qRepo;

    @GetMapping("/login")
    public ModelAndView firstPage(){
        return new ModelAndView("login");
    }

    @PostMapping("/login")
    public ModelAndView login(Model model){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        Account account = repo.findByUsername(username);

        model.addAttribute("account", account);
        return new ModelAndView("dashboard");
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

     //renders the matches page
     @RequestMapping("/matches")
     public ModelAndView sixthPage(){
         return new ModelAndView("matches");
     }

    @RequestMapping("/prefQuestionnaire")
    public ModelAndView hiddenPage(Model model){
        prefQuestionnaire prefQuestionnaire = new prefQuestionnaire();
        model.addAttribute("prefQuestionnaire", prefQuestionnaire);
        return new ModelAndView("prefQuestionnaire");
    }

    @PostMapping("/process_prefquestionnaire")
    public ModelAndView processPrefQuestionnaire(@ModelAttribute prefQuestionnaire prefQuestionnaire){
        return new ModelAndView("matches");
    }
    
    //renders the questionnaire page
    @GetMapping("/questionnaire")
    public ModelAndView thirdPage(Model model){

        //get current logged in user
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        Account account = repo.findByUsername(username);

        personalQuestionnaire questionnaire = qRepo.findByUsername(account);

        if (questionnaire != null){
            model.addAttribute("gender", questionnaire.getGender());
            model.addAttribute("q1_A", questionnaire.getQ1_A());
            model.addAttribute("q1_A", questionnaire.getQ2_A());
            model.addAttribute("q1_A", questionnaire.getQ3_A());
            model.addAttribute("q1_A", questionnaire.getQ4_A());
            model.addAttribute("q1_A", questionnaire.getQ5_A());
            model.addAttribute("q1_A", questionnaire.getQ6_A());
            model.addAttribute("q1_A", questionnaire.getQ7_A());
            model.addAttribute("q1_A", questionnaire.getQ8_A());
            model.addAttribute("q1_A", questionnaire.getQ9_A());
            model.addAttribute("q1_A", questionnaire.getQ10_A());
            model.addAttribute("q1_A", questionnaire.getQ11_A());
            model.addAttribute("existingQuestionnaire", questionnaire);
        }
        else{
            personalQuestionnaire personalQuestionnaire = new personalQuestionnaire();
            model.addAttribute("newQuestionnaire", personalQuestionnaire);
        }
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

        List<String> genders = Arrays.asList("Male", "Female", "Transwoman", "Transman", "Non-binary");
        model.addAttribute("genders", genders);
        return new ModelAndView("questionnaire");
    }
 
    @RequestMapping(value = "/process_questionnaire", method = RequestMethod.POST) 
    public ModelAndView processQuestionnaire(@RequestParam Map<String, String> radioOptions, @RequestParam String gender){

        //get current logged in user
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        Account account = repo.findByUsername(username);
        personalQuestionnaire personalQuestionnaire = qRepo.findByUsername(account);


        //sets a questionnaire repository binded to the account with the same username
        personalQuestionnaire.setUsername(account);
        personalQuestionnaire.setGender(gender);

        //map over each individual radio option
        for (String question : radioOptions.keySet()){
            String answer = radioOptions.get(question);
            switch(question) {
                case "q1_A":
                    personalQuestionnaire.setQ1_A(answer);
                case "q2_A":
                    personalQuestionnaire.setQ2_A(answer);
                case "q3_A":
                    personalQuestionnaire.setQ3_A(answer);
                case "q4_A":
                    personalQuestionnaire.setQ4_A(answer);
                case "q5_A":
                    personalQuestionnaire.setQ5_A(answer);
                case "q6_A":
                    personalQuestionnaire.setQ6_A(answer);
                case "q7_A":
                    personalQuestionnaire.setQ7_A(answer);
                case "q8_A":
                    personalQuestionnaire.setQ8_A(answer);
                case "q9_A":
                    personalQuestionnaire.setQ9_A(answer);
                case "q10_A":
                    personalQuestionnaire.setQ10_A(answer);
                case "q11_A":
                    personalQuestionnaire.setQ11_A(answer);
                }
        }
        qRepo.save(personalQuestionnaire);
        return new ModelAndView("test");
    }
    
     
    //renders dashboard page
    @GetMapping("/dashboard")
    public ModelAndView fourthPage(Model model){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        Account account = repo.findByUsername(username);

        model.addAttribute("account", account);
        return new ModelAndView("dashboard");
    }

    //renders profile page
    @GetMapping("/profile")
    public ModelAndView fifthPage(Model model){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        Account account = repo.findByUsername(username);

        model.addAttribute("account", account);
        model.addAttribute("bio", account.getBio());
        return new ModelAndView("profile");
    }

    @RequestMapping(value = "/update-bio", method = RequestMethod.POST) 
    public String updateBio(@RequestParam("bio") String bio, Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        // Get the current user's account
        Account account = repo.findByUsername(username);
        model.addAttribute("account", account);
        // Update the bio
        account.setBio(bio);

        // Save the updated account
        repo.save(account);

        return "profile";
    }
    
}