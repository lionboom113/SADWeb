package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import Entity.ExamEntity;

@Controller
public class ExamController {
    
    public String examView() {
		RestTemplate restTemplate = new RestTemplate();
        ExamEntity[] exams	= restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", ExamEntity[].class);
        return "index";
    }
	@RequestMapping(value="exam-create",method = RequestMethod.GET)
    public String createExam() {
        return "create-exam";
    }
	@RequestMapping(value="exam-list",method = RequestMethod.GET)
    public String listExam() {
        return "list-exam";
    }
    
}
