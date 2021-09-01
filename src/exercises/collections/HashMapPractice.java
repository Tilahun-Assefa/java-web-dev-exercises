package exercises.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args){
        //#1. Take and store student name and ID number
        //initialize the students HashMap
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudentName;

        System.out.println("Enter student ID /orEnter to finish");

        //Get student ID and name
        do{
            System.out.print("Student Name: ");
            newStudentName = input.nextLine();
            if(!newStudentName.equals("")){
                System.out.print("ID: ");
                int newStudentID = input.nextInt();
                students.put(newStudentID,newStudentName );
                input.nextLine();
            }
        }while(!newStudentName.equals(""));

        //Printing the HashMap collection
        System.out.println("\nStudent Information:");
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("ID: " + student.getKey() + " Name: " + student.getValue());
        }

        //Printing the number of students
        System.out.println("Number of students are " + students.size());
    }
}
