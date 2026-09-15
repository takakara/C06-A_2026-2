package br.inatel.cdg.brownie.sabores;
import br.inatel.cdg.brownie.Brownie;

public class BrownieCafe extends Brownie {

    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaCafe()
    {
        System.out.println(super.nome + " Adicionando mais café");
    }

    public void addCarrinhoDeCompras()
    {
        System.out.println(this.nome + " Adicionado no carrinho de compras");
    }
}
