package br.inatel.cdg.brownie.comprador;

import br.inatel.cdg.brownie.Brownie;

public class Comprador {

    String nome;
    double saldo;

    public Comprador(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void efetuarCompra(Brownie brownie)
    {
        if(this.saldo < brownie.getPreco())
        {
            System.out.println("Saldo insuficiente");
        }
        else {
            System.out.println("Comprando " + brownie.getNome());
            this.saldo -= brownie.getPreco();
            System.out.println("Saldo atual: " + this.saldo);
        }
    }
}
