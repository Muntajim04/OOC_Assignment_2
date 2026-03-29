package org.example;

public class FillingStation {
    public void refuel(FuelSupported vehicle){
        vehicle.fillUpWithFuel();
    }

    public void charge(BatterySupported vehicle){
        vehicle.chargeBattery();
    }
}
