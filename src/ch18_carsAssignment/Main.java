package ch18_carsAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        welcomeToFactory();

        Country poland = new Country("Poland", 'p');
        Country germany = new Country("Germany", 'g');
        Country czech = new Country("Czech", 'c');
        Country austria = new Country("Austria", 'a');
        Country slovakia = new Country("Slovakia", 's');
        Country hungary = new Country("Hungary", 'h');
        Country france = new Country("France", 'f');
        Country spain = new Country("Spain", 's');
        Country portugal = new Country("Portugal", 'p');
        Country greece = new Country("Greece", 'h');


        //czy taką listę mogę zrobić sobie w konstruktorze?
        // zamknąć to może w metodzie osobnej
        List <Country> subaruImprezaCountries = createCountryList(poland, germany, greece, spain, czech);


//        inna opcja zrobienia tego:
//        List<Country> subaruImprezaCountries = new ArrayList<>();
//        subaruImprezaCountries.add(poland);
//        subaruImprezaCountries.add(germany);
//        subaruImprezaCountries.add(greece);
//        subaruImprezaCountries.add(spain);
//        subaruImprezaCountries.add(czech);

        createAndAddCarToFactory("Subaru", "Impreza", false, "medium", 120, 150, 400, subaruImprezaCountries);

        List <Country> renaultClioCountries = createCountryList(france, poland, spain, slovakia, austria);

        createAndAddCarToFactory("Renault", "Clio", false, "medium", 125, 150, 350, renaultClioCountries);

        List <Country> opelAstraCountries = createCountryList(hungary, poland, spain, slovakia, austria);

        createAndAddCarToFactory("Opel", "Astra", true, "low", 115, 130, 320, opelAstraCountries);

//        Factory.printCountryNameFor("Renault", false, 850);
        Factory.printAllData();



    }

    private static List<Country> createCountryList (Country... countryArray) {
        return new ArrayList<>(Arrays.stream(countryArray).toList());

    }

    private static void createAndAddCarToFactory(String name, String model, boolean isAutomaticGear, String segment, int height, int width, int trunkCapacity, List<Country> countriesOfSale) {
        Car car = new Car(new Producent(name, model), isAutomaticGear, segment, new Dimensions(height, width, trunkCapacity), countriesOfSale);
        Factory.cars.add(car);
    }

    private static void welcomeToFactory() {
        System.out.println("Welcome to our factory!");
        System.out.println("-----------------------");
    }


}
