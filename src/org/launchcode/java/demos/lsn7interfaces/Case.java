package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Case {
    private ArrayList<Flavor> flavors = new ArrayList<>();
    private ArrayList<Cone> cones = new ArrayList<>();
    private ArrayList<Topping> toppings= new ArrayList<>();

    public Case(){
        Cone cone1 = new Cone("Waffle", 1.25, new ArrayList<>(Arrays.asList( "gluten")));
        Cone cone2 = new Cone("Sugar", 0.75, new ArrayList<>(Arrays.asList( "gluten")));
        Cone cone3 = new Cone("Wafer", 0.50, new ArrayList<>(Arrays.asList( "gluten")));
        Cone cone4 = new Cone("Bowl", 0.05, new ArrayList<>(List.of("none")));
        cones.add(cone1);
        cones.add(cone2);
        cones.add(cone3);
        cones.add(cone4);

        Flavor flavor1 = new Flavor("Vanilla", 0.75, new ArrayList<>(Arrays.asList( "dairy")));
        Flavor flavor2 = new Flavor("Chocolate", 0.75, new ArrayList<>(Arrays.asList( "dairy")));
        Flavor flavor3 = new Flavor("Red Velvet", 0.85, new ArrayList<>(Arrays.asList( "dairy", "red #5")));
        Flavor flavor4 = new Flavor("Rocky Road", 0.85, new ArrayList<>(Arrays.asList( "dairy", "nuts", "gelatin")));
        Flavor flavor5 = new Flavor("Strawberry Sorbet", 0.50, new ArrayList<>(Arrays.asList( "strawberry")));
        flavors.add(flavor1);
        flavors.add(flavor2);
        flavors.add(flavor3);
        flavors.add(flavor4);
        flavors.add(flavor5);

        Topping hotFudge = new Topping("Hot Fudge", 2.14, new ArrayList<>(Arrays.asList("Sugar", "Nonfat Milk",  "Corn Syrup", "Soybean Oil", "Cocoa")));
        Topping sprinkles = new Topping("Sprinkles", 1.14, new ArrayList<>(Arrays.asList("corn syrup", "sugar", "cornstarch", "wax", "artificial flavors", "colors")));
        Topping caramel = new Topping("Caramel", .90, new ArrayList<>(Arrays.asList("Corn Syrup", "Sugar", "Nonfat Milk", "Soybean Oil")));
        Topping oreos = new Topping("Oreos", 0.75, new ArrayList<>(Arrays.asList("Milk", "Heavy Cream", "White Sugar", "Salt", "Oreo Cookies")));
        toppings.add(hotFudge);
        toppings.add(sprinkles);
        toppings.add(caramel);
        toppings.add(oreos);
    }

    public ArrayList<Flavor> getFlavors() {
        return flavors;
    }

    public ArrayList<Cone> getCones() {
        return cones;
    }

    public void setFlavors(ArrayList<Flavor> flavors) {
        this.flavors = flavors;
    }

    public void setCones(ArrayList<Cone> cones) {
        this.cones = cones;
    }

    public ArrayList<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<Topping> toppings) {
        this.toppings = toppings;
    }
}
