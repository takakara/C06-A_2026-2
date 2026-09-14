package br.inatel.cdg.brownie;

public class Brownie {

    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras()
    {
        System.out.println(this.nome + " Adicionado no carrinho de compras");
    }

    public void calculaValorTotalCompra()
    {
        System.out.println(this.nome + " Calculando valor total de compras");
        System.out.println("Valor total de compras: " + this.preco);
    }

    public void mostraInfo()
    {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
    }
}
