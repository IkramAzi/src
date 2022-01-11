package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);

        System.out.println("Enter your Full Name");
        String fullName = input.nextLine();

        System.out.println("Enter you Building Number");
        String Building = input.next();

        input.nextLine();

        System.out.println("Enter you street name");
        String streetName = input.nextLine();

        System.out.println("Enter your city name");
        String city = input.nextLine();

        System.out.println("Enter you state");
        String state = input.next();
        input.nextLine();

        System.out.println("Enter your zip code");
       String zipCode = input.next();

        System.out.println("Enter the country Name");
        String county = input.next();

        input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("Building = " + Building);
        System.out.println("streetName = " + streetName);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);
        System.out.println("county = " + county);

        input.close();


    }
}
