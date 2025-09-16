package ZZBcomportamento.test;

import ZZBcomportamento.dominio.Car;
import ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
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

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(filter(numbers, num -> num % 2 == 0));

    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filter = new ArrayList<>();
        for (T t : list) {
        if (predicate.test(t)){
            filter.add(t);
        }
    }
        return filter;
    }
   
}
