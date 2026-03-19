package projectsidea.devdojo.maratonajava.java.core.Oexception.error.Teste;

public class StackOverflowTeste01 {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }
}
