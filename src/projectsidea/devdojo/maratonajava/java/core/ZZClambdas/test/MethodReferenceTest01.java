package projectsidea.devdojo.maratonajava.java.core.ZZClambdas.test;

import projectsidea.devdojo.maratonajava.java.core.ZZClambdas.dominio.Anime;
import projectsidea.devdojo.maratonajava.java.core.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(
                new Anime("Berserk", 10),
                new Anime("Avatar", 22),
                new Anime("Jujutsu", 67)
        ));
        //Collections.sort(animes, (a1, a2) -> a1.getTitle().compareToIgnoreCase(a2.getTitle()));
        animes.sort(AnimeComparators::compareByTitle);
        System.out.println(animes);
        animes.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animes);
    }
}
