package org.launchcode.java.demos.lsn6inheritance;

import org.launchcode.java.demos.lsn6inheritance.Speech.Greeting;

public class Main {
    public static void main(String[] args) {
        HouseCat garField = new HouseCat("Gar Field", 12);
        System.out.println(garField.isTired());
        garField.eat();
        System.out.println(garField.isTired());

        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());

        Cat plainCat = new Cat(8.6);
        HouseCat cheshireCat =  new HouseCat("Cheshire", 12);
        System.out.println(plainCat.noise());
        System.out.println(cheshireCat.noise());

        Greeting hello = new Greeting("English", "Hi");
        System.out.println( hello.getText());
        ((Greeting)hello).wave();
    }
}
