package projectsidea.devdojo.maratonajava.java.core.ZZEstreams.test;

import projectsidea.devdojo.maratonajava.java.core.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

public class StreamTest08 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Naruto", 1),
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
        lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum).ifPresent(System.out::println);

        double doubleStream = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 3)
                .sum();

        System.out.println(doubleStream);
    }
}
