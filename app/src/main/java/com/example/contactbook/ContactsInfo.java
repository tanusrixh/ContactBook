package com.example.contactbook;

import java.util.ArrayList;
import java.util.Date;

public class ContactsInfo {
    public static ArrayList<ContactsInfo> contacts = new ArrayList<>();

    private int id;
    private String fName;
    private String lName;
    private String number;
    private String email;
    private Date dates;

    public ContactsInfo(int id, String fName, String lName, String number, String email, Date dates){
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.number = number;
        this.email = email;
        this.dates = dates;
    }
    public ContactsInfo(int id, String fName, String lName, String number, String email){
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.number = number;
        this.email = email;
        this.dates = null;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getFName(){
        return this.fName;
    }

    public void setFName(String fName){
        this.fName = fName;
    }

    public String getLName(){
        return this.lName;
    }

    public void setLName(String lName){
        this.lName = lName;
    }

    public String getNumber(){
        return this.number;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public Date getDates(){
        return this.dates;
    }

    public void setDates(Date date){
        this.dates = date;
    }
}
