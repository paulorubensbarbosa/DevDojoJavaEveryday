package Ycolecoes.test;

import Ycolecoes.dominio.Manga;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class sortMangaById implements Comparator<Manga>{
    @Override
    public int compare(Manga o1, Manga o2) {
        return o1.getId().compareTo(o2.getId());
    }
}

public class QueueTeste01 {
    public static void main(String[] args) {
        //First in, first out
        Queue<String> fila = new PriorityQueue<>();
        fila.add("C");
        fila.add("B");
        fila.add("A");

        for (String s : fila) {
            System.out.println(s);
        }

        System.out.println(fila.poll());

    }
}
