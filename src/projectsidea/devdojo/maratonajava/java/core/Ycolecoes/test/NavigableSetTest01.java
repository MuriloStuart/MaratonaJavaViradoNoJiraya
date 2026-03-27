package projectsidea.devdojo.maratonajava.java.core.Ycolecoes.test;

import projectsidea.devdojo.maratonajava.java.core.Ycolecoes.dominio.Manga;
import projectsidea.devdojo.maratonajava.java.core.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneTestMarcaComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparor implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPrecoManga(), o2.getPrecoManga());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneTestMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparor());

        mangas.add(new Manga(5L, "Attack on Titan", 25.8, 0));
        mangas.add(new Manga(1L, "Berserk", 40, 5));
        mangas.add(new Manga(2L, "HunterXHunter", 18, 0));
        mangas.add(new Manga(4L, "Dragon Ball", 12.9, 2));
        mangas.add(new Manga(3L, "eshaFights", 7.5, 0));
        mangas.add(new Manga(10L, "Aaragon", 7.5, 0));
        mangas.add(new Manga(10L, "Aaragon", 7.5, 0));


        for (Manga manga : mangas) {
            System.out.println(manga);

        }

        Manga yakousou = new Manga(1L, "Yuyu Hakusho", 12.8, 5);
        System.out.println("-----");



        //lower <
        //floor <=
        //higher >
        //ceiling >=
        System.out.println(mangas.lower(yakousou));
        System.out.println(mangas.floor(yakousou));
        System.out.println(mangas.higher(yakousou));
        System.out.println(mangas.ceiling(yakousou));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());


    }
}
