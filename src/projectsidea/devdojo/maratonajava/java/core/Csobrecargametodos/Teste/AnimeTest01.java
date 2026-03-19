package projectsidea.devdojo.maratonajava.java.core.Csobrecargametodos.Teste;

import projectsidea.devdojo.maratonajava.java.core.Csobrecargametodos.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive","TV",12);
        anime.init("Akudama Drive","TV",12, "Ação");
        anime.setGenero("Ação");
        anime.imprime();
    }
}
