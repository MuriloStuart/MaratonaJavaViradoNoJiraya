package projectsidea.devdojo.maratonajava.java.core.Uregex;

import java.util.Scanner;

public class ScannerExercicios {
    public static void main(String[] args) {
       /* Exercicio 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome completo");
        String nomeCompleto = scanner.nextLine();
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();
        System.out.println(nomeCompleto);
        System.out.println(idade);
        System.out.println(altura);*/

        //Exercicio 2

        String dados = "João,    25, São Paulo, Engenheiro";
        String[] nomes = dados.split(",");
        for (String nome : nomes){
            System.out.println(nome.trim());
        }
    }
}
