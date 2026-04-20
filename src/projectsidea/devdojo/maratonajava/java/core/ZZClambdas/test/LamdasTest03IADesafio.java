package projectsidea.devdojo.maratonajava.java.core.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

//Você tem uma lista de produtos, onde cada produto tem nome, preço e categoria. Você deve:
//
//Filtrar apenas os produtos de uma categoria específica (qual interface você usaria?)
//Transformar os produtos filtrados aplicando um desconto de 10% no preço (e aqui?)
//Exibir cada produto no console com nome e novo preço (e aqui?)

public class LamdasTest03IADesafio {
    public static void main(String[] args) {

            List<Produto> produtos = List.of(
                    new Produto("Notebook", 3500.00, "eletronico"),
                    new Produto("Cadeira", 800.00, "movel"),
                    new Produto("Mouse", 150.00, "eletronico"),
                    new Produto("Mesa", 1200.00, "movel"),
                    new Produto("Teclado", 200.00, "eletronico")
            );


        //System.out.println(filter(produtos, prod -> prod.getCategoria().equals("eletronico")));

        //List<Double> produtosCom10deDesconto = map(produtos , (Produto prod) -> prod.getPreco() * 0.9);

        Function<Produto, Produto> aplicarDescotoDe10PorCento = produto -> new Produto(produto.getNome(),produto.getPreco() * 0.9 , produto.getCategoria());

        List <Produto> produtosCom10deDesconto = new ArrayList<>();

        for (Produto produto : produtos) {
            Produto produtoCom10Desconto = aplicarDescotoDe10PorCento.apply(produto); // aplica em UM por vez
            produtosCom10deDesconto.add(produtoCom10Desconto); // guarda na lista nova
        }

        System.out.println(produtos);

        System.out.println(produtosCom10deDesconto);





        //System.out.println(produtosCom10deDesconto);


        // Seu código aqui!
        }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                filteredList.add(t);
            }
        }
        return filteredList;
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            R r = function.apply(t);
            result.add(r);
        }
        return result;
    }

}
