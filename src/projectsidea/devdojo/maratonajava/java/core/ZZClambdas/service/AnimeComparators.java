package projectsidea.devdojo.maratonajava.java.core.ZZClambdas.service;

import projectsidea.devdojo.maratonajava.java.core.ZZClambdas.dominio.Anime;

public class AnimeComparators {
    public static int compareByTitle(Anime anime1, Anime anime2){
        return anime1.getTitle().compareTo(anime2.getTitle());
    }

    public static int compareByEpisodes(Anime anime1, Anime anime2){
        return Integer.compare(anime1.getEpisodes(), anime2.getEpisodes());
    }

    public int compareByEpisodesNonStatics(Anime anime1, Anime anime2){
        return Integer.compare(anime1.getEpisodes(), anime2.getEpisodes());
    }
}
