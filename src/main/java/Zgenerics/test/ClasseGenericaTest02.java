package Zgenerics.test;

import Zgenerics.dominio.Barco;
import Zgenerics.dominio.Carro;
import Zgenerics.service.BarcoRentavelService;
import Zgenerics.service.CarroRentavelService;

import java.util.List;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando barco por um mês...");
        barcoRentavelService.retornarBarcoAlugado(barco);


        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        GetListAnimals.getListAnimals(cachorros);


    }

    static class GetListAnimals {

        public static void getListAnimals(List<? extends  AnimalTest> animals){
            for (AnimalTest animal : animals) {
                animal.consultaInterface();
            }
        }
    }
}
