package projectsidea.devdojo.maratonajava.java.core.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> devdojoDevs = List.of("Murilo", "Jonas", "Ana");
        List<String> devdojoAnalistas = List.of("Tiago", "Ricardo");
        List<String> clientes = List.of("Seara", "Denso","Te Connectivy");
        devdojo.add(devdojoDevs);
        devdojo.add(devdojoAnalistas);
        devdojo.add(clientes);


        for (List<String> pessoas : devdojo) {
            for (String pessoa : pessoas) {
                System.out.println(pessoa);
            }
        }

        System.out.println("----");

    devdojo.stream().flatMap(Collection::stream).forEach(System.out::println);


    }
}
