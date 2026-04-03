package projectsidea.devdojo.maratonajava.java.core.Zgenericis.test;

import projectsidea.devdojo.maratonajava.java.core.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {

        List<String> lista = new ArrayList();
        lista.add("murilo");
        lista.add("ana");
        lista.add("Isabela");

        for (String s : lista) {
            System.out.println(s);
        }

        add(lista, new Consumidor("Muaua"));

    }

    private static void add(List lista, Consumidor consumidor) {
        lista.add(consumidor);
    }
}
