package projectsidea.devdojo.maratonajava.java.core.Ycolecoes.test;

import projectsidea.devdojo.maratonajava.java.core.Ycolecoes.dominio.Consumidor;
import projectsidea.devdojo.maratonajava.java.core.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Murilo");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");

        Manga manga1 = new Manga(5L, "Attack on Titan", 25.8);
        Manga manga2 = new Manga(1L, "Berserk", 40);
        Manga manga3 = new Manga(2L, "HunterXHunter", 18);
        Manga manga4 = new Manga(4L, "Dragon Ball", 12.9);
        Manga manga5 = new Manga(3L, "eshaFights", 7.5);

        List<Manga> mangasConsumidor1 = List.of(manga1, manga2, manga3);
        List<Manga> mangasConsumidor2 = List.of(manga3, manga4);

        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1,mangasConsumidor1);
        consumidorMangaMap.put(consumidor2,mangasConsumidor2);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            System.out.print(entry.getKey().getNome() + " mangas comprados: ");
            for (Manga manga : entry.getValue()) {
                System.out.print(manga.getNomeManga() + " - ");
            }
            System.out.println("\n");
        }

    }
}
