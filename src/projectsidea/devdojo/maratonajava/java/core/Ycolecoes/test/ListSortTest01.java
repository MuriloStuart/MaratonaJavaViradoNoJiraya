package projectsidea.devdojo.maratonajava.java.core.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Attack on Titan");
        mangas.add("Berserck");
        mangas.add("Hellsing");
        mangas.add("Pokemom");
        mangas.add("Digimon");

        Collections.sort(mangas);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.55);
        dinheiros.add(23D);
        dinheiros.add(25.8);
        dinheiros.add(877.5);

        Collections.sort(dinheiros);


        System.out.println(mangas);

//        for (Double d : dinheiros){
//            System.out.println(d);
//        }
        System.out.println(dinheiros);
    }
}
