package Ycolecoes.test;

import Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {

        class MangaPeloId implements Comparator<Manga>{
            @Override
            public int compare(Manga o1, Manga o2) {
                return o1.getId().compareTo(o2.getId());
            }
        }

        List<Manga> mangas = new ArrayList<>();

        mangas.add(new Manga(5L,"Berserk", 50D));
        mangas.add(new Manga(2L,"Hellsing", 60D));
        mangas.add(new Manga(3L,"Pokemon", 10D));
        mangas.add(new Manga(1L,"Atack on Titan", 100D));
        mangas.add(new Manga(4L,"Dragon Ball Z", 1D));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Collections.sort(mangas, new MangaPeloId());

        System.out.println("--------------------------------------------");

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(4L,"Dragon Ball Z", 1D);

        System.out.println(Collections.binarySearch(mangas, mangaToSearch, new MangaPeloId()));


    }
}
