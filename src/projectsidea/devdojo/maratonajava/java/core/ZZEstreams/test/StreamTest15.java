package projectsidea.devdojo.maratonajava.java.core.ZZEstreams.test;

import projectsidea.devdojo.maratonajava.java.core.ZZEstreams.dominio.Category;
import projectsidea.devdojo.maratonajava.java.core.ZZEstreams.dominio.LightNovel;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class StreamTest15 {
    private static final List<LightNovel> lightNovels = new ArrayList<>(List.of(
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
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
    }
}
