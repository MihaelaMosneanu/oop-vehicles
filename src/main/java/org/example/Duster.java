package org.example;

public class Duster  extends Dacia{
    private final String chasisNumber;

    public Duster(int availableFuel, String chasisNumber){
        super(50, "PETROL", 6, 6.8f, availableFuel);
        this.chasisNumber = chasisNumber;
    }

}
