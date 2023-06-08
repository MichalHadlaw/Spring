package com.telusko.springbootwebproject;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {
@Id
    private int aid;
    private String alienName;
    private  String tech;

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAlienName() {
        return alienName;
    }

    public void setAlienName(String alienName) {
        this.alienName = alienName;
    }

    @Override
    public String toString(){
        return "Alien [aid= " + aid + ", alienName= " + alienName + ", alienTech= " + tech +" ]";
    }
}
