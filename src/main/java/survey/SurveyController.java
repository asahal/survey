package survey;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SurveyControllerController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Survey App!";
    }
    
}