package projectsidea.devdojo.maratonajava.java.core.Bindrotucaometodos.teste;

import projectsidea.devdojo.maratonajava.java.core.Bindrotucaometodos.dominio.Calculadora;
import projectsidea.devdojo.maratonajava.java.core.Bindrotucaometodos.dominio.Estudante;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,5);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros02(20,0));
        System.out.println("-------------");
        calculadora.imprimeDivisaDeDoisNumeros(86,0);
    }
}

