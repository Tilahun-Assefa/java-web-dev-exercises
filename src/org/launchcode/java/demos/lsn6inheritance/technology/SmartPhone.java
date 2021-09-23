package org.launchcode.java.demos.lsn6inheritance.technology;

import java.util.Objects;

public class SmartPhone extends Computer {
    private String carrierNetwork;

    public SmartPhone(String OS, int ram, double price, String carrierNetwork) {
        super(OS, ram, price);
        this.carrierNetwork = carrierNetwork;
    }
    public void changeCarrierNetwork(String location){
        if(Objects.equals(location, "Kansas")){
            carrierNetwork = "Verizon";
        }else {
            carrierNetwork = "T-Mobile";
        }
    }

    public String getCarrierNetwork() {
        return carrierNetwork;
    }

    public void setCarrierNetwork(String carrierNetwork) {
        this.carrierNetwork = carrierNetwork;
    }
}
