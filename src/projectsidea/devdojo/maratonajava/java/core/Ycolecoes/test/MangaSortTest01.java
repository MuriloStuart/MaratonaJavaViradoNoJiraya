package projectsidea.devdojo.maratonajava.java.core.Ycolecoes.test;

import projectsidea.devdojo.maratonajava.java.core.Ycolecoes.dominio.Manga;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangaSortTest01 {
    public static void main(String[] args){
        Instant inicio = Instant.now();
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L,"Attack on Titan",25.8));
        mangas.add(new Manga(1L,"Berserk",40));
        mangas.add(new Manga(2L,"HunterXHunter",18));
        mangas.add(new Manga(4L,"Dragon Ball",12.9));
        mangas.add(new Manga(3L,"eshaFights",7.5));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas);
        System.out.println("--------");

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Instant fim = Instant.now();

        Duration tempo = Duration.between(inicio, fim);
        System.out.println("Segundos: " + tempo.getSeconds());
        System.out.println("Millis: " + tempo.toMillis());




    }
}
