package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashbardController {
    
    @RequestMapping("/index2")
    public String index() {
        return "index";
    }
    
}
