package projectsidea.devdojo.maratonajava.java.core.ZZEstreams.test;

import projectsidea.devdojo.maratonajava.java.core.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest02 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Naruto", 20),
            new LightNovel("HxH", 7.5),
            new LightNovel("Dragon Bal", 2.88),
            new LightNovel("Konosuba", 3.88),
            new LightNovel("Overrider", 12.5),
            new LightNovel("Shoujo Romance", 1.5),
            new LightNovel("Anas life", 0.9),
            new LightNovel("Gurren langem", 4)
    ));

    public static void main(String[] args) {
        List<String> titles = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(titles);
    }


}
