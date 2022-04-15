package com.example.assigment3;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;


public class BeanFunctions implements Serializable {
    Date date;

    public void BeanFunctions() {
        date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public String get_Time() {
        date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        return "Current time is : " + formatter.format(getDate());
    }


    public String get_Date() {
        date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return "Current date is: " + formatter.format(getDate());
    }
}
