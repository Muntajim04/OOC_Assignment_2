package org.example;

public class PetrolCar extends Vehicle implements FuelSupported {
    private static final int FUEL_TANK_FULL = 100;
    private int fuelTankLevel = 0;

    @Override
    public void fillUpWithFuel() {
        this.fuelTankLevel = FUEL_TANK_FULL;
    }

    public int getFuelTankLevel(){
        return fuelTankLevel;
    }
}
