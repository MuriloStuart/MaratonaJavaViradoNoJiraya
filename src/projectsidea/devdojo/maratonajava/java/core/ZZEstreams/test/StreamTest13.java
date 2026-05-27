package projectsidea.devdojo.maratonajava.java.core.ZZEstreams.test;

import projectsidea.devdojo.maratonajava.java.core.ZZEstreams.dominio.Category;
import projectsidea.devdojo.maratonajava.java.core.ZZEstreams.dominio.LightNovel;
import projectsidea.devdojo.maratonajava.java.core.ZZEstreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
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
        Map<Promotion, List<LightNovel>> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
                ));
        System.out.println(collect);

        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
                )));
        System.out.println(collect1);
    }
}
