package projectsidea.devdojo.maratonajava.java.core.ZZEstreams.test;

import projectsidea.devdojo.maratonajava.java.core.ZZEstreams.dominio.Category;
import projectsidea.devdojo.maratonajava.java.core.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
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
//        Map<Category, List<LightNovel>> categoryLightNovelMap = new HashMap<>();
//        List<LightNovel> fantasy = new ArrayList<>();
//        List<LightNovel> drama = new ArrayList<>();
//        List<LightNovel> romance = new ArrayList<>();
//
//        for (LightNovel lightNovel : lightNovels) {
//            switch (lightNovel.getCategory()) {
//                case DRAMA:drama.add(lightNovel); break;
//                case FANTASY:fantasy.add(lightNovel); break;
//                case ROMANCE:romance.add(lightNovel); break;
//            }
//        }
//
//        categoryLightNovelMap.put(Category.FANTASY, fantasy);
//        categoryLightNovelMap.put(Category.DRAMA, drama);
//        categoryLightNovelMap.put(Category.ROMANCE, romance);
//
//        System.out.println(categoryLightNovelMap);

        // isso tudp pode ser resumido conforme abaixo, agrupando os itens da lista
        // conforme a categoria

        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);


    }
}
