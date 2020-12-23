package com.javalearning;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("HDFC bank");

        bank.addBranch("Punjab");

        bank.addCustomer("Punjab","Rakesh",5500.0);
        bank.addCustomer("Punjab","Sam",5000.0);
        bank.addCustomer("Punjab","Sid",4500.0);

        bank.addBranch("Bangalore");

        bank.addCustomer("Bangalore","Jojo",5400.0);

        bank.addCustomerTransaction("Punjab","Rakesh",10000);
        bank.addCustomerTransaction("Punjab","Rakesh",12000);
        bank.addCustomerTransaction("Punjab","Rakesh",3500);

        bank.listCustomers("Punjab",true);
        bank.listCustomers("Karnataka ",true);

        if(!bank.addCustomer("Goa","Tim",4500.0)) {
            System.out.println("Error Goa branch does not exist");
        }

        bank.addBranch("Goa");
        if(!bank.addCustomer("Goa","Tim",4500.0)) {
            System.out.println("Error Goa branch does not exist");
        }
        bank.listCustomers("Goa",false);

        if(!bank.addBranch("Goa")) {
            System.out.println("Goa branch already exists");
        }

        if(!bank.addCustomerTransaction("Goa","Jim",4500)) {
            System.out.println("Customer does not exist in branch");
        }
    }
}