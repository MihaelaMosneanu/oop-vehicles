package org.example;

public abstract class Car implements Vechicle{

    private final float fuelTankSize;
    private final String fuelType;
    private final int gears; // max 6
    private final float consumptionPer100Km;
    private int availableFuel;
    private int tierSize;
    private float fuelConsumed;
    private float kmDriven = 0;
    protected int currentGear;
    private float totalConsumption;
    public Car(float fuelTankSize, String fuelType, int gears, float consumptionPer100Km, int availableFuel) {
        this.fuelTankSize = fuelTankSize;
        this.fuelType = fuelType;
        this.gears = (0 < gears && gears < 7) ? gears : 5;
        this.consumptionPer100Km = consumptionPer100Km;
        this.availableFuel = availableFuel;
    }
    @Override
    public void start() {
        this.fuelConsumed = 0;
    }

    @Override
    public void drive(float km) {
        this.kmDriven += km;
        if (this.tierSize == 15){
            this.fuelConsumed = km * this.currentGear * this.tierSize /100;
        } else if (16 <= this.tierSize && this.tierSize<= 18 ) {
            this.fuelConsumed = km * this.currentGear * this.tierSize /this.consumptionPer100Km*0.1f;
        }else{
            this.fuelConsumed = km * this.currentGear * this.tierSize /this.consumptionPer100Km;
        }
        this.totalConsumption += this.fuelConsumed;
    }

    @Override
    public void stop() {
        this.availableFuel -= this.totalConsumption;
        this.currentGear = 0;
    }

    public void shiftGear(int gear){
        this.currentGear = gear;
    }
    public float getAverageFuelConsumption(){
        return 10*this.totalConsumption/this.kmDriven;
    }
    public int getAvailableFuel() {
        return availableFuel;
    }

    public int getTierSize() {
        return tierSize;
    }

    public void setTierSize(int tierSize) {
        this.tierSize = tierSize;
    }

}
