package epamcollection.controller;

import static epamcollection.controller.Controller.*;

public enum MenuItem {
    ONE("1") {
        @Override public void action() {
            view.showCar(taxiCompany.getCar(),
                    "All cars of Taxi company");
        }
    },
    TWO("2") {
        @Override public void action() {
            view.showTotalSeatings(taxiCompany);
        }
    },
    THREE("3") {
        @Override public void action() {
            view.showTotalLoadCapacity(taxiCompany);
        }
    },
    FOUR("4") {
        @Override public void action() { view.showTotalPrice(taxiCompany);       }
    },
    FIVE("5") {
        @Override public void action() {
            view.showCar(taxiCompany.sortCarByFuelConsumption(),
                    "Cars sorted by fuel consumption");
        }
    },
    SIX("6") {
        @Override public void action() {
            view.showCar(taxiCompany.getCarBySpeed(STARTSPEED, ENDSPEED),
                    "Cars with a speed of 200-300 km/h" );
        }
    },
    QUIT("Q") {
        @Override public void action() {
            System.exit(0);
        }
    };

    private final String item;

    MenuItem(String item) {
        this.item = item;
    }

    public abstract void action();
}