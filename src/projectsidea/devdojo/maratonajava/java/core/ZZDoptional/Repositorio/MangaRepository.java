package projectsidea.devdojo.maratonajava.java.core.ZZDoptional.Repositorio;

import projectsidea.devdojo.maratonajava.java.core.ZZDoptional.domain.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> Mangas = List.of(
            new Manga(1,"Boku no Hero",50),
            new Manga(2,"Naruto",300),
            new Manga(1,"Berserk",27)
    );

    public static Optional<Manga> findByTitle(String name) {
        return findBy(mangas -> mangas.getTitle().equals(name));
    }

    public static Optional<Manga> findByid(Integer id) {
        return findBy(mangas -> mangas.getId().equals(id));
    }

    private static Optional<Manga> findBy (Predicate<Manga> predicate) {
        Manga manga = null;
        for (Manga m : Mangas) {
            if (predicate.test(m)) {
                manga = m;
            }
        }
        return Optional.ofNullable(manga);
    }


}
