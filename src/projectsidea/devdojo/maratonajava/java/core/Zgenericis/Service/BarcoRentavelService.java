package projectsidea.devdojo.maratonajava.java.core.Zgenericis.Service;

import projectsidea.devdojo.maratonajava.java.core.Zgenericis.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"),new Barco("Iate")));

    public Barco buscarBarcoDispinivel() {
        System.out.println("Buscando barco disponivel.....");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando barco: " +barco);
        System.out.println("Barcos disponiveis para alugar:");
        System.out.println(barcosDisponiveis);
        return barco;
    }

    public void retornarBarcoAlugado(Barco c) {
        System.out.println("Retornando barco alugado " + c);
        barcosDisponiveis.add(c);
        System.out.println("Barcos disponiveis para alugar: ");
        System.out.println(barcosDisponiveis);
    }


}
