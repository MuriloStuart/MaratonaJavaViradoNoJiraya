package projectsidea.devdojo.maratonajava.java.core.ZZEstreams.test;

import java.util.ArrayList;
import java.util.List;

public class StreamTest07 {
    public static void main(String[] args) {
        List<Integer> lista = List.of(1, 2, 3, 4, 5, 6);
        lista.stream().reduce((x,y) -> x+y).ifPresent(System.out::println);
        System.out.println(lista.stream().reduce(1, (x, y) -> x+y));
        lista.stream().reduce(Integer::sum).ifPresent(System.out::println);

        lista.stream().reduce((x,y) -> x > y ? x :y).ifPresent(System.out::println);
        System.out.println(lista.stream().reduce(Integer::max));




    }
}
