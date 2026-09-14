package br.inatel.cdg.brownie.sabores;
import br.inatel.cdg.brownie.Brownie;

public class BrownieNutella extends Brownie {

    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaNutella()
    {
        System.out.println(super.nome + " Adicionando mais nutella");
    }
}
