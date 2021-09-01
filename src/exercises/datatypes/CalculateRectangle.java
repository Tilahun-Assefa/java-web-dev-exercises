package exercises.datatypes;

import java.util.Scanner;

public class CalculateRectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Length: ");
        double length = input.nextDouble();
        System.out.print("Width: ");
        double width = input.nextDouble();

        double area = length*width;
        System.out.println("Area of Rectangle: " + area);
    }
}
