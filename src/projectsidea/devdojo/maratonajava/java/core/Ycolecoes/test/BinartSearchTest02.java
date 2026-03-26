package projectsidea.devdojo.maratonajava.java.core.Ycolecoes.test;

import projectsidea.devdojo.maratonajava.java.core.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinartSearchTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L,"Attack on Titan",25.8));
        mangas.add(new Manga(1L,"Berserk",40));
        mangas.add(new Manga(2L,"HunterXHunter",18));
        mangas.add(new Manga(4L,"Dragon Ball",12.9));
        mangas.add(new Manga(3L,"eshaFights",7.5));

        //Collections.sort(mangas);

        mangas.sort(mangaByIdComparator);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(3L, "eshaFights", 7.5);

        System.out.println(Collections.binarySearch(mangas,mangaToSearch,mangaByIdComparator));
    }
}
