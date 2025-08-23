package Ycolecoes.test;

import Ycolecoes.dominio.Consumidor;
import Ycolecoes.dominio.Manga;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapTest02 {
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
        Set<Map.Entry<Consumidor, Manga>> entries = consumidorMangaMap.entrySet();
        for (Map.Entry<Consumidor, Manga> entry : entries) {
            System.out.println(entry.getKey().getNome() + ": " + entry.getValue().getNome());
        }

    }
}
