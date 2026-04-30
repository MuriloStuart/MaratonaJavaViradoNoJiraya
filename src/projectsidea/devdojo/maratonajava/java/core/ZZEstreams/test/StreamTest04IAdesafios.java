package projectsidea.devdojo.maratonajava.java.core.ZZEstreams.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest04IAdesafios {
//    Exercício 1 — filter + collect
//
//    Dada a lista ["Ana", "Bruno", "Alice", "Carlos", "Amanda"], retorne apenas os nomes que começam com a letra "A" em uma nova lista.
//
//    Exercício 2 — map
//
//    Dada a lista [1, 2, 3, 4, 5], use .map() para criar uma nova lista onde cada número está elevado ao quadrado.
//
//    Exercício 3 — count
//
//    Dada a lista [10, 25, 3, 47, 8, 99, 12], conte quantos números são maiores que 20.
//
//    Exercício 4 — sorted + distinct
//
//    Dada a lista [5, 3, 5, 1, 2, 3, 4, 1], remova os duplicados e ordene em ordem crescente.
//
//    Exercício 5 — Desafio 🔥
//
//    Dada a lista ["banana", "abacaxi", "uva", "manga", "abacate"], retorne os nomes que têm mais de 5 letras, em maiúsculo, e ordenados alfabeticamente.
//

    public static void main(String[] args) {
//        exercicio 1
//        List<String> nomes = new ArrayList<>(List.of("Ana", "Bruno", "Alice", "Carlos", "Amanda"));
//        List<String> nomesComA = nomes.stream()
//                .filter(s -> s.toUpperCase().charAt(0) == 'A')
//                .collect(Collectors.toList());
//        System.out.println(nomesComA);

//        exercicio 2
        List<Integer> numeros = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> numerosElevadosAoQuadrado = numeros.stream()
                .map(i -> i * i)
                .collect(Collectors.toList());

        System.out.println(numerosElevadosAoQuadrado);
    }
}
