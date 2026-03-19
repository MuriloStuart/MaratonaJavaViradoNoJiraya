package projectsidea.devdojo.maratonajava.java.core.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = tudu que não for digito
        // \s= espaços em branco
        // \S = todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, digitos, _
        // \W = tudo que não for incluso no \w
        // []

        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n a m
        // ()
        // | o(v|c) ovo | oco
        // $
        // . 1.3, 123,

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "fulano@hotmail.com, 123jotaro@gmail.con, #@!zoro@gmail.com teste@gmail.com.br sakura@mail";
        System.out.println("Email valido:");
        System.out.println("zoro@gmail.com.br".matches(regex));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto  " +texto);
        System.out.println("Indice: 0123456789");
        System.out.println("regex  " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group()+"\n");
        }



      
    }
}
