package org.example;

import java.util.Scanner;

public class AddressBuilder {
    static Scanner input = new Scanner(System.in);

    StringBuilder skills = new StringBuilder();

    public String fullName;
    public String billingStreet;
    public String billingCity;
    public String billingState;
    public String billingZip;
    public String shippingStreet;
    public String shippingCity;
    public String shippingState;
    public  String shippingZip;

    //get the user information

    public void getUser(){
        System.out.println("Please provide the following information: ");

        System.out.println("Full name: ");
        fullName = input.nextLine();

        System.out.println("Billing Street");
        billingStreet = input.nextLine();

        System.out.println("Billing City");
        billingCity = input.nextLine();

        System.out.println("Billing State");
        billingState = input.nextLine();

        System.out.println("Billing Zip");
        billingZip = input.nextLine();

        System.out.println("\n Shipping State");
        shippingStreet = input.nextLine();

        System.out.println("Shipping City ");
        shippingCity = input.nextLine();

        System.out.println("Shipping State ");
        shippingState = input.nextLine();

        System.out.println("Shipping Zip ");
        shippingZip = input.nextLine();
    }
    // Display the user's information

    public void displayUser(){
        skills.append(fullName).append("\n");

        skills.append("Billing Address: \n");
        skills.append(billingStreet).append("\n");
        skills.append(billingCity).append(", ").append(billingState).append(" ").append(billingZip).append("\n");

        skills.append("Shipping Address:\n");
        skills.append(shippingStreet).append("\n");
        skills.append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZip);

        System.out.println(skills);


    }



}
