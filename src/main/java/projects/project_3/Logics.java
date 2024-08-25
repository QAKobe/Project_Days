package projects.project_3;

import java.util.*;

public class Logics {


    public static void main(String[] args) {

        // Reverse a string

        String name = "Kubanych";

        String reversed = "";
        for (int i = name.length() - 1; i >= 0; i--) {

            reversed += name.charAt(i);

        }
        System.out.println(reversed);

        // reverse a number

        int number = 9876543;

        int rev = 0;

        while (number != 0) {

            int remainder = number % 10;

            rev = rev * 10 + remainder;

            number = number / 10;

        }
        System.out.println(rev);

        // Swap strings

        String str1 = "hello";
        String str2 = "world";

        System.out.println(str1 + " " + str2 + " <- before swapping");

        str1 = str1 + str2;

        str2 = str1.substring(0, str1.length() - str2.length());

        str1 = str1.substring(str2.length());

        System.out.println(str1 + " " + str2 + " <- after swapping");

        // print the alphabet

        for (char i = 'a'; i < 'z'; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        // fibonacci
        int fibonacci = 10;
        int num1 = 0;
        int num2 = 1;
        for (int i = 0; i < fibonacci; i++) {


            System.out.print(num1 + " ");
            int sum = num1 + num2;

            num1 = num2;
            num2 = sum;

        }
        System.out.println();
        // print letters on an even number

        String word = "kubanych";

        for (int i = 0; i < word.length(); i++) {

            if (i % 2 == 0){
                System.out.println(name.charAt(i));
            }

        }

        //sort an arrray
//        int [] array = {9,8,7,6,5,4,3};
//
//        for (int i = 0; i < array.length; i++) {
//
//            int temp = 0;
//
//            for (int j = i+1; j < array.length; j++) {
//
//
//                if (array[i] > array[j]){
//                    temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//
//            }
//
//        }
//        System.out.println(Arrays.toString(array));

        // print string of arrays in reverse

        String[] wordsInArray = {"apple", "banana", "orange"};

        for (int i = 0; i < wordsInArray.length; i++) {

            String reversedWord = "";

            for (int j = wordsInArray[i].length()-1; j >=0 ; j--) {

                reversedWord += wordsInArray[i].charAt(j);

            }
            System.out.println(reversedWord);
        }

        // largest and smallest number in an array
        int [] numbers = {3,4,5,6,7,8,9};

        int largest = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > largest){
                largest = numbers[i];
            }

        }

        int smallest = largest;

        for (int num :numbers){

            if (num < smallest){
                smallest = num;
            }

        }
        System.out.println(smallest);


        int [] array = {9,8,7,6,5,4,3,-50};
        for (int j = 0; j < array.length; j++) {

            for (int i = 0; i < array.length - 1; i++) {

                if (array[i] > array[i +1]) {
                    int num = array[i];
                    array[i] = array[i+1];
                    array[i+1] = num;
                }

            }

        }

        System.out.println(Arrays.toString(array));
        System.out.println("Hello LeetCoder");
//this was question
        List<Integer> input1 = Arrays.asList(1, 4, 2, 3,4);
        List<Integer> input2 = Arrays.asList(5, 4, 6, 7);


// solution is below
        Set<Integer> set1 = new HashSet<>(input1);
        Set<Integer> set2 = new HashSet<>(input2);

        // Find intersection
        set1.retainAll(set2);

        // Convert the result to a list and print
        List<Integer> result = new ArrayList<>(set1);
        System.out.println("Intersection: " + result);
    }




    }


