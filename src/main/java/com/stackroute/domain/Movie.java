package com.stackroute.domain;

public class Movie {

    private Actor actor;

    public Movie() {
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void display(){
        System.out.println(actor.getName());
        System.out.println(actor.getGender());
    }
}
