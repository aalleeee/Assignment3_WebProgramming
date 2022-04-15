package com.example.assigment3;

import java.io.IOException;
import java.io.Serializable;

public class BeanMotOfTheDay implements Serializable {
    String mote_of_the_day = "Innovation distinguishes between a leader and a follower.";

    public void BeanMotOfTheDay() {
    }


    public String getMote_of_the_day() throws IOException {
        return mote_of_the_day;
    }

    public void setMote_of_the_day(String mote_of_the_day) {
        this.mote_of_the_day = mote_of_the_day;
    }


}
