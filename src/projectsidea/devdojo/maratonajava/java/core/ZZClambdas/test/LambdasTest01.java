package projectsidea.devdojo.maratonajava.java.core.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdasTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("Murilo", "Wiliiam", "Naruto", "Goku");
        forEach(strings, System.out::println);
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }

    }
}
