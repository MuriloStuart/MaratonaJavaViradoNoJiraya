package projectsidea.devdojo.maratonajava.java.core.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "     Java   ";
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        int [] nums = {1,2,3};
        System.out.println(nome.length());
        System.out.println(nome.replace("a","u"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(3,5));
        System.out.println(nome.trim());
    }
}
