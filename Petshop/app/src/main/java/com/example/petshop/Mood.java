package com.example.petshop;

import java.util.Date;

public abstract class Mood {

    private Date mdate;
    public Mood() {
        this.date = new Date();
    }
    public Mood(Date mdate){
        this.date = mdate;
    }

    public Date getMdate() {
        return mdate;
    }

    public void setMdate(Date mdate) {
        this.mdate = mdate;
    }
    public abstract String getMood();
}
