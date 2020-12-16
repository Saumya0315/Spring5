package academy.learnprogramming.controller;

import academy.learnprogramming.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Slf4j
@Controller
public class DemoController {

    private DemoService demoService;
    @Autowired
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @ResponseBody
    @GetMapping("/hello")
    public String hello()
    {
        return "hello";
    }

    @GetMapping("welcome")
    public String welcome(@RequestParam String user,@RequestParam String age ,Model model)
    {
        model.addAttribute("userHere",demoService.getHelloMessege(user));
        model.addAttribute("age",age);
        return "welcome";
    }

    @ModelAttribute("messegeUser")
    public String messegeUser()
    {
        log.info("messegeUser called..");
        return demoService.getWelcomeMessege();
    }
}
