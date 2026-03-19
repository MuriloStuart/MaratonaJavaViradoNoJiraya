package projectsidea.devdojo.maratonajava.java.core.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        extracted();
    }

    public static String extracted() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }
}

