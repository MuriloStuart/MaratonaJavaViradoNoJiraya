package projectsidea.devdojo.maratonajava.java.core.ZZEstreams.test;

import projectsidea.devdojo.maratonajava.java.core.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
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
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <=4) {
                titles.add(lightNovel.getTitle());
            }
            if (titles.size() >= 3) {
                break;
            }
        }

        System.out.println(lightNovels);
        System.out.println(titles);
    }
}
