package ZZBcomportamento.test;

import ZZBcomportamento.dominio.Car;
import ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("green", 2012));

    public static void main(String[] args) {
//        List<Car> greenCars = filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("green");
//            }
//        });

        List<Car> greenCarsLambda = filter(cars, car -> car.getColor().equals("green"));
        List<Car> redCarsLambda = filter(cars, car -> car.getColor().equals("black"));
        List<Car> carroAtual = filter(cars, car -> car.getYear() > 2000);

        System.out.println(carroAtual);
        System.out.println(greenCarsLambda);
        System.out.println(redCarsLambda);
    }

    public static List<Car> filter(List<Car> cars, CarPredicate carPredicate){
        List<Car> tempCars = new ArrayList<>();
        for (Car car : cars) {
            if(carPredicate.test(car)){
                tempCars.add(car);
            }
        }
        return tempCars;
    }

}
