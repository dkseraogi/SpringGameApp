package com.dk.beans;
import com.dk.interfaces.Team;
public class Game {

    public Game(Team a, Team b) {
        System.out.println(this.playGame(a,b));
    }

    public String playGame(Team a, Team b){

        return a.getClass()+" is playing with "+b.getClass();
    }
}
