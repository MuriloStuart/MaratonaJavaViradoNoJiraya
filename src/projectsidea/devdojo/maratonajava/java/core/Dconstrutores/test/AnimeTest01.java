package projectsidea.devdojo.maratonajava.java.core.Dconstrutores.test;


import projectsidea.devdojo.maratonajava.java.core.Dconstrutores.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Akudama Drive","TV",12, "Ação", "Production IG");
        Anime anime2 = new Anime();
        //anime.init("Akudama Drive","TV",12);
        //anime.init("Akudama Drive","TV",12, "Ação");
        //anime.setGenero("Ação");
        anime.imprime();

    }
}
