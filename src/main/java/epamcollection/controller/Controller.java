package epamcollection.controller;

import epamcollection.model.TaxiCompany;
import epamcollection.view.View;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Controller {
    protected static final double STARTSPEED = 200; //km/h
    protected static final double ENDSPEED = 320;
    protected static TaxiCompany taxiCompany;
    protected static View view;
    private Scanner scanner = new Scanner(System.in);
    private Map<String, MenuItem> menuItemsMap = new HashMap<>();


    public Controller() {
        this.view = new View();
    }

    public void initController() {
        initTaxiCompany();
        menuItemsMap.put("1", MenuItem.ONE);
        menuItemsMap.put("2", MenuItem.TWO);
        menuItemsMap.put("3", MenuItem.THREE);
        menuItemsMap.put("4", MenuItem.FOUR);
        menuItemsMap.put("5", MenuItem.FIVE);
        menuItemsMap.put("6", MenuItem.SIX);
        menuItemsMap.put("Q", MenuItem.QUIT);

        menu();
    }

    private void initTaxiCompany() {
        taxiCompany = new TaxiCompany();
        taxiCompany.init();
    }

    private void menu() {
        view.printMenuItems();
        try {
            MenuItem menuItem = menuItemsMap.get(scanner.next().toUpperCase(Locale.ROOT));
            menuItem.action();
        }catch (NullPointerException e) {
            menu();
        }
        menu();
    }

}
