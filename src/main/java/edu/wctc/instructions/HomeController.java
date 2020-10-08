package edu.wctc.instructions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getHomePage(){
        return "index";
    }

    @RequestMapping("/equipment")
    public String getEquipPage(){return "equipment"; }

    @RequestMapping("/stepOne")
    public String getStepOne(){
        return "stepOne";
    }
    @RequestMapping("/stepTwo")
    public String getStepTwo(){
        return "stepTwo";
    }
    @RequestMapping("/stepThree")
    public String getStepThree(){ return "stepThree";  }
    @RequestMapping("/stepFour")
    public String getStepFour(){
        return "stepFour";
    }
    @RequestMapping("/credits")
    public String getCredits(){ return "credits"; }
    @RequestMapping("/marinara")
    public String getMarinara(){ return "equipment";}
    @RequestMapping("/chicken")
    public String getChicken(){ return "chickenIngredients";}
    @RequestMapping("/benefits")
    public String getBenefits(){ return "benefits";}
    @RequestMapping("/login")
    public String getLogin(){ return "login";}
//    @RequestMapping("/error")
//    public String getError(){ return "error";}
}
