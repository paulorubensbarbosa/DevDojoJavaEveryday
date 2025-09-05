package Zgenerics.test;

import Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> canoa = criarArrayComUmObjeto(new Barco("Canoa"));
        System.out.println(canoa);
    }

    private static <T> List<T> criarArrayComUmObjeto(T t){
        List<T> list = List.of(t);
        return list;
    }
}

