package Exercicios;

import java.util.Scanner;

public class ExLogica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        int soma = 0;
        System.out.println("Digte um numero inteiro:");
        numero = input.nextInt();
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                soma += i;
            }
        }
        if(numero == 0){
            System.out.println("0 não é um numero perfeito");
        } else if (soma == numero) {
            System.out.println("Numero Pefeito");
        } else {
            System.out.println("Não é um numero perfeito");
        }




    }
}
