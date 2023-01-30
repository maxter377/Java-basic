package ch18_carsAssignment;

import java.util.ArrayList;
import java.util.List;

public class Country {

    private String name;
    private char countrySign;

    public Country(String name, char countrySign) {
        this.name = name;
        this.countrySign = countrySign;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getCountrySign() {
        return countrySign;
    }

    public void setCountrySign(char countrySign) {
        this.countrySign = countrySign;
    }

    public void createListOfCountriesForCar(String car_name) {
    }



}
