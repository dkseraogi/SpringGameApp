package com.dk.beans;

import org.springframework.stereotype.Component;
import com.dk.interfaces.Team;

@Component
public class RajasthanRoyals implements Team{

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

//    RajasthanRoyals(String name){
//        this.setName(name);
//    }

}
