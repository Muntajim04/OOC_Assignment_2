package org.example;

public class ElectricCar extends Vehicle implements BatterySupported {
    private static final int BATTERY_FULL = 100;
    private int batteryLevel;

    @Override
    public void chargeBattery(){
        batteryLevel = BATTERY_FULL;
    }

    public int getBatteryLevel(){
        return batteryLevel;
    }
}
