package projects.project_2;

import java.util.Scanner;

public class MusicBox {

    public static void main(String[] args) {


        /*
 create an app that will provide songs based on genres,
 genres are = Classical, Pop, Country
 Under each genre we have 3 songs for each genre
 Classical songs = 'Four Season', 'Fur Elise', 'Finlandia', 'Vocalize', 'The Planet '
 Pop songs = 'Bad Guy', 'Talk', 'Please me', '7 Rings', 'Without me'
 Country songs = 'Meant to be', 'Heaven', 'Simple', 'One Number Away', 'Get Along'

 Application should have exit option available in the beginning
 Application should not throw any exception, meaning no error message in the console.
 If user enters wrong song or wrong genre, app should give proper instruction to correct their way with proper message.
 If the payment is equal to price message should be given and application should ask to listen more songs?
 If payment is less, then user should be notified with proper message and should not play the music
 If the payment is more than the price, the app should give a message with change and music plays


 Prices:
 Pop = $4
 Classic = $2
 Country = $3

 */


        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;  // Flag to track if the user wants to exit

        System.out.println("Hello, This is the Music Box application.");
        System.out.println("Please Enter the music type (Classical, Pop, Country) or type exit to quit.");

        String musicType = scanner.nextLine().trim().toLowerCase();

        if (musicType.equals("exit")) {
            isExit = true;  // Set the flag to true if the user wants to exit
            System.out.println("Exiting application. Bye Bye!");
        } else if (!musicType.equals("classical") && !musicType.equals("pop") && !musicType.equals("country")) {
            System.out.println("Invalid music type. Application is exiting");
            isExit = true;
        }

        if (!isExit) {  // Proceed only if the user hasn't chosen to exit
            System.out.print("Available songs for " + musicType + " music:");

            switch (musicType) {
                case "classical":
                    System.out.println("Four Seasons, Fur Elise, Finlandia, Vocalize, The Planet");
                    break;
                case "pop":
                    System.out.println("Bad Guy, Talk, Please Me, 7 Rings, Without Me");
                    break;
                case "country":
                    System.out.println("Meant to Be, Heaven, Simple, One Number Away, Get Along");
                    break;
            }

            System.out.println("Which song do you want to listen to? Or type exit to quit.");

            String chosenSong = scanner.nextLine().trim().toLowerCase();

            if (chosenSong.equals("exit")) {
                isExit = true;
            } else {
                // Validate song choice
                boolean isValidSong = false;
                switch (musicType) {
                    case "classical":
                        switch (chosenSong) {
                            case "four seasons":
                            case "fur elise":
                            case "finlandia":
                            case "vocalize":
                            case "the planet":
                                isValidSong = true;
                                break;
                        }
                        break;
                    case "pop":
                        switch (chosenSong) {
                            case "bad guy":
                            case "talk":
                            case "please me":
                            case "7 rings":
                            case "without me":
                                isValidSong = true;
                                break;
                        }
                        break;
                    case "country":
                        switch (chosenSong) {
                            case "meant to be":
                            case "heaven":
                            case "simple":
                            case "one number away":
                            case "get along":
                                isValidSong = true;
                                break;
                        }
                        break;

                }
                if (isValidSong) {

                    int songPrice;

                    switch (musicType) {
                        case "classical":
                            songPrice = 2;
                            break;
                        case "pop":
                            songPrice = 4;
                            break;
                        case "country":
                            songPrice = 3;
                            break;
                        default:
                            songPrice = 0;
                    }

                    System.out.println("Please enter $" + songPrice + " dollars for this song:");

                    int enteredAmount = scanner.nextInt();

                    if (enteredAmount < songPrice) {
                        System.out.println("Entered price is not enough. Please try again later.");
                    } else {

                        if (enteredAmount > songPrice) {
                            int change = enteredAmount - songPrice;
                            System.out.println("You have entered $" + change + " more. Please wait for your change.");
                            System.out.println(chosenSong + " is playing. Enjoy the song!");
                        } else {

                            System.out.println(chosenSong + " is playing. Enjoy the song!");

                        }
                    }
                } else {
                    System.out.println("Invalid song choice.");
                    isExit = true;
                }
            }

            scanner.close();

            if (isExit) {
                System.out.println("Exiting application. Bye Bye!");
            }
        }
    }
}







