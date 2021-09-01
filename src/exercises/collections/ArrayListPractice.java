package exercises.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //#1.List with at least 10 integers
        ArrayList<Integer> intList = new ArrayList<>(List.of(1, 4, 8, 34, 9, 13, 7, 0, -5, 15, 33));
        System.out.println(intList);
        //#1.Calling the sum method and print
        System.out.println("Sum of even numbers: " + sumOfEven(intList));

        //#3 Prompt the user to enter the word length for the search
        System.out.println("Enter the word length for search: ");
        int wordLength = input.nextInt();

        //#4.Convert string to ArrayList
        String str = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(str.split(" ")));
        for (String s : wordList) {
            System.out.println(s);
        }
    }

    //Static method to sum all even number in ArrayList
    public static int sumOfEven(ArrayList<Integer> listNum) {
        int sum = 0;
        for (int num : listNum) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    //#2. Static method to print each word that has exactly 5 letters
    public static void printWord(ArrayList<String> strArrayList) {
        for (String word : strArrayList) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }
}
