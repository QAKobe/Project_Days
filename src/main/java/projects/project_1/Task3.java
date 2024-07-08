package projects.project_1;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double oneInch = 0.0254;

        double input = scanner.nextDouble();

        double meter = input * oneInch;

        System.out.println(input + " inch is " + meter + " meters");






    }

}
