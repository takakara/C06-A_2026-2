package br.inatel.cdg.brownie.sabores;
import br.inatel.cdg.brownie.Brownie;

public class BrownieDoceDeLeite extends Brownie {

    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaDoceDeLeite()
    {
        System.out.println(super.nome + " Adicionando mais doce de leite");
    }

    public void addCarrinhoDeCompras()
    {
        System.out.println(this.nome + " Adicionado no carrinho de compras");
    }
}
