package exercises.datatypes;

import java.util.Scanner;

public class SearchWord {
    public static void main(String[] args){
        String aliceSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word:");
        String searchWord = input.nextLine().toLowerCase();

        int index = aliceSentence.indexOf(searchWord);
        int length = searchWord.length();

        System.out.println("Your word is " + length + " characters long and first found at index " + index);

        String modifiedSentence = aliceSentence.replace(searchWord, "");
        System.out.println(modifiedSentence);
    }
}
