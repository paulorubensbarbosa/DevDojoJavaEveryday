package ZZClambdas.test;

import ZZClambdas.test.Service.AnimeComparators;
import ZZClambdas.test.dominio.Anime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One Piece", 400), new Anime("Naruto", 500)));
        //Collections.sort(animeList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));

        Collections.sort(animeList, AnimeComparators::compareByTittle);
        System.out.println(animeList);

        Collections.sort(animeList, AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
    }
}
