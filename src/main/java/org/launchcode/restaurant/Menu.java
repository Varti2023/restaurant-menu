package org.launchcode.restaurant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(LocalDate d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addItems(MenuItem newItem){
        String message = "Item already exist!";
        if(items.contains(newItem)){
            System.out.println(message);
            return;
        }
        items.add(newItem);
        lastUpdated = LocalDate.now();
    }

    public void removeItems(MenuItem deleteItem){

        items.remove(deleteItem);
        lastUpdated = LocalDate.now();
    }

    //custom toString method()
    @Override
    public String toString(){
        StringBuilder appetizers =  new StringBuilder();
        for(MenuItem item : items){
            if(item.getCategory().equals("Appetizer")){
                appetizers.append("\n").append(item).append("\n");
            }
        } StringBuilder mainCourse =  new StringBuilder();
        for(MenuItem item : items){
            if(item.getCategory().equals("Main Course")){
                mainCourse.append("\n").append(item).append("\n");
            }
        } StringBuilder dessert =  new StringBuilder();
        for(MenuItem item : items){
            if(item.getCategory().equals("Dessert")){
                dessert.append("\n").append(item).append("\n");
            }
        }
        return "\n---------Restaurant Menu--------\n"+ "APPETIZERS\n" +appetizers.toString()+ "\n"+
                "MAIN COURSE\n" +mainCourse.toString() +"\n"+
                "DESSERT\n"+ dessert.toString() +"\n";
    }



}
