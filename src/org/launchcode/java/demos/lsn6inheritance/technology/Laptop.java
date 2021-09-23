package org.launchcode.java.demos.lsn6inheritance.technology;

public class Laptop extends Computer {
    private int batteryHour;
    public Laptop(String OS, int RAM, double price, int hour){
        super(OS, RAM, price);
        batteryHour = hour;
    }

    public boolean isBatteryStaysLong(){
        return batteryHour > 10;
    }

    public int getBatteryHour() {
        return batteryHour;
    }

    public void setBatteryHour(int batteryHour) {
        this.batteryHour = batteryHour;
    }
}
