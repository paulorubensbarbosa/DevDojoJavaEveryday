package Zgenerics.test;

import Zgenerics.dominio.Barco;
import Zgenerics.dominio.Carro;
import Zgenerics.service.BarcoRentavelService;
import Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {

        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));

        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);

        Carro carro = rentalServiceCarro.buscarObjetoDisponivel();
        System.out.println("Usando o carro por um mês");
        rentalServiceCarro.retornarObjetoAlugado(carro);

        System.out.println("---------------------------------");

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);

        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando o barbo por um mês");
        rentalServiceBarco.retornarObjetoAlugado(barco);

    }


}
