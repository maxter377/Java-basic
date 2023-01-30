package ch18_carsAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Factory {

    public static List<Car> cars = new ArrayList<>();

    public static void printAllData() {
        for (Car car : cars) {
            System.out.println("#######################");
            System.out.println();
            System.out.println("Producent: " + car.getProducent().getName() + " " + car.getProducent().getModel());
            System.out.println("Segment: " + car.getSegment());
            System.out.println("Height: " + car.getDimensions().getHeight() + ", width: " + car.getDimensions().getWidth() + ", trunk capacity: " + car.getDimensions().getTrunkCapacity());
            System.out.println("Sold in countries: ");
            for (Country country : car.getCountriesOfSale()) {
                System.out.println(country.getName() + " - " + country.getCountrySign());
            }
            System.out.println();
            System.out.println("#######################");

        }
    }

//    public void iterateOnCountriesOfCar(ArrayList countries) {
//        for (Country country : countries) {
//            System.out.println(country.getName() + " - " + country.getCountrySign());
//        }
//    }

    public static void printCountryNameFor(String producentName, boolean isAutomaticGear, int trunkCapacity) {
        for (Car car : cars) {
            if (Objects.equals(producentName, car.getProducent().getName()) && isAutomaticGear == car.isAutomaticGear() && trunkCapacity == car.getDimensions().getTrunkCapacity()) {
                System.out.println("Countries of sale for " + producentName + " are:");
                for (Country country : car.getCountriesOfSale()) {
                    System.out.println(country.getName() + " - " + country.getCountrySign());
                }
                return;
            }
        }
        System.out.println("We don't have such car.");
    }
}
