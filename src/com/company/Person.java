package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Date dateOfBirth;
    String name;
    String gender;
    int age;
    boolean isMarried;
    public Person(String name, int age, String gender, String dateOfBirth, boolean married) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isMarried = married;
        try{
            this.dateOfBirth = sdf.parse(dateOfBirth);
        } catch(ParseException exc) {
            exc.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public boolean isMarried() {
        return isMarried;
    }

}
