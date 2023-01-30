package ch18_carsAssignment;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private Producent producent;
    private boolean isAutomaticGear;
    private String segment;
    private Dimensions dimensions;
    private List<Country> countriesOfSale = new ArrayList<>();

    public Car(Producent producent, boolean isAutomaticGear, String segment, Dimensions dimensions, List<Country> countriesOfSale) {
        this.producent = producent;
        this.isAutomaticGear = isAutomaticGear;
        this.segment = segment;
        this.dimensions = dimensions;
        this.countriesOfSale = countriesOfSale;
    }

    public Producent getProducent() {
        return producent;
    }

    public boolean isAutomaticGear() {
        return isAutomaticGear;
    }

    public String getSegment() {
        return segment;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public List<Country> getCountriesOfSale() {
        return countriesOfSale;
    }

}
