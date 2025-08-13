package Ycolecoes.test;

import Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangaSortTest01 {
    public static void main(String[] args) {

        List<Manga> mangas = new ArrayList<>();

        mangas.add(new Manga(5L,"Berserk", 50D));
        mangas.add(new Manga(2L,"Hellsing", 60D));
        mangas.add(new Manga(3L,"Pokemon", 10D));
        mangas.add(new Manga(1L,"Atack on Titan", 100D));
        mangas.add(new Manga(4L,"Daragon Ball Z", 1D));

        System.out.println(mangas);

        System.out.println("------------------------------------------------");

        Collections.sort(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
