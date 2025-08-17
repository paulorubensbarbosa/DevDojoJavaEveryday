package Ycolecoes.test;

import Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();

        mangas.add(new Manga(5L,"Berserk", 50D, 0));
        mangas.add(new Manga(2L,"Hellsing", 60D, 5));
        mangas.add(new Manga(3L,"Pokemon", 10D, 0));
        mangas.add(new Manga(1L,"Atack on Titan", 100D, 2));
        mangas.add(new Manga(4L,"Daragon Ball Z", 1D, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("---------------------------------------------");

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
