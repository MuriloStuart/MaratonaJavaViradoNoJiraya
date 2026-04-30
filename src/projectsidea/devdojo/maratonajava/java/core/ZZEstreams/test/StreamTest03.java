package projectsidea.devdojo.maratonajava.java.core.ZZEstreams.test;

import projectsidea.devdojo.maratonajava.java.core.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Naruto", 20),
            new LightNovel("HxH", 7.5),
            new LightNovel("Dragon Bal", 2.88),
            new LightNovel("Konosuba", 3.88),
            new LightNovel("Overrider", 12.5),
            new LightNovel("Shoujo Romance", 4),
            new LightNovel("Shoujo Romance", 4),
            new LightNovel("Anas life", 0.9),
            new LightNovel("Gurren langem", 4)
    ));

    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels
                .forEach(System.out::println);
        long count = stream.filter(ln -> ln.getPrice() <= 4)
                .count();

        long countDistinct = lightNovels.stream().
                distinct()
                .filter(ln -> ln.getPrice() <= 4)
                .count();

        System.out.println(count);

        System.out.println(countDistinct);
    }
}
