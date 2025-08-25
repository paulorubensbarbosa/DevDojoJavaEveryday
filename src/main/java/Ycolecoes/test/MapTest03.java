package Ycolecoes.test;

import Ycolecoes.dominio.Consumidor;
import Ycolecoes.dominio.Manga;

import java.util.*;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Paulo");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");

        Manga manga1 = new Manga(5L,"Berserk", 50D);
        Manga manga2 = new Manga(2L,"Hellsing", 60D);
        Manga manga3 = new Manga(3L,"Pokemon", 10D);
        Manga manga4 = new Manga(1L,"Atack on Titan", 100D);
        Manga manga5 = new Manga(4L,"Dragon Ball Z", 1D);

        Map<Consumidor, Manga> consumidorMangaMap = new LinkedHashMap<>();
        consumidorMangaMap.put(consumidor1, manga1);
        consumidorMangaMap.put(consumidor2, manga4);

        List<Manga> consumidor1List = List.of(manga1, manga2, manga3);
        List<Manga> consumidor2List = List.of(manga3, manga4);

        Map<Consumidor, List<Manga>> consumidorMaga = new LinkedHashMap<>();

        consumidorMaga.put(consumidor1, consumidor1List);
        consumidorMaga.put(consumidor2, consumidor2List);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMaga.entrySet()) {
            System.out.println(entry.getKey().getNome());
            for (Manga manga : entry.getValue()){
                System.out.println(manga.getNome());
            }
        }


    }
}
