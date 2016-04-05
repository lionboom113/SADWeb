package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class AuthenticationController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String login() {
        return "login";
    }
    @RequestMapping(method = RequestMethod.POST)
    public String checkLogin() {
        return "login";
    }
    
}
