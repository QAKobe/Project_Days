package projects.project_1;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        // 1. Get input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();
        input.close();

        // 2. Calculate years and days
        double minutesInYear = 60 * 24 * 365; // Assuming a standard year

        long years = (long) (minutes / minutesInYear);

        int days = (int) ((minutes % minutesInYear) / 60 / 24);

        // 3. Display the result
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");




    }
}
