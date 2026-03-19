package projectsidea.devdojo.maratonajava.java.core.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = tudu que não for digito
        // \s= espaços em branco
        // \S = todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, digitos, _
        // \W = tudo que não for incluso no \w
        // []
        //String regex = "[a-zA-C]";
        String regex = "0[xX][\\da-fA-F]";
        //String texto = "abaaba";
        String texto2 = "12 0x 0x 0xFFFABC 0x109 0x1";
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
