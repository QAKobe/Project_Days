package projects.project_1;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Quarters: ");
        int quarters = input.nextInt();
        System.out.print("Dimes: ");
        int dimes = input.nextInt();
        System.out.print("Nickels: ");
        int nickels = input.nextInt();
        System.out.print("Pennies: ");
        int pennies = input.nextInt();
        input.close();


        int totalCents = quarters * 25 + dimes * 10 + nickels * 5 + pennies;


        double totalDollars = (double) totalCents / 100;


        System.out.println("The total in dollars is " + totalDollars);

    }
}
