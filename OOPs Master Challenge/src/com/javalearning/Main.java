package com.javalearning;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        System.out.println();

        Hamburger hamburger = new Hamburger("basic", "Sausage",3.56,"white");
        hamburger.addAddition1("Tomato",0.27);
        hamburger.addAddition2("Lettuce", 0.75);
        hamburger.addAddition3("Cheese", 1.12);
        System.out.println("Total burger price is " + hamburger.totalHamburgerPrice());

        System.out.println();

        HealthyBurger healthyBurger = new HealthyBurger("Bacon" , 5.67);
        healthyBurger.addHealthyAddition1("Carrot" , 0.25);
        healthyBurger.addHealthyAddition2("Egg" , 5.26);
        System.out.println("Total Healthy burger price is " + healthyBurger.totalHamburgerPrice());

        System.out.println();

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addAddition1("Egg",1.75);
        System.out.println("Total Deluxe burger price is " + deluxeBurger.totalHamburgerPrice());
    }
}
