package projectsidea.devdojo.maratonajava.java.core.ZZEstreams.test;

//Desafio 1 — 🟢 Fácil
//Use Stream.iterate() e reduce para somar todos os números de 1 a 10.
//Resultado esperado:
//Soma: 55
//
//Desafio 2 — 🟢 Fácil
//Use Stream.generate() para gerar 8 números aleatórios entre 0 e 100 e imprima cada um.
//
//        💡 Dica: Math.random() retorna um double entre 0.0 e 1.0
//
//
//Desafio 3 — 🟡 Médio
//Dada a lista abaixo, use stream() e reduce para encontrar o maior número da lista sem usar .max():
//javaList<Integer> numeros = List.of(3, 17, 8, 42, 5, 99, 23);
//Resultado esperado:
//Maior: 99
//
//Desafio 4 — 🟡 Médio
//Use Stream.iterate() para gerar a sequência de Fibonacci e imprima os primeiros 8 termos.
//Resultado esperado:
//        0, 1, 1, 2, 3, 5, 8, 13
//
//        💡 Dica: você vai precisar guardar dois valores ao mesmo tempo. Pense em usar um array ou int[] como semente.
//
//
//        Desafio 5 — 🔴 Difícil
//Use Stream.iterate() + reduce para calcular o fatorial de um número N (use N = 6).
//Resultado esperado:
//        6! = 720

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10IADesafio {
    public static void main(String[] args) {
        // EX1
//        Stream.iterate(1, i -> i + 1).limit(10)
//                .reduce(Integer::sum).ifPresentOrElse(System.out::println, () -> System.out.println("não tem"));

        //EX2
//        ThreadLocalRandom random = ThreadLocalRandom.current();
//
//        Stream.generate(() -> random.nextInt(1,100) )
//                .limit(8)
//                .forEach(System.out::println);

//      EX3
//        List<Integer> numeros = List.of(3, 17, 8, 42, 5, 99, 23);
//               numeros.stream()
//                .reduce((a, b) -> a > b ? a : b).ifPresent(System.out::println);

        //EX4
//        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
//                .limit(8)
//                .map(n -> n[0])
//                .forEach(System.out::println);

        //EX5
        Stream.iterate(1, i -> i + 1)
                .limit(6)
                .reduce((a, b) -> a * b).ifPresent(System.out::println);


    }
}
