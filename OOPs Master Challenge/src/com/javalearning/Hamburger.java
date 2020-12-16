package com.javalearning;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double getAddition1Price;

    private String addition2Name;
    private double getAddition2Price;

    private String addition3Name;
    private double getAddition3Price;

    private String addition4Name;
    private double getAddition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addAddition1(String name, double price){
        this.addition1Name = name;
        this.getAddition1Price = price;
    }

    public void addAddition2(String name, double price){
        this.addition2Name = name;
        this.getAddition2Price = price;
    }

    public void addAddition3(String name, double price){
        this.addition3Name = name;
        this.getAddition3Price = price;
    }

    public void addAddition4(String name, double price){
        this.addition4Name = name;
        this.getAddition4Price = price;
    }

    public double totalHamburgerPrice() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " +
                this.breadRollType + " roll with " + this.meat + " price is " + this.price);

        if(this.addition1Name != null){
            hamburgerPrice += this.getAddition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " +
                    this.getAddition1Price);
        }

        if(this.addition2Name != null){
            hamburgerPrice += this.getAddition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " +
                    this.getAddition2Price);
        }

        if(this.addition3Name != null){
            hamburgerPrice += this.getAddition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " +
                    this.getAddition3Price);
        }

        if(this.addition4Name != null){
            hamburgerPrice += this.getAddition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " +
                    this.getAddition4Price);
        }
        return hamburgerPrice;
    }


}
