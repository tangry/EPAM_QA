package epamcollection;
/*
Таксопарк. Определить иерархию легковых автомобилей. Создать таксопарк. Подсчитать стоимость автопарка.
Провести сортировку автомобилей парка по расходу топлива.
Найти автомобиль в компании, соответствующий заданному диапазону параметров скорости.
 */

import epamcollection.controller.Controller;

public class App {
    public static void main( String[] args )
    {
        Controller controller = new Controller();
        controller.initController();
    }
}
