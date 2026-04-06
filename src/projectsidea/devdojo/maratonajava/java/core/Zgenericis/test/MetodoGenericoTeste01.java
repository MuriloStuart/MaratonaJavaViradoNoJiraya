package projectsidea.devdojo.maratonajava.java.core.Zgenericis.test;

import projectsidea.devdojo.maratonajava.java.core.Jmodificadorfinal.Dominio.Carro;
import projectsidea.devdojo.maratonajava.java.core.Zgenericis.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTeste01 {
    public static void main(String[] args) {
        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Canoa marota"));
        System.out.println(barcoList);

    }

    private static <T> List<T> criarArrayComUmObjeto(T t){
       return List.of(t);
    }
}

