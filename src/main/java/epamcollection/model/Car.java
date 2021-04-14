package epamcollection.model;

public abstract class Car implements Comparable<Car>{
    protected final String manufacturer;
    protected final String model;
    protected final double loadCapacity;
    protected final int price;
    protected final double fuelConsumption;
    protected final int speed;

    public Car(String manufacturer, String model, double loadCapacity,
               int price, double fuelConsumption, int speed) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.loadCapacity = loadCapacity;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.speed = speed;
    }

    @Override
    public int compareTo(Car a){
        if(this.fuelConsumption < a.fuelConsumption)
            return -1;
        else if(a.fuelConsumption < this.fuelConsumption)
            return 1;
        return 0;
    }

    public double getPrice() { return price; }

    public double getSpeed() { return speed; }


}
