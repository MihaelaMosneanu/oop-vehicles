package org.example;

public class Main {
    public static void main(String[] args) {
        Car logan = new Logan(27, "srdtcvyujhbnojkl");
        logan.setTierSize(16);
        logan.start();
        logan.shiftGear(1);
        logan.drive(0.01f); //drives 0.01 KM
        logan.shiftGear(2);
        logan.drive(0.02f);
        logan.shiftGear(3);
        logan.drive(0.5f);
        logan.shiftGear(4);
        logan.drive(0.5f);
        logan.shiftGear(5);
        logan.drive(10);
        logan.shiftGear(4);
        logan.drive(0.5f);
        logan.shiftGear(3);
        logan.drive(0.1f);
        logan.stop();
        float availableFuel = logan.getAvailableFuel();
        float fuelConsumedPer100Km = logan.getAverageFuelConsumption();

        System.out.println(availableFuel);
        System.out.println(fuelConsumedPer100Km);

        Car duster = new Duster(60, "FGHJKLOIUYT");
        duster.setTierSize(18);
        duster.start();
        duster.shiftGear(1);
        duster.drive(0.01f); //drives 0.01 KM
        duster.shiftGear(2);
        duster.drive(0.02f);
        duster.shiftGear(3);
        duster.drive(0.5f);
        duster.shiftGear(4);
        duster.drive(0.5f);
        duster.shiftGear(5);
        duster.drive(10);
        duster.stop();

        float availableFuelDuster = duster.getAvailableFuel();
        float fuelConsumedPer100KmDuster = duster.getAverageFuelConsumption();

        System.out.println(availableFuelDuster);
        System.out.println(fuelConsumedPer100KmDuster);

    }
}