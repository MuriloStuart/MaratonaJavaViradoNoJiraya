package projectsidea.devdojo.maratonajava.java.core.Ycolecoes.test;

import projectsidea.devdojo.maratonajava.java.core.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("1ABC2", "Iphone");
        Smartphone smartphone2 = new Smartphone("1ABC2", "Iphone");
        System.out.println(smartphone1.equals(smartphone2));
        System.out.println(smartphone1.hashCode() == smartphone2.hashCode());


    }
}
