package projectsidea.devdojo.maratonajava.java.core.Aindrotucaoclasses.test;

import projectsidea.devdojo.maratonajava.java.core.Aindrotucaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "AMG";
        carro1.modelo = "Compacto";
        carro1.ano = 2024;

        carro2.nome = "Fusca";
        carro2.modelo = "Fudido";
        carro2.ano = 1945;

        System.out.println("O primeiro carro tem o nome:" + carro1.nome + " é do modelo:" + carro1.modelo + " do ano:" + carro1.ano);
        System.out.println("O segundo carro tem o nome:" + carro2.nome + " é do modelo:" + carro2.modelo + " do ano:" + carro2.ano);
    }
}
