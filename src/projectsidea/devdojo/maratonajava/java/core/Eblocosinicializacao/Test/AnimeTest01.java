package projectsidea.devdojo.maratonajava.java.core.Eblocosinicializacao.Test;

import projectsidea.devdojo.maratonajava.java.core.Eblocosinicializacao.Domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
            
        }

        System.out.println(anime.getEpisodios());

    }
}
