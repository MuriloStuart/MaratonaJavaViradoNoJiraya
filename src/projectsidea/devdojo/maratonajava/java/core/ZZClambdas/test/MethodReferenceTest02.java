package projectsidea.devdojo.maratonajava.java.core.ZZClambdas.test;

import projectsidea.devdojo.maratonajava.java.core.ZZClambdas.dominio.Anime;
import projectsidea.devdojo.maratonajava.java.core.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(
                new Anime("Berserk", 10),
                new Anime("Avatar", 22),
                new Anime("Jujutsu", 67)
        ));
        AnimeComparators animeComparators = new AnimeComparators();
        animes.sort(animeComparators::compareByEpisodesNonStatics);
        animes.sort(animeComparators::compareByEpisodesNonStatics);
        System.out.println(animes);


    }
}
