package org.launchcode.java.demos.lsn6inheritance.technology;

public class Computer extends AbstractEntity {
    private String operatingSystem;
    private int RAM;
    private double price;
    public Computer(String OS, int ram, double price){
        operatingSystem = OS;
        this.RAM = ram;
        this.price = price;
    }

    public void updatePrice(double percent){
        price *= (percent+1);
    }

    public void updateRAMCapacity(int added){
        RAM += added;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
