package projectsidea.devdojo.maratonajava.java.core.Aindrotucaoclasses.test;

import projectsidea.devdojo.maratonajava.java.core.Aindrotucaoclasses.dominio.Carro02;

public class CarroTest02 {
    public static void main(String[] args) {
        Carro02 carro01 = new Carro02();
        Carro02 carro02 = new Carro02();

        carro01.nome = "Argo";
        carro01.modelo = "Sedan";
        carro01.ano = 2018;


        carro02.nome = "Up";
        carro02.modelo = "Compacto";
        carro02.ano = 2016;

        System.out.println("O nome do carro é " + carro01.nome + " do modelo " + carro01.modelo + " do ano " + carro01.ano);
        System.out.println("O nome do carro é " + carro02.nome + " do modelo " + carro02.modelo + " do ano " + carro02.ano);


    }
}
