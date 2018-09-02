package com.hendisantika.springbooti18n.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-thymeleaf-i18n
 * User: anuradha
 * Email: anuranasinghe151@gmail.com
 * LinkedIn: linkedin.com/in/anuradha-ranasinghe-0031a9135/
 * Date: 02/09/18
 **/
@Controller
public class InternationalController {
    @RequestMapping(value = "/international", method= RequestMethod.GET)
    public String international() {
        return "international";
    }

    //redirect to demo if user hits the root
    @RequestMapping("/")
    public String home(Model model) {
        return "redirect:international";
    }
}
