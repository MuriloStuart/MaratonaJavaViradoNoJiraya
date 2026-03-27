package projectsidea.devdojo.maratonajava.java.core.Ycolecoes.test;

import projectsidea.devdojo.maratonajava.java.core.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L,"Attack on Titan",25.8,0));
        mangas.add(new Manga(1L,"Berserk",40,5));
        mangas.add(new Manga(2L,"HunterXHunter",18,0));
        mangas.add(new Manga(4L,"Dragon Ball",12.9,2));
        mangas.add(new Manga(3L,"eshaFights",7.5,0));

/* teste
        Iterator<Manga> mangaIterator = mangas.iterator();
        while (mangaIterator.hasNext()) {
            Manga manga = mangaIterator.next();
            if (manga.getQuantidade() == 0){
                mangaIterator.remove();
            }
        }

*/
        mangas.removeIf(manga -> manga.getQuantidade() == 0);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}
