package com.example.petshop;

import android.util.Log;

import java.util.Date;

public class Dog extends Pet implements Pettable{

    public Dog (String name){
        super(name);
    }
    public Dog (String name, Date birthDate){
        super(name , birthDate);
    }

    @Override
    public String speak() {
        return "Bark";
    }

    @Override
    public void pet() {
        Log.d("", "pet: ");
    }
}