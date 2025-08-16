package Ycolecoes.test;

import Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();

        mangas.add(new Manga(5L,"Berserk", 50D, 0));
        mangas.add(new Manga(2L,"Hellsing", 60D, 5));
        mangas.add(new Manga(3L,"Pokemon", 10D, 0));
        mangas.add(new Manga(1L,"Atack on Titan", 100D, 2));
        mangas.add(new Manga(4L,"Daragon Ball Z", 1D, 0));

        System.out.println(mangas);

//        Iterator<Manga> iteratorManga = mangas.iterator();
//        while (iteratorManga.hasNext()){
//            Manga manga = iteratorManga.next();
//            if(manga.getQuantidade() == 0){
//                iteratorManga.remove();
//            }
//        }

        mangas.removeIf(m -> m.getQuantidade() == 0);
        System.out.println(mangas);

    }
}
