package projectsidea.devdojo.maratonajava.java.core.Ycolecoes.test;

import projectsidea.devdojo.maratonajava.java.core.Ycolecoes.dominio.Consumidor;
import projectsidea.devdojo.maratonajava.java.core.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Murilo");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");

        Manga manga1 = new Manga(5L, "Attack on Titan", 25.8);
        Manga manga2 = new Manga(1L, "Berserk", 40);
        Manga manga3 = new Manga(2L, "HunterXHunter", 18);
        Manga manga4 = new Manga(4L, "Dragon Ball", 12.9);
        Manga manga5 = new Manga(3L, "eshaFights", 7.5);

        Map<Consumidor,Manga> consumidorMangaHashMap = new HashMap<>();
        consumidorMangaHashMap.put(consumidor1,manga1);
        consumidorMangaHashMap.put(consumidor1,manga1);
        consumidorMangaHashMap.put(consumidor2,manga4);
        for (Map.Entry<Consumidor, Manga> entry : consumidorMangaHashMap.entrySet()) {
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNomeManga());
        }

        //consumidorMangaHashMap.getOrDefault(consumidor3,manga1);
    }
}
