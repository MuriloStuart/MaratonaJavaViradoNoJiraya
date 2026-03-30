package projectsidea.devdojo.maratonajava.java.core.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest04IA {
    public static void main(String[] args) {
        String frase = "java é legal e java é rápido";
        String[] palavras = frase.split(" ");
        Map<String, Integer> map = new HashMap<>();

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Ana", 25);
        map2.put("Ana", 30);
        System.out.println(map2.get("Ana"));




    }
}
