package projectsidea.devdojo.maratonajava.java.core.Zgenericis.test;
//Desafio: Crie um método genérico chamado maior que receba dois valores do mesmo tipo e retorne o maior deles. Use Comparable para comparar!


public class WildcardTest03IA {
    public static void main(String[] args) {
        String nome1 = "Java";
        String nome2 = "Java";
        int numero1 = 5;
        int numero2 = 80;

        System.out.println(maior(numero1, numero2));
        System.out.println(maior(nome1, nome2));

    }

    private static <T extends Comparable<T>> T maior(T o1, T o2) {
        if (o1.compareTo(o2) > 0) {
            return o1;
        }
        return o2;
    }

}
