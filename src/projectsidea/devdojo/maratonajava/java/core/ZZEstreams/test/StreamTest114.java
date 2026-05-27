package projectsidea.devdojo.maratonajava.java.core.ZZEstreams.test;

import projectsidea.devdojo.maratonajava.java.core.ZZEstreams.dominio.Category;
import projectsidea.devdojo.maratonajava.java.core.ZZEstreams.dominio.LightNovel;
import projectsidea.devdojo.maratonajava.java.core.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class StreamTest114 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Naruto", 1, Category.FANTASY),
            new LightNovel("HxH", 7.5,Category.FANTASY) ,
            new LightNovel("Dragon Bal", 2.88,Category.FANTASY),
            new LightNovel("Konosuba", 3.88,Category.DRAMA),
            new LightNovel("Overrider", 12.5,Category.DRAMA),
            new LightNovel("Shoujo Romance", 4,Category.ROMANCE),
            new LightNovel("Shoujo Romance", 4,Category.ROMANCE),
            new LightNovel("Anas life", 0.9,Category.ROMANCE),
            new LightNovel("Gurren langem", 4,Category.FANTASY)
    ));

    public static void main(String[] args) {
        Map<Category, Long> collect = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        Map<Category, Optional<LightNovel>> collect1 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);

        Map<Category, LightNovel> collect2 = lightNovels.stream().collect(groupingBy(LightNovel::getCategory
                , Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
        System.out.println(collect2);
    }
}
