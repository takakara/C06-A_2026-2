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
        System.out.println("Calculando valor total da compra");
        System.out.println("Valor total da compra: " + this.preco);
    }

    public void mostraInfo()
    {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
