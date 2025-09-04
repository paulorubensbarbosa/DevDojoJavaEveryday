package Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());

//        printConsulta(cachorros);
        printConsulta(gatos);

        List<Animal> animals = new ArrayList<>();
        printConsultaAnimal(animals);

    }
    //type erasure
    //wildCard = ?
    //Depois de usar WildCard, não se pode mais adicionar itens nessa lista, passa somente para leitura
    private static void printConsulta(List<? extends Animal> animals){

        for (Animal animal : animals) {
            animal.consulta();
        }
    }


    private static void printConsultaAnimal(List<? super Animal> animals){
//        Animal animal = new Cachorro();
        Animal animal2 = new Gato();
//        animals.add(new Cachorro());
        animals.add(new Gato());

    }
}
