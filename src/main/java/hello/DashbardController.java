package hello;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import Entity.ExamEntity;
import Utils.ConstantManager;

@Controller
public class DashbardController {
    
    @RequestMapping("/index")
    public String index(Model model) {
    	RestTemplate restTemplate = new RestTemplate();
//        ExamEntity[] exams	= restTemplate.getForObject(ConstantManager.API_ADDR+"/exams", ExamEntity[].class);
        ArrayList<ExamEntity> examsTop = new ArrayList<ExamEntity>();
        ExamEntity a = new ExamEntity();
        a.setName("C#");
        examsTop.add(a);
        ExamEntity b = new ExamEntity();
        b.setName("日本語");
        examsTop.add(b);
        model.addAttribute("TopExam", examsTop);
        return "index-content";
    }
    
}
