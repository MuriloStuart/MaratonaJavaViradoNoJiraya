package projectsidea.devdojo.maratonajava.java.core.ZZEstreams.test;

import projectsidea.devdojo.maratonajava.java.core.ZZEstreams.dominio.Funcionario;
import projectsidea.devdojo.maratonajava.java.core.ZZEstreams.dominio.VerificaIdade;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamTest15IADesafios {
    public static void main(String[] ars){
        List<Funcionario> funcionarios = Arrays.asList(
                new Funcionario("Ana Silva",      "TI",       8500.00, 28),
                new Funcionario("Carlos Souza",   "TI",       9200.00, 35),
                new Funcionario("Beatriz Lima",   "RH",       6000.00, 26),
                new Funcionario("Diego Martins",  "RH",       6500.00, 32),
                new Funcionario("Fernanda Costa", "Financeiro", 7800.00, 41),
                new Funcionario("Gabriel Rocha",  "Financeiro", 8100.00, 29),
                new Funcionario("Helena Dias",    "TI",       7600.00, 24),
                new Funcionario("Igor Teixeira",  "Marketing", 5900.00, 27),
                new Funcionario("Julia Neves",    "Marketing", 6300.00, 33),
                new Funcionario("Lucas Almeida",  "Financeiro", 9500.00, 45)
        );

        //funcionarios.forEach(System.out::println);

        // ex1
//        Map<String, List<Funcionario>> ex1 = funcionarios.stream().collect(Collectors.groupingBy(Funcionario::getDepartamento));
//        System.out.println(ex1);
//
//        ex1.forEach((departamento,lista) ->{
//            System.out.println(departamento);
//            lista.forEach(System.out::println);}
//                );

       //ex2
//        Map<String, Long> ex2 = funcionarios.stream().collect(Collectors.groupingBy(Funcionario::getDepartamento, Collectors.counting()));
//        System.out.println(ex2);
//
//        ex3
//        Map<String, Double> ex3 = funcionarios.stream().collect(Collectors.groupingBy(Funcionario::getDepartamento,
//                Collectors.averagingDouble(Funcionario::getSalario)));
//        System.out.println(ex3);

        //ex4
//        Map<String, List<String>> ex4 = funcionarios.stream().collect(Collectors.groupingBy(
//                Funcionario::getDepartamento,
//                Collectors.mapping(Funcionario::getNome, Collectors.toList())
//        ));
//        System.out.println(ex4);

        //ex5

        Map<String, Map<String, List<Funcionario>>> ex5 = funcionarios.stream()
                .collect(Collectors.groupingBy(
                        Funcionario::getDepartamento,
                        Collectors.groupingBy(ln -> ln.getIdade() <= 30 ? "Jovem" : "Senior", Collectors.toList())));
        System.out.println(ex5);


    }

    private static VerificaIdade verificarIdade(Funcionario a){
        return a.getIdade() <= 30 ? VerificaIdade.JOVEM : VerificaIdade.SENIOR;
    }
}
