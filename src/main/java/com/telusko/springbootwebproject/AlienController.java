package com.telusko.springbootwebproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
public class AlienController {
    @Autowired
    AlienRepo repo;
    @RequestMapping("/")
    public String home(){
        return "home.jsp";
    }
@PostMapping(value = "/alien")
    public Alien  addAlien( Alien alien){
        repo.save(alien);
        return alien;
    }
    @DeleteMapping("/alien/{aid}")
    public String  deleteAlien(@PathVariable int aid){
        Alien a = repo.getOne(aid);

        repo.delete(a);

        return "Deleted";
    }

    @GetMapping(path="/aliens",produces = {"application/xml"})

    public List<Alien> getAlens(){
       return repo.findAll();

    }

    @PutMapping(path = "/alien")
    public Alien  saveUpdateAlien( @RequestBody Alien alien) {
        repo.save(alien);
        return alien;
    }
    @RequestMapping("/alien/{aid}")

    public Optional<Alien> getAlen(@PathVariable("aid")int aid){
        return repo.findById(aid);

    }

}
