package projectsidea.devdojo.maratonajava.java.core.Ycolecoes.test;


import projectsidea.devdojo.maratonajava.java.core.Ycolecoes.dominio.Consumidor;
import projectsidea.devdojo.maratonajava.java.core.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {

        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparor().reversed());

        mangas.add(new Manga(5L, "Attack on Titan", 25.8, 0));
        mangas.add(new Manga(1L, "Berserk", 40, 5));
        mangas.add(new Manga(2L, "HunterXHunter", 18, 0));
        mangas.add(new Manga(4L, "Dragon Ball", 12.9, 2));
        mangas.add(new Manga(3L, "eshaFights", 7.5, 0));
        mangas.add(new Manga(10L, "Aaragon", 7.5, 0));
        mangas.add(new Manga(10L, "Aaragon", 7.5, 0));

        while(!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }



    }
}
