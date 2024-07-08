package projects.project_2;

import java.util.Scanner;

public class MusicBoxTest {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Music Box");
        System.out.println("Please select your genre, we have Classical, Country, and Pop genres");
        System.out.println("Please type one of the above genres, if need to exit, type exit or anything");

        String genre = scanner.nextLine();


        if (genre.equalsIgnoreCase("pop") || genre.equalsIgnoreCase("country") || genre.equalsIgnoreCase("classical")) {

            switch (genre.toLowerCase()) {

                case "pop":
                    System.out.println("Bad Guy, Talk, Please Me, 7 Rings, Without Me");
                    break;

                case "country":
                    System.out.println("Meant to Be, Heaven, Simple, One Number Away, Get Along");
                    break;
                case "classical":
                    System.out.println("Four Seasons, Fur Elise, Finlandia, Vocalize, The Planet");
                    break;

            }

            System.out.println("Which song would you like to listen?");

            String song = scanner.nextLine();
            boolean validSong = false;

            switch (genre.toLowerCase()) {

                case "pop":
                    switch (song.toLowerCase()) {
                        case "bad guy":
                        case "talk":
                        case "please me":
                        case "7 rings":
                        case "without me":
                            validSong = true;
                            break;
                    }
                    break;
                case "country":
                    switch (song.toLowerCase()) {
                        case "meant to be":
                        case "heaven":
                        case "simple":
                        case "one number away":
                        case "get along":
                            validSong = true;
                            break;
                    }
                    break;

                case "classical":
                    switch (song.toLowerCase()) {
                        case "four seasons":
                        case "fur elise":
                        case "finlandia":
                        case "vocalize":
                        case "the planet":
                            validSong = true;
                            break;
                    }
                    break;

            }

            if (validSong) {

                int songPrice;

                switch (genre.toLowerCase()) {

                    case "pop":
                        songPrice = 2;
                        break;
                    case "classical":
                        songPrice = 4;
                        break;
                    case "country":
                        songPrice = 5;
                        break;
                    default:
                        songPrice = 0;

                }
                System.out.println("Please enter $" + songPrice + " to listen to " + song.toUpperCase());
                int enteredAmount = scanner.nextInt();

                if (enteredAmount == songPrice) {
                    System.out.println("Please enjoy listening to " + song.toUpperCase());
                } else if (enteredAmount < songPrice) {

                    System.out.println("The amount you entered is not enough, application is closing bye bye.");

                } else if (enteredAmount > songPrice) {
                    int change = enteredAmount - songPrice;
                    System.out.println("You have entered $" + change + " more. Please wait for your change");
                    System.out.println("Please enjoy listening to " + song.toUpperCase());
                }


            } else {
                System.out.println("Invalid song. Application is closing");

            }


        } else {
            System.out.println("Invalid genre entry. Application is closing");
        }


    }
}
