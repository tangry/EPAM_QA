package epamcollection.model;

public class PassengerCar extends Car {
    private final int seating;

    public PassengerCar(String manufacturer, String model, double loadСapacity,
                        int seating, int price, double fuelConsumption, int speed) {
        super(manufacturer, model, loadСapacity, price, fuelConsumption, speed);
        this.seating = seating;
    }

    public double getSeating() {
        return seating;
    }

    @Override
    public String toString() {
        return "Passenger Car model: " + manufacturer + " " + model +
                ", Seating = " + seating + " seats, " +
                "Fuel Consumption = " + fuelConsumption + " L, " +
                "Speed = " + speed + " km/h";
    }

}

