package Ycolecoes.test;

import Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Berserk");
        mangas.add("Hellsing");
        mangas.add("Pokemon");
        mangas.add("Atack on Titan");
        mangas.add("Daragon Ball Z");

        Collections.sort(mangas);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(98.10);

        Collections.sort(dinheiros);
        for (Double dinheiro : dinheiros){
            System.out.println(dinheiro);
        }


        for (String manga : mangas){
            System.out.println(manga);
        }

    new Manga(null, "One punchman", 10.50);

    }

}


//BigO
//O(1), O(log n), O(n), O( n log n), O(n^2), O(2^n), O(n!)
