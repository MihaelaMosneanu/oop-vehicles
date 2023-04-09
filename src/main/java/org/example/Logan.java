package org.example;

public class Logan extends Dacia{

    private final String chasisNumber;


    public Logan(int availableFuel, String chasisNumber){
        super(40, "PETROL", 5, 3.6f, availableFuel);
        this.chasisNumber = chasisNumber;
    }

    public String getChasisNumber() {
        return chasisNumber;
    }

}
