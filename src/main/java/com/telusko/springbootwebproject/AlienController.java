package com.telusko.springbootwebproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlienController {
    @Autowired
    AlienRepo repo;
    @RequestMapping("/")
    public String home(){
        return "home.jsp";
    }
@RequestMapping("/addAlien")
    public String addAlen(Alien alien){
        repo.save(alien);
        return "home.jsp";
    }

}
