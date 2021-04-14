package epamcollection.view;

import epamcollection.model.Car;
import epamcollection.model.TaxiCompany;

import java.util.List;

public class View {
    public void printMenuItems() {
        System.out.println("\n" + "Please input your choice:");
        System.out.println("1 - show all car of Taxi Company");
        System.out.println("2 - show total number of seatings");
        System.out.println("3 - show total load capacity");
        System.out.println("4 - show car total price");
        System.out.println("5 - sort car by fuel consumption");
        System.out.println("6 - show car with 200-320 km/h speed");
        System.out.println("q - quit");
    }

    public void showCar(List<Car> car, String headMessage) {
        if (car.isEmpty()) {
            System.out.println("Car list is empty");
        } else {
            System.out.println(headMessage);
            for (Car cars : car
            ) {
                System.out.println(cars);
            }
        }
    }

    public void showTotalSeatings(TaxiCompany taxiCompany) {
        System.out.println("TaxiCompany's total number of seating: " + taxiCompany.getTotalSeating());
    }

    public void showTotalPrice(TaxiCompany taxiCompany) {
        System.out.println("TaxiCompany's total price: " + taxiCompany.getTotalPrice()+ " RUB");
    }

    public void showTotalLoadCapacity(TaxiCompany taxiCompany) {
        System.out.println("TaxiCompany's total load capacity: " + taxiCompany.getTotalLoadCapacity() + " kg.");
    }

}