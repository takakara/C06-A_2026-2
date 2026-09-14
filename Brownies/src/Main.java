import br.inatel.cdg.brownie.sabores.BrownieCafe;
import br.inatel.cdg.brownie.sabores.BrownieDoceDeLeite;
import br.inatel.cdg.brownie.sabores.BrownieNutella;

public class Main {
    public static void main(String[] args) {

        BrownieNutella Nutella = new BrownieNutella("Brownie de Nutella", 20, "Nutella");
        BrownieCafe Cafe = new BrownieCafe("Brownie de Cafe", 20, "Cafe");
        BrownieDoceDeLeite DoceDeLeite = new BrownieDoceDeLeite("Brownie de Doce de Leite", 20, "Doce de Leite");

        Nutella.mostraInfo();
        Cafe.mostraInfo();
        DoceDeLeite.mostraInfo();

        Nutella.adicionaNutella();
        Cafe.adicionaCafe();
        DoceDeLeite.adicionaDoceDeLeite();

        Nutella.addCarrinhoDeCompras();
        Nutella.calculaValorTotalCompra();

        Cafe.addCarrinhoDeCompras();
        Cafe.calculaValorTotalCompra();

        DoceDeLeite.addCarrinhoDeCompras();
        DoceDeLeite.calculaValorTotalCompra();
    }
}
