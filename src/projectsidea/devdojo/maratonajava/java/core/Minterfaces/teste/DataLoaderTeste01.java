package projectsidea.devdojo.maratonajava.java.core.Minterfaces.teste;

import projectsidea.devdojo.maratonajava.java.core.Minterfaces.dominio.DataBaseLoader;
import projectsidea.devdojo.maratonajava.java.core.Minterfaces.dominio.DataLoader;
import projectsidea.devdojo.maratonajava.java.core.Minterfaces.dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        DataBaseLoader databaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retriveMaxDataSize();
        DataBaseLoader.retriveMaxDataSize();
    }


}
