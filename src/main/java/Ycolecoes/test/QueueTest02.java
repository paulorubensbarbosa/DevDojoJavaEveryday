package Ycolecoes.test;

import Ycolecoes.dominio.Consumidor;
import Ycolecoes.dominio.Manga;

import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;


public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaByPreco().reversed());

        mangas.add(new Manga(5L,"Berserk", 9.5, 0));
        mangas.add(new Manga(2L,"Hellsing", 60D, 5));
        mangas.add(new Manga(3L,"Pokemon", 10D, 0));
        mangas.add(new Manga(1L,"Atack on Titan", 100D, 2));
        mangas.add(new Manga(4L,"Daragon Ball Z", 1D, 0));
        mangas.add(new Manga(10L,"Aaragon", 1D, 0));

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }

        System.out.println(mangas);
    }
}
