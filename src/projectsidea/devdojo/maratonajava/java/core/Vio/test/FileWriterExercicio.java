package projectsidea.devdojo.maratonajava.java.core.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterExercicio {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome completo");
       // String nome = scanner.nextLine();
        System.out.println("Digite sua idade");
       // int idade = scanner.nextInt();
        System.out.println("Digite sua altura");
       // double altura = scanner.nextDouble();
        int teste = 0;




        File file = new File("cadastro.txt");

        try {
            boolean exists = file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (FileWriter fw = new FileWriter(file,true)){
            fw.write("alo");
        } catch (IOException ex) {
            ex.printStackTrace();
        }



    }
}
