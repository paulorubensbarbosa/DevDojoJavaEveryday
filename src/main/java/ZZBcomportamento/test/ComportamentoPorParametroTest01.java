package ZZBcomportamento.test;

import ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {

    static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    private static List<Car> filterCarByColor(List<Car> cars, String cor){

        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if(car.getColor().equals(cor)){
                filterCar.add(car);
            }
        }
        return filterCar;
    }

    public static List<Car> filterCarByAge (List<Car> cars, Integer year){

        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear()  >= year) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }

    public static void main(String[] args) {
        System.out.println(filterCarByColor(cars, "black"));
        System.out.println(filterCarByAge(cars, 2011));
    }
}
