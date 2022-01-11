package basics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int change, itemPrice, quarters, dimes, nickles, pennies;

        System.out.println("Enter price in cents:");
        itemPrice = scan.nextInt();

        if (itemPrice<25 || itemPrice>100 || itemPrice%5 !=0){
            System.out.println("Invalid Price!");
        }else {
            change = 100 - itemPrice;
            quarters = change /5;

            int remainingCentsAfterQuarter = change % 25;
            dimes = remainingCentsAfterQuarter /5;
            int remainingCentsAfterDimes = remainingCentsAfterQuarter % 10;
            nickles = remainingCentsAfterDimes / 5;

            System.out.println("Your change is "+quarters+ " quarters, "+dimes+ " dimes, and "+nickles+ " nickles, and" + "");
        }






    }
}