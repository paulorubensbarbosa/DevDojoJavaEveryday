package Zgenerics.test;

import Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericsTest01 {
    public static void main(String[] args) {

        //Generics verifica em tempo de compilação o tipo da lista // Type erasure, depois que o código é compilado, é apagado o tipo
        List<String> lista = new ArrayList<>();
        lista.add("Midoriya");
        lista.add("Midoriya");

        for (String s : lista) {
            System.out.println(s);
        }
        add(lista, new Consumidor("Paulo"));

        for (Object s : lista) {
            System.out.println(s);
        }

    }

    public static void add (List lista, Consumidor consumidor){
        lista.add(consumidor);

    }

}
