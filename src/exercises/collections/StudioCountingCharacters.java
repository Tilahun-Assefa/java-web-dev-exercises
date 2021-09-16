package exercises.collections;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Character.*;

public class StudioCountingCharacters {
    public static void main(String[] args) {
        HashMap<Character, Integer> myCountChar = new HashMap<>();
        Scanner input = new Scanner(System.in);
        //Sample string to count characters
        String sentence = "If the product of two terms is zero then common sense says at least one of the two terms has " +
                "to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into" +
                " a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, " +
                "it’s pretty straightforward from there.";

        //Prompt the user to enter string to count characters
        System.out.println("Please enter the string to count characters: ");
        String newString = "";
        try {
            //the file to be opened for reading
            FileInputStream fis = new FileInputStream("src/exercises/collections/Demo.txt");
            Scanner sc = new Scanner(fis);    //file to be scanned
            //returns true if there is another line to read
            while (sc.hasNextLine()) {
//                System.out.println(sc.nextLine());      //returns the line that was skipped
                newString += sc.nextLine();
            }
            sc.close();     //closes the scanner
            System.out.println(newString);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Converting string to array of character and make case-insensitive
        char[] characterInString = newString.toLowerCase().toCharArray();

        //Filling the character count HashMap
        for (char c : characterInString) {
           if (isLetterOrDigit(c) && !myCountChar.containsKey(c)) {
                myCountChar.put(c, 1);
            } else if(isLetterOrDigit(c)){
                int count = myCountChar.get(c) + 1;
                myCountChar.put(c, count);
            }
        }

        //Print the character and its count
        for (Map.Entry<Character, Integer> myChar : myCountChar.entrySet()) {
            System.out.println(myChar.getKey() + ": " + myChar.getValue());
        }
    }
}
