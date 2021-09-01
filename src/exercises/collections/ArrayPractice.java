package exercises.collections;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {

        //#1.Create and initialize the array
        int[] arr = {1, 1, 2, 3, 5, 8};

        //#2.Loop through the array and print each value
        for (int i : arr) {
            //modify to print only the odd numbers
            if (i % 2 != 0) {
                System.out.println((i));
            }
        }

        String str = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        //#3.Use the split method to divide the string and store in array
        String[] strSpace = str.split(" ");

        //#4. Print the arrays of words
        System.out.println(Arrays.toString(strSpace));

        //#5. Use other delimiter to separate the sentence
        String[] strFullStop = str.split("\\.");
        System.out.println(Arrays.toString(strFullStop));


    }
}
