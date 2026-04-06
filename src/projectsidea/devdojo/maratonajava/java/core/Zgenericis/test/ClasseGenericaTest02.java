package projectsidea.devdojo.maratonajava.java.core.Zgenericis.test;

import projectsidea.devdojo.maratonajava.java.core.Zgenericis.Service.BarcoRentavelService;
import projectsidea.devdojo.maratonajava.java.core.Zgenericis.dominio.Barco;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDispinivel();
        System.out.println("Usando o carro por um mês....");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }


}
