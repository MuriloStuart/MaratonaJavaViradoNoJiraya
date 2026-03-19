package projectsidea.devdojo.maratonajava.java.core.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("File.txt");

        try (FileWriter fw = new FileWriter(file,true);
             BufferedWriter br = new BufferedWriter(fw)){
            br.write("O devdojo é mais ou menos e é o unico jurso do brasil rsrsrsrssrsr");
            br.newLine();
            br.flush();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
