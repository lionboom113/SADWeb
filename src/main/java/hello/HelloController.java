package hello;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import Entity.ExamEntity;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public ExamEntity[] index() {
    	RestTemplate restTemplate = new RestTemplate();
        ExamEntity[] exams	= restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", ExamEntity[].class);		
        return exams;
    }
    
}
