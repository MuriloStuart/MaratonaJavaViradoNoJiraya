package projectsidea.devdojo.maratonajava.java.core.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(); // versão 1.5
        List<String> nomes2 = new ArrayList<>(); // versão 1.5
        nomes.add("Murilo");
        nomes.add("DevDojo");
        nomes2.add("Juju");
        nomes2.add("Catolica");
        nomes.addAll(nomes2);

        for(String nome : nomes){
            System.out.println(nome);
        }

        List <Integer> numeros = new ArrayList<>();
        numeros.add(1);


    }
}
