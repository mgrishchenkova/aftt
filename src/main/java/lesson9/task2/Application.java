package lesson9.task2;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            cars.add(Factory.make());
        }
        int premiumCar = 0;
        int regularCar = 0;
        int mitsCar = 0;
        int mersCar = 0;
        int nissanCar = 0;
        int renoCar = 0;
           for ( Car cars1: cars){
               if ( cars1 instanceof Regular)
                   regularCar++;
               if (cars1 instanceof Premium)
                   premiumCar++;
               if( cars1 instanceof Mercedes)
                   mersCar++;
               if (cars1 instanceof Mitsubishi)
                   mitsCar++;
               if(cars1 instanceof Nissan)
                   nissanCar++;
               if (cars1 instanceof Renault)
                   renoCar++;
           }

           System.out.printf("Количество машин в сегменте Premium %s.%n Количество машин в сегменте Regular %s.%n Количество машин Mersedes:%s,%n Mitsubishi:%s,%n Nissan:%s%n Renault %s%n",premiumCar,regularCar, mersCar,mitsCar,nissanCar,renoCar);
    }
}
