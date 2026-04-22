package projectsidea.devdojo.maratonajava.java.core.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Aha Uhu O devDojo é foda");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("--------------");


        Optional<String> nameOptional = findName("Murilo");
        String s = nameOptional.orElse("EMPTY");
        System.out.println(s);
        nameOptional.ifPresent(s1 -> System.out.println(s1.toUpperCase()));

    }

    private static  Optional<String> findName(String name){
        List<String> list = List.of("Murilo", "Lucas", "Mumu");
        int i = list.indexOf(name);
        if (i != 1){
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
