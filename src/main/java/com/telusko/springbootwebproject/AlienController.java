package com.telusko.springbootwebproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping("/aliens")
    @ResponseBody
    public String getAlens(){
       return repo.findAll().toString();
//        System.out.println(repo.findByTech("Java"));
//        System.out.println(repo.findByAidGreaterThan(256));
//        System.out.println(repo.findByTechSorted("Java"));
//        mv.addObject(alien);
//        return mv;
    }

    @RequestMapping("/alien/{aid}")
    @ResponseBody
    public String getAlen(@PathVariable("aid")int aid){
        return repo.findById(aid).toString();

    }

}
