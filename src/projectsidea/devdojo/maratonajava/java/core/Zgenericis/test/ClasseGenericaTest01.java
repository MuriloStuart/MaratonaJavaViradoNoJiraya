package projectsidea.devdojo.maratonajava.java.core.Zgenericis.test;

import projectsidea.devdojo.maratonajava.java.core.Zgenericis.Service.CarroRentavelService;
import projectsidea.devdojo.maratonajava.java.core.Zgenericis.dominio.Carro;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDispinivel();
        System.out.println("Usando o carro por um mês....");
        carroRentavelService.retornarCarroAlugado(carro);
    }


}
