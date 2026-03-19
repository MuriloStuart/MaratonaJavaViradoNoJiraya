package projectsidea.devdojo.maratonajava.java.core.Kenum.teste;

import projectsidea.devdojo.maratonajava.java.core.Kenum.dominio.Cliente;
import projectsidea.devdojo.maratonajava.java.core.Kenum.dominio.TipoCliente;
import projectsidea.devdojo.maratonajava.java.core.Kenum.dominio.TipoPagamento;

import java.util.Scanner;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA,TipoPagamento.DEBITO);
        Cliente cliente3 = new Cliente("Dala");
        System.out.println("Digite o tipo de cliente");
        String tipoClienteInput = input.next();
        TipoCliente tipoCliente1 = TipoCliente.valueOf(tipoClienteInput);





    }
}
