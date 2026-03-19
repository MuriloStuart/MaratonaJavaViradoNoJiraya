package projectsidea.devdojo.maratonajava.java.core.Oexception.exception.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args)  {
       criarNovoArquivo();
    }

    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCcriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCcriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Problema na hora de criar um arquivo");
        }

    }
}
