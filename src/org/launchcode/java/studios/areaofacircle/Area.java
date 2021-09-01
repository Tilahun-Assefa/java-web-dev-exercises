package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        Scanner in = new Scanner(System.in);

        System.out.println("Calculating Circle Area");
        System.out.println("********************************");
        System.out.print("Enter radius: ");
        if(in.hasNextDouble()){
            do {
                radius = in.nextDouble();
                if (radius < 0) {
                    System.out.print("Please enter a positive number: ");
                }
            } while (radius < 0);
            double area = Circle.getArea(radius);
            System.out.println("Area of Circle of radius " + radius + " is " + area);
        }else {
            System.out.println("Wrong input ");
        }
    }
}
