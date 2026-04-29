package projectsidea.devdojo.maratonajava.java.core.ZZDoptional.test;

import projectsidea.devdojo.maratonajava.java.core.ZZDoptional.Repositorio.MangaRepository;
import projectsidea.devdojo.maratonajava.java.core.ZZDoptional.Repositorio.ProdutoRepository;
import projectsidea.devdojo.maratonajava.java.core.ZZDoptional.domain.Manga;
import projectsidea.devdojo.maratonajava.java.core.ZZDoptional.domain.Produto;
import projectsidea.devdojo.maratonajava.java.core.ZZDoptional.domain.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Exercício 1 — O Básico
//Crie um método chamado buscarNome que recebe uma String como parâmetro. Se a String não for nula e não for vazia, o método deve retornar um Optional contendo esse nome. Caso contrário, deve retornar um Optional vazio.
//
//        💡 Pesquise sobre: Optional.of(), Optional.empty() e Optional.ofNullable()
//
//
//Exercício 2 — Trabalhando com valores
//Crie uma lista de emails (alguns podem ser null). Percorra essa lista e, usando Optional, imprima apenas os emails válidos (não nulos). Para os nulos, imprima a mensagem "Email não informado".
//
//        💡 Pesquise sobre: isPresent(), orElse()
//
//
//Exercício 3 — Encadeando operações
//Você tem uma classe Usuario com os atributos nome e email. Crie um método que receba um Optional<Usuario> e retorne o email do usuário em letras maiúsculas. Se o usuário não existir, retorne "Usuário não encontrado".
//
//        💡 Pesquise sobre: map() e orElse() no Optional
//
//
//Exercício 4 — Lançando exceção
//Crie um método que busca um produto pelo ID em uma lista. Se o produto não for encontrado, deve lançar uma IllegalArgumentException com a mensagem "Produto não encontrado". Se for encontrado, retorna o produto.
//
//💡 Pesquise sobre: orElseThrow()
//
//
//Exercício 5 — Desafio 🔥
//Você tem as classes Pedido, Cliente e Endereco. Um Pedido pode ter um Cliente, e um Cliente pode ter um Endereco. Todos os relacionamentos são opcionais (podem ser nulos). Crie um método que, dado um Pedido, retorne a cidade do cliente. Se qualquer parte da cadeia não existir, retorne "Cidade não disponível".
//
//        💡 Pesquise sobre: encadeamento de flatMap() com Optional

public class OptionalTest03IADesafios {
    public static void main(String[] args) {
//        Exercicio 1
//        Optional<String> a = buscarNome("");
//        System.out.println(a);
//        buscarNome("").ifPresentOrElse(System.out::println, () -> System.out.println("Nenhum nome"));

//        Exercicio2
//        List<String> strings = Arrays.asList("murilo@hotmail.com", "ana@hotmail.com", null, "maria@hotmail.com", null);
//        buscarEmailValido(strings);

//        Exercicio3
//        List<Usuario> usuarios = List.of(
//                new Usuario("Murilo", "stuartmurilo10@gmail.com"),
//                new Usuario("João", "joao@gmail.com"),
//                new Usuario("Carla", "carla@gmail.com"),
//                new Usuario("Ana Gabriela vulgo comivel", "ana@gmail.com"),
//                new Usuario(null, null)
//                );
//
//        Optional<Usuario> usuarioOptional = Optional.ofNullable(usuarios.get(4));
//        System.out.println(retornaEmailMaisculo(usuarioOptional));

//        Exercicio 4
//       Produto produtoById = ProdutoRepository.findByid("5")
//                .orElseThrow(() -> new IllegalArgumentException("Produto não encontrado"));
//
//        Produto produtoByName = ProdutoRepository.findByName("Xbox")
//                .orElseThrow(() -> new IllegalArgumentException("Produto não encontrado"));
//
//       // System.out.println(produtoById);
//        System.out.println(produtoByName);



    }


    private static String retornaEmailMaisculo(Optional<Usuario> usuario) {
        return usuario.map(Usuario::getEmail).map(String::toUpperCase).orElse("Usuario Não Encontrado");
    }


    private static void buscarEmailValido(List<String> strings) {
        for (String email : strings) {
            Optional.ofNullable(email).ifPresentOrElse(System.out::println, () -> System.out.println("Email invalido"));
        }
    }


    private static Optional<String> buscarNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(nome);
    }
}
