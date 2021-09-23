package org.launchcode.java.demos.lsn6inheritance.technology;

import org.launchcode.java.demos.lsn6inheritance.test.SmartPhoneTest;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args){
        ArrayList<Computer> computers = new ArrayList<>();
        Computer laptop = new Laptop("Window 10",16,841.25,8);
        computers.add(laptop);
        Computer motorola = new SmartPhone("Android 13", 8, 689.99, "Verizon");
        computers.add(motorola);
        Computer dell = new Computer("Window 11", 6, 456.54);
        computers.add(dell);
        Computer mac = new Computer("iOS", 4, 765.54);
        computers.add(mac);
        SmartPhone samsung = new SmartPhone("Android 8", 12,854.36,"T-Mobile");
        computers.add(samsung);
        Laptop hp = new Laptop("Chrome", 4, 253.00,6);
        computers.add(hp);

        for(Computer computer : computers) {
            System.out.println(computer.getItemId()+ ". OS "+ computer.getOperatingSystem() + " RAM "+ computer.getRAM());
        }


    }
}
