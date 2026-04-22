package projectsidea.devdojo.maratonajava.java.core.ZZClambdas.test;

import projectsidea.devdojo.maratonajava.java.core.ZZClambdas.dominio.Anime;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("Murilo", "João", "Marlos"));
        strings.sort(String::compareTo);
        System.out.println(strings);
        Function<String, Integer> numStringToInteger = Integer::parseInt;
        Integer numero = numStringToInteger.apply("25");
        System.out.println(numero);

        BiPredicate<List<String>,String> checkName = List::contains;

        System.out.println(checkName.test(strings, "João"));


    }
}
