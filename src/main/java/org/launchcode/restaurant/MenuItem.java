package org.launchcode.restaurant;

import java.security.PublicKey;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private final LocalDate dateAdded;

    public MenuItem(double p, String d, String c) {
        this.price = p;
        this.description = d;
        this.category = c;
        //for current date
        this.dateAdded = LocalDate.now();
        //testing isNew for false
       // this.dateAdded = LocalDate.parse("2022-08-09");
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }



    public double getPrice(){
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDateAdded(){
        return  dateAdded;
    }

    //define instance method isNew()
    boolean isNew(){
        LocalDate today = LocalDate.now();
        double daysBetween = getDateAdded().until(today, ChronoUnit.DAYS);
        return daysBetween<90;
    }

    //custom toString method
    @Override
    public String toString(){
        String newStr = isNew() ? " NEW!" : "";
        if(!description.contains("NEW")) {
            return description = description + newStr;
        }else{
            return description;
        }
    }

    //custom equals method

    public boolean equals(Object toBeCompared){
        if(this == toBeCompared){
            return true;
        }
        if(toBeCompared == null){
            return false;
        }
        if(getClass() != toBeCompared.getClass()){
            return false;
        }
        MenuItem otherItem = (MenuItem) toBeCompared;
        return this.description.equals(otherItem.getDescription());
    }
}
