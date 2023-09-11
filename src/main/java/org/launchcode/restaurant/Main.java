package org.launchcode.restaurant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

	// write your code here
      //  ArrayList<MenuItem> menuItems = new ArrayList<>();
        Menu menu = new Menu(LocalDate.now(), new ArrayList<MenuItem>());

        menu.getItems().add(new MenuItem(10,"Pizza", "Main Course"));
        menu.getItems().add(new MenuItem(5,"Fritters", "Appetizer"));
        menu.getItems().add(new MenuItem(10,"Ice cream", "Dessert"));
        menu.getItems().add(new MenuItem(10,"Veggies", "Appetizer"));

        //printing the first item
        System.out.println("First item in menu is :"+menu.getItems().get(0).getDescription());
        //printing the menu
        System.out.println("\nItems in menu are:");
        System.out.println(menu);
        System.out.println("********************************");
        //adding items in menu and printing the new menu.
        menu.addItems(new MenuItem(15,"Caramel Custard", "Dessert"));
        menu.addItems(new MenuItem(10,"Burrito Bowl", "Main Course"));
        menu.addItems(new MenuItem(10,"Burrito Bowl", "Main Course"));
        System.out.println(menu);

        System.out.println("********************************");
        //removing items for menu and printing the new menu.
        menu.removeItems(menu.getItems().get(0));
        menu.removeItems(menu.getItems().get(3));
        System.out.println(menu);

        //test override equals method.

        MenuItem item1 = menu.getItems().get(0);
        MenuItem item2 = menu.getItems().get(1);
        System.out.println("\nComparing items using equals method: ");
        System.out.println(item1.equals(item2));


        System.out.println("\nMenu last updates on :" + menu.getLastUpdated());
        }

}
