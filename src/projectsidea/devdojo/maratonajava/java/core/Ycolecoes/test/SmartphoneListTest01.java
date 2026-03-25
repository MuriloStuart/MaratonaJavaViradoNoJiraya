package projectsidea.devdojo.maratonajava.java.core.Ycolecoes.test;

import projectsidea.devdojo.maratonajava.java.core.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("1ABC2", "Iphone");
        Smartphone smartphone2 = new Smartphone("22222", "Pixel");
        Smartphone smartphone3 = new Smartphone("33333", "Sansung");
        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(smartphone1);
        smartphones.add(smartphone2);
        smartphones.add(0 ,smartphone3);

        for(Smartphone smartphone:smartphones){
            System.out.println(smartphone);
        }


        Smartphone smartphone4 = new Smartphone("22222", "Pixel");

        boolean contains = smartphones.contains(smartphone4);
        System.out.println(contains);
        int index = smartphones.lastIndexOf(smartphone4);
        System.out.println(index);

        String nome = "murilo";
        System.out.println("nome = " + nome);

    }
}
