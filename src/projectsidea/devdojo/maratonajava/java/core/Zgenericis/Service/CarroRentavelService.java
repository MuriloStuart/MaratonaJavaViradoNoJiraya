package projectsidea.devdojo.maratonajava.java.core.Zgenericis.Service;

import projectsidea.devdojo.maratonajava.java.core.Zgenericis.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"),new Carro("Mercedes")));

    public Carro buscarCarroDispinivel() {
        System.out.println("Buscando carro disponivel.....");
        Carro c = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: " +c);
        System.out.println("Carros disponiveis para alugar:");
        System.out.println(carrosDisponiveis);
        return c;
    }

    public void retornarCarroAlugado(Carro c) {
        System.out.println("Retornando carro alugado " + c);
        carrosDisponiveis.add(c);
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println(carrosDisponiveis);
    }


}
