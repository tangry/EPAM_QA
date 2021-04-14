package epamcollection.util;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import epamcollection.model.Car;
import epamcollection.model.FreightCar;
import epamcollection.model.PassengerCar;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvParser {
    public static List<Car> parseCar(String filename) {
        List<Car> car = new ArrayList<>();
        try (FileReader fileReader = new FileReader("D:\\IdeaProjects\\EPAM\\Java Collections\\src\\main\\resources\\car.csv");
             CSVReader reader = new CSVReader(fileReader)) {
            String[] line;    //CSV columns: manufacturer,model,carType, loadCapacity, seating, quantity, price,fuelConsumption,speed

            while ((line = reader.readNext()) != null) {
                String manufacturer = line[0];
                String model = line[1];
                String carType = line[2];
                Double loadСapacity = Double.valueOf(line[3]);
                int seating = Integer.valueOf(line[4]);
                int price = Integer.valueOf(line[6]);
                Double fuelConsumption = Double.valueOf(line[7]);
                int speed = Integer.valueOf(line[8]);
                for (int i = 0; i < Integer.valueOf(line[5]); i++) {
                    if (carType.equals("p"))
                        car.add(new PassengerCar(manufacturer, model, loadСapacity, seating,
                                price, fuelConsumption, speed));
                    else
                        car.add(new FreightCar(manufacturer, model, loadСapacity, price,
                                fuelConsumption, speed));
                }

            }
        }
        catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }

        return car;
    }
}