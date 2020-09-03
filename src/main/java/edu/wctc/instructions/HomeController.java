package edu.wctc.instructions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
}
