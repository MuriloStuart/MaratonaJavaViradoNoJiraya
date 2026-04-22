package projectsidea.devdojo.maratonajava.java.core.ZZDoptional.test;

import projectsidea.devdojo.maratonajava.java.core.ZZDoptional.Repositorio.MangaRepository;
import projectsidea.devdojo.maratonajava.java.core.ZZDoptional.domain.Manga;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Naruto");
        mangaByTitle.ifPresent(m -> m.setTitle("Naruto Shipudden"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findByid(2)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        Manga manga = MangaRepository.findByTitle("Drifters")
                .orElseGet(() -> new Manga(4, "Drifters", 20));

        System.out.println(manga);

    }
}
