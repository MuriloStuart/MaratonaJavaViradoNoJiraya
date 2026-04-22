package projectsidea.devdojo.maratonajava.java.core.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdasTest02 {
    public static void main(String[] args) {

        List<String> strings = List.of("Murilo", "Wiliiam", "Naruto", "Goku");
        List<Integer> inteiros = map(strings, String::length);
        List<String> namesToUpperCase = map(strings, String::toUpperCase);
        System.out.println(inteiros);
        System.out.println(namesToUpperCase);

    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            R r = function.apply(t);
            result.add(r);
        }
        return result;
    }
}

