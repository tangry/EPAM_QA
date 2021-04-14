package epamcollection.model;

public class FreightCar extends Car {
    public FreightCar(String manufacturer, String model, double loadСapacity,
                      int price, double fuelConsumption, int speed) {
        super(manufacturer, model, loadСapacity, price, fuelConsumption, speed);
    }

    @Override
    public String toString() {
        return "Cargo truck model: "  + manufacturer + " " + model +
                ", Cargo Payload = " + loadCapacity + " kg. "+
                "Fuel Consumption = " + fuelConsumption + " L, " +
                "Speed = " + speed + " km/h";
    }
}
