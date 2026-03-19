package projectsidea.devdojo.maratonajava.java.core.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Murilo";
        String nome2 = "Murilo";
        nome =  nome.concat(" Stuart");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Murilo");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
