package projectsidea.devdojo.maratonajava.java.core.Jmodificadorfinal.Teste;

import projectsidea.devdojo.maratonajava.java.core.Jmodificadorfinal.Dominio.Carro;
import projectsidea.devdojo.maratonajava.java.core.Jmodificadorfinal.Dominio.Comprador;
import projectsidea.devdojo.maratonajava.java.core.Jmodificadorfinal.Dominio.Ferrari;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador2 = new Comprador();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Murilo");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("F40");
        ferrari.imprime();

    }
}
