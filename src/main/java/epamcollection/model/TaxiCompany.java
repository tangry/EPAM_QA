package epamcollection.model;

import epamcollection.util.CsvParser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaxiCompany {
    public static final String FILENAME = "src/main/resources/car.csv";
    private List<Car> car;

    public List<Car> getCar() {
        return car;
    }

    public void init() {
        car = CsvParser.parseCar(FILENAME);
    }

    public List<Car> sortCarByFuelConsumption() {
        List<Car> sortedCars = car;
        Collections.sort(sortedCars);
        return sortedCars;
    }

    public int getTotalSeating() {
        int totalSeating = 0;
        for (Car car : this.car
        ) {
            if (car instanceof PassengerCar)
                totalSeating += ((PassengerCar) car).getSeating();
        }
        return totalSeating;
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for (Car car : this.car
        ) {
                totalPrice += car.getPrice();
        }
        return totalPrice;
    }

    public double getTotalLoadCapacity() {
        double totalLoadCapacity = 0.0;
        for (Car car : this.car
        ) {
            if (car instanceof FreightCar)
                totalLoadCapacity += car.loadCapacity;
        }
        return totalLoadCapacity;
    }

    public List<Car> getCarBySpeed(double startSpeed, double endSpeed) {
        List<Car> carBySpeed = new ArrayList<Car>();
        for (Car car : this.car
        ) {
            if (car.getSpeed() > startSpeed && car.getSpeed()<endSpeed)
                carBySpeed.add(car);
        }
        return carBySpeed;
    }

}
