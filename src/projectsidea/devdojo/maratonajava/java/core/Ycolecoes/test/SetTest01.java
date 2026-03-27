package projectsidea.devdojo.maratonajava.java.core.Ycolecoes.test;

import projectsidea.devdojo.maratonajava.java.core.Ycolecoes.dominio.Manga;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(5L, "Attack on Titan", 25.8, 0));
        mangas.add(new Manga(1L, "Berserk", 40, 5));
        mangas.add(new Manga(2L, "HunterXHunter", 18, 0));
        mangas.add(new Manga(4L, "Dragon Ball", 12.9, 2));
        mangas.add(new Manga(3L, "eshaFights", 7.5, 0));

        mangas.stream().sorted().forEach(System.out::println);

        System.out.println("---------------");

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
