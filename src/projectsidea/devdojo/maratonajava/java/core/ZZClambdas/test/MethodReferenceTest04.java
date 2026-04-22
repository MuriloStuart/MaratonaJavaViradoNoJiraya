package projectsidea.devdojo.maratonajava.java.core.ZZClambdas.test;

import projectsidea.devdojo.maratonajava.java.core.ZZClambdas.dominio.Anime;
import projectsidea.devdojo.maratonajava.java.core.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> animeComparatorsSupplier = AnimeComparators::new;
        AnimeComparators animeComparators = animeComparatorsSupplier.get();
        List<Anime> animes = new ArrayList<>(List.of(
                new Anime("Berserk", 10),
                new Anime("Avatar", 22),
                new Anime("Jujutsu", 67)
        ));
        animes.sort(animeComparators::compareByEpisodesNonStatics);

        System.out.println(animes);

        BiFunction<String, Integer, Anime> animeBiFunction = (title,episodes) -> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;

        System.out.println(animeBiFunction.apply("Berserk", 10));

    }
}
