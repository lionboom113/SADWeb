package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import Entity.ExamEntity;

@Controller
@RequestMapping("/exam")
public class ExamController {
    
	@RequestMapping(method = RequestMethod.GET)
    public String examView() {
		RestTemplate restTemplate = new RestTemplate();
        ExamEntity[] exams	= restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", ExamEntity[].class);
        return "index";
    }
    
}
