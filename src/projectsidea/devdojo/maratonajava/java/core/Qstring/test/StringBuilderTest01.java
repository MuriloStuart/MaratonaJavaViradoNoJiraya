package projectsidea.devdojo.maratonajava.java.core.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Murilo Stuart";
        nome.concat(" Aluno");
        nome.substring(0,3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Murilo Stuart");
        sb.append(" Aluno").append(" Da Catloica");
        System.out.println(sb);
        sb.reverse();
        sb.reverse();
        System.out.println(sb);

    }
}
