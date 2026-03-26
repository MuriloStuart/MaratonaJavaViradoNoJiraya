package projectsidea.devdojo.maratonajava.java.core.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> listToArray = new ArrayList<>();
        listToArray.add(1);
        listToArray.add(80);
        listToArray.add(14);

        //Object[] array = numeros.toArray();
        Integer[] integers = listToArray.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integers));

        System.out.println("--------------");

        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 80;
        numerosArray[2] = 80;

        List<Integer> arrayToList = Arrays.asList(numerosArray);
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);

        System.out.println("--------");
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));
        numerosList.add(50);
        numerosList.set(0,15);
        System.out.println(numerosList);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
    }
}
