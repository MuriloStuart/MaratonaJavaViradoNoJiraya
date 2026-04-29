package projectsidea.devdojo.maratonajava.java.core.ZZDoptional.Repositorio;

import projectsidea.devdojo.maratonajava.java.core.ZZDoptional.domain.Manga;
import projectsidea.devdojo.maratonajava.java.core.ZZDoptional.domain.Produto;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class ProdutoRepository {
    private static List<Produto> Produtos = List.of(
            new Produto("Xbox"),
            new Produto("TV"),
            new Produto("Notebook"),
            new Produto("Microondas"),
            new Produto("Ar condicionado")
    );


    public static Optional<Produto> findByid(String id) {
        return findBy(Produtos -> Produtos.getId().equals(id));
    }

    public static Optional<Produto> findByName(String name) {
        return findBy(Produtos -> Produtos.getNome().equals(name));
    }


    private static Optional<Produto> findBy (Predicate<Produto> predicate) {
        Produto produto = null;
        for (Produto p : Produtos) {
            if (predicate.test(p)) {
                produto = p;
                break;
            }
        }
        return Optional.ofNullable(produto);
    }
}
