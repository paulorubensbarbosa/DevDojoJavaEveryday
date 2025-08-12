package Ycolecoes.test;

import Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SmartPhoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "Iphone");
        Smartphone s2 = new Smartphone("222222", "Pixel");
        Smartphone s3 = new Smartphone("333333", "Samsung");

        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3);

        //smartphones.clear();

        for (Smartphone s : smartphones){
            System.out.println(s);
        }

        Smartphone s4 = new Smartphone("222222", "Pixel");
        System.out.println(smartphones.contains(s4));

        //indexOf, retorna o índice do Objeto que estou a passar e caso não exista, retorna −1
        int indexSmartPhone4 = smartphones.indexOf(s4);
        System.out.println(smartphones.get(indexSmartPhone4));

    }
}
