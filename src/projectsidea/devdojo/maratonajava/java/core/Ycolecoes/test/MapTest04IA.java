package projectsidea.devdojo.maratonajava.java.core.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest04IA {
    public static void main(String[] args) {
        String frase = "java é legal e java é rápido";
        String[] palavras = frase.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String palavra : palavras) {
            map.putIfAbsent(palavra, 0);
            map.put(palavra, map.get(palavra) + 1);
        }

        System.out.println(map);


    }
}
