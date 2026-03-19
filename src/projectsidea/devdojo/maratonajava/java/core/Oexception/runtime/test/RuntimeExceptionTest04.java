package projectsidea.devdojo.maratonajava.java.core.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException |IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro de ArrayIndexOutOfBoundsException |IllegalArgumentException | ArithmeticException");
        } catch (IndexOutOfBoundsException e ){
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (RuntimeException e){
            System.out.println("Dentro de um RuntimeException");
        }

        try {
            talvezLanceException();
        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException, IOException {

    }


}

