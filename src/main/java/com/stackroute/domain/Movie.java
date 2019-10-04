package com.stackroute.domain;

public class Movie {

    private Actor act;

    public void setAct(Actor act) {
        this.act = act;
    }

    public Movie() {
    }

    public Movie(Actor act) {
        this.act = act;
    }

    public void display(){
        System.out.println(act.name);
        System.out.println(act.gender);
        System.out.println(act.age);
    }
}
