package Uregex.test;

import java.util.Arrays;

public class ScannerTest01 {
    public static void main(String[] args) {

        String texto = "Levi, Eren, Mikasa, 1000, true";
        String[] nomes1 = texto.split(",");


        for (String nome : nomes1) {
            System.out.println(nome.trim());
        }

//        Jeito mais avançado com collections e lambda
//        Arrays.stream(nomes1).forEach(s -> System.out.println(s.trim()));

    }
}
