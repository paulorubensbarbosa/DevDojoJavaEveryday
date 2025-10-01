package ZZClambdas.test.Service;

import ZZClambdas.test.dominio.Anime;

public class AnimeComparators {
    public static int compareByTittle(Anime anime1, Anime anime2){
        return anime1.getTitle().compareTo(anime2.getTitle());
    }

    public static int compareByEpisodes(Anime anime1, Anime anime2){
        return Integer.compare(anime1.getEpisodes(), anime2.getEpisodes());
    }

    public int compareByEpisodesNonStatic(Anime anime1, Anime anime2){
        return Integer.compare(anime1.getEpisodes(), anime2.getEpisodes());
    }


}
