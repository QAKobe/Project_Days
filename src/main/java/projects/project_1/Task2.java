package projects.project_1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double myCurrency = 0.011;

        int dollar = scanner.nextInt();

        double conversion =dollar * myCurrency;

        System.out.println(conversion);


    }
}
