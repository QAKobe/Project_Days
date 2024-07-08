package projects.project_1;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your balance: ");
        double balance = input.nextDouble();
        double originalBalance = balance;
        int quarters = (int) (balance / 0.25);
        balance %= 0.25;
        int dimes = (int) (balance / 0.10);
        balance %= 0.10;
        int nickels = (int) (balance / 0.05);
        balance %= 0.05;
        int pennies = (int) (balance / 0.01);
        balance %= 0.01;
        System.out.println("$" + originalBalance + " will make " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies.");

//        Scanner input = new Scanner(System.in);
//
//        // Get input from the user
//        System.out.print("Please enter your balance: $ ");
//        double balance = input.nextDouble();
//        input.close();
//
//        // Convert to cents (add 0.5 for proper rounding)
//        int cents = (int)(balance * 100 + 0.05);
//
//        // Calculate coin counts
//        int quarters = cents / 25;
//        cents = cents - (quarters * 25);   // Update remaining cents
//
//        int dimes = cents / 10;
//        cents = cents - (dimes * 10);      // Update remaining cents
//
//        int nickels = cents / 5;
//        cents = cents - (nickels * 5);     // Update remaining cents
//
//        int pennies = cents;  // Remaining cents are pennies
//
//        // Display the result
//        System.out.println("$" + balance + " will make:");
//        System.out.println(quarters + " quarters");
//        System.out.println(dimes + " dimes");
//        System.out.println(nickels + " nickels");
//        System.out.println(pennies + " pennies");


    }
}
