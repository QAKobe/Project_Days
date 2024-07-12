package projects.project_5;

import java.util.*;

public class DataStructures {

    /*
        1. Create a method that separates numbers from a string.
        For example, given the input "12dsd%^", the method should separate the string into
        numbers, letters, and special characters, and store them in a list.

        2. Create a method that accepts a string as a parameter, prints the frequency of each letter in the order of their appearance,
           and prints the most occurred letter along with its count.
            ex. "kubaa" --> k=1
                           u=1
                           b=1
                           a=2
            hence, my method should return above letters AND a=2
        3. Create a method that sorts a list of integers and returns the sorted list. You cannot use any other interfaces except List.

        4. Find duplicates from an array using the Set interface and print only the duplicates.

        5.Create a Vehicles class, have your constructor declared along with instance variables and connect with them via constructor
            in Vehicles Class declare:
                1. make, model, madeIn, year, mileage
                2. Constructor and map it with your instances variables
                3. Declare your getter and setters
                4.
            in DataStructures class create multiple objects out of that class and provide data into parameters
            now write a logic, to group up data. For instance, if years for all vehicles are in 2000, print a list of vehicles that fall under 2000
               -> 2000 = [Mercedes, BMW, Jeep]
     */

    // Task 1

    public static void fixTheString(String string) {

        List<String> list = new ArrayList<>();
        String letters = "";
        String numbers = "";
        String specialChars = "";
        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z' || string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {

                letters += string.charAt(i);


            } else if (string.charAt(i) >= '0' && string.charAt(i) <= '9') {

                numbers += string.charAt(i);


            } else {
                specialChars += string.charAt(i);

            }

        }
        list.add(letters);
        list.add(numbers);
        list.add(specialChars);
        System.out.println(list);

    }

    //Task 2
    public static void countLetters(String text) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            if (!map.containsKey(text.charAt(i))) {
                map.put(text.charAt(i), 1);
            } else {
                map.put(text.charAt(i), map.get(text.charAt(i)) + 1);
            }
        }
        System.out.println(map);
        int maxValue = 0;
        char mostOccured = ' ';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                mostOccured = entry.getKey();
                maxValue = entry.getValue();
            }
        }
        System.out.println("Most occurred letter is --> " + mostOccured + ":" + maxValue);
    }

    // Task 3
    public static void sortList(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            int temp = 0;
            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(i) > list.get(j)) {

                    temp = list.get(i);

                    list.set(i, list.get(j));
                    list.set(j, temp);

                }

            }

        }
        System.out.println("Sorted List Interface " + list);

    }

    // Task 4
    public static Set<Integer> findDuplicates(int[] nums) {
//        Set<Integer> numbers = new HashSet<>();
//        Set<Integer> duplicates = new HashSet<>();
//
//        for (int num : nums) {
//            if (!numbers.add(num)) {
//                duplicates.add(num);
//            }
//        }
//
//        return duplicates;

        Set<Integer> numbers = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : nums) {
            if (numbers.contains(num)) {
                duplicates.add(num);
            } else {
                numbers.add(num);
            }
        }

        return duplicates;
    }

    // Task 5

    public static void groupByYear(List<Vehicles> cars) {
        // Group by year
        Map<Integer, List<Vehicles>> vehicleYear = new HashMap<>();

        for (Vehicles car : cars) {
            int year = car.getYear();
            if (!vehicleYear.containsKey(year)) {
                vehicleYear.put(year, new ArrayList<>());
            }
            vehicleYear.get(year).add(car);
        }


        for (Map.Entry<Integer, List<Vehicles>> entry : vehicleYear.entrySet()) {

            System.out.println("Year " + entry.getKey() + ":" + entry.getValue());

        }

    }

    public static void groupByMiles(List<Vehicles> cars){

        Map<Integer, List<Vehicles>> vehicleByMileage = new HashMap<>();

        for (Vehicles car: cars){
            int mileage = car.getMileage();
            if (!vehicleByMileage.containsKey(mileage)){

                vehicleByMileage.put(mileage, new ArrayList<>());

            }

            vehicleByMileage.get(mileage).add(car);
        }

       for (Map.Entry<Integer, List<Vehicles>> entry: vehicleByMileage.entrySet()){

           if (entry.getKey() <1000 && entry.getKey() > 500){
               System.out.println("Mileages " + entry.getKey() + ":" + entry.getValue());
           }

       }

    }

    public static void main(String[] args) {

        // Task 1

        String name = "kuuubaa";

        countLetters(name);

        List<Integer> list = Arrays.asList(9, 7, 6, 5, 4, 4, 3, 2, 1);

        sortList(list);

        int[] arrays = {1, 2, 3, 4, 5, 5, 5, 6, 6, 1, 1};
        System.out.println(findDuplicates(arrays) + " duplicates here");
        String str = "123%$#$%dgfgASDF4355ASFS";
        fixTheString(str);


        Vehicles mercedes = new Vehicles("Merc", "GLE", "Germany", 2000, 700);
        Vehicles bmw = new Vehicles("BMW", "M5", "Germany", 2000, 600);
        Vehicles toyota = new Vehicles("Toyota", "Camry", "Japan", 2000, 500);
        Vehicles porsche = new Vehicles("Porsche", "Cayenne GTS", "Germany", 2024, 0);
        Vehicles jeep = new Vehicles("Jeep", "TrackHawk", "USA", 2021, 100);

        List<Vehicles> cars = new ArrayList<>();
        cars.add(mercedes);
        cars.add(bmw);
        cars.add(toyota);
        cars.add(porsche);
        cars.add(jeep);

        groupByYear(cars);
        groupByMiles(cars);

    }

}
