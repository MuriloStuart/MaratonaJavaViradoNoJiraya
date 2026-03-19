package projectsidea.devdojo.maratonajava.java.core.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = tudu que não for digito
        // \s= espaços em branco
        // \S = todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, digitos, _
        // \W = tudo que não for incluso no \w
        String regex = "\\s";
        //String texto = "abaaba";
        String texto2 = " fa fa fa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto  " +texto2);
        System.out.println("Indice: 0123456789");
        System.out.println("regex  " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group()+"\n");
        }
    }
}
