package projectsidea.devdojo.maratonajava.java.core.Oexception.exception.teste;

import projectsidea.devdojo.maratonajava.java.core.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTeste01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Usuario");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha");
        String senhaDigitado = teclado.nextLine();


        if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitado)) {
            throw new LoginInvalidoException("Usuario ou senha invalidos");
        }

        System.out.println("Usuario logado com sucesso");
    }
}
