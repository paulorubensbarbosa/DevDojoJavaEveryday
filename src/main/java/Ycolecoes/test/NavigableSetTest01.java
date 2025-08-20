package Ycolecoes.test;

import Ycolecoes.dominio.Manga;
import Ycolecoes.dominio.Smartphone;

import java.util.*;

class sortSmartPhoneBySerial implements Comparator<Smartphone>{
    @Override
    public int compare(Smartphone s1, Smartphone s2) {
        return s1.getSerialNumber().compareTo(s2.getSerialNumber());
    }
}

class smartPhoneMarcaComparator implements Comparator<Smartphone>{
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> smartphones = new TreeSet<>(new sortSmartPhoneBySerial());
        Smartphone smartphone = new Smartphone("123", "nokia");

        smartphones.add(smartphone);

        System.out.println(smartphones);

        //TreeSet Automaticamente faz a ordenação de acordo com o métod CompareTo, dentro da classe mangá
        NavigableSet<Manga> mangas = new TreeSet<>();

        mangas.add(new Manga(5L,"Berserk", 50D, 0));
        mangas.add(new Manga(2L,"Hellsing", 60D, 5));
        mangas.add(new Manga(3L,"Pokemon", 10D, 0));
        mangas.add(new Manga(1L,"Atack on Titan", 100D, 2));
        mangas.add(new Manga(4L,"Daragon Ball Z", 1D, 0));
        mangas.add(new Manga(10L,"Aaragon", 1D, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("-----------------------------------");
        //imprimir na ordem inversa
        for (Manga manga : mangas.descendingSet()) {
            System.out.println(manga);
        }

    }
}
