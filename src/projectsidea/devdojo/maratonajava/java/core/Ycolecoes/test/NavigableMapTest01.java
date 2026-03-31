package projectsidea.devdojo.maratonajava.java.core.Ycolecoes.test;


import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
//        Consumidor consumidor1 = new Consumidor("Murilo");
//        Consumidor consumidor2 = new Consumidor("DevDojo Academy");
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letra A");
        map.put("D", "Letra D");
        map.put("B", "Letra B");
        map.put("C", "Letra C");
        map.put("E", "Letra E");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println(map.headMap("C",true));
        // Head map é tudo que vem antes

        System.out.println(map.higherKey("D"));


    }
}
