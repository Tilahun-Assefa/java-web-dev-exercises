package exercises.datatypes;

import java.util.Scanner;

public class GasConsumption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Miles driven: ");
        double numMiles = input.nextDouble();
        System.out.print("Gas amount: ");
        double numGallons = input.nextDouble();

        double mpg = numMiles/numGallons;
        System.out.println("Your car gas consumption per miles is : " + mpg + " miles per gallon");
    }
}
