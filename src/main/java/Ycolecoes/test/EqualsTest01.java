package Ycolecoes.test;

import Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("1ABC1", "iPhone");
        Smartphone smartphone2 = new Smartphone("1ABC1", "iPhone");

        System.out.println(smartphone1.equals(smartphone2));
    }
}
