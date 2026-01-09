package com.example.petshop;

import java.util.Date;

public class Scorpian extends Pet {

    public Scorpian (String name){
        super(name);
    }
    public Scorpian (String name, Date birthDate){
        super(name , birthDate);
    }

    @Override
    public String speak() {
        return "hiss";
    }
    }
