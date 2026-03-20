package projectsidea.devdojo.maratonajava.java.core.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioProjeto = "home/murilo/dev";
        String arquivoDiretorio = "../../arquivo.txt";
        Path path1 = Paths.get(diretorioProjeto, arquivoDiretorio);
        System.out.println(path1);
        System.out.println(path1.normalize());

        Path path2 = Paths.get("/home/./murilo/./dev/");
        System.out.println(path2);
        System.out.println(path2.normalize());

    }
}
