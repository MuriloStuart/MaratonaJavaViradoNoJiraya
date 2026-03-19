package projectsidea.devdojo.maratonajava.java.core.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//
public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("File.txt");
        int teste = 0;
        try (FileWriter fw = new FileWriter(file,true)){
            fw.write("\nO devdojo é mais ou menos e é o unico jurso do brasil rsrsrsrssrsr\nposso continuar" + teste);
            fw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
