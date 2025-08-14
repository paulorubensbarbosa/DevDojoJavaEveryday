package Ycolecoes.test;

import Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

class MangaByPreco implements Comparator<Manga>{
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

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

        System.out.println("------------------------------------------------");

        Collections.sort(mangas, new MangaByIdComparator());

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("------------------------------------------------");

        Collections.sort(mangas, new MangaByPreco());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
