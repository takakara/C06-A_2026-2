import br.inatel.cdg.brownie.comprador.Comprador;
import br.inatel.cdg.brownie.sabores.BrownieCafe;
import br.inatel.cdg.brownie.sabores.BrownieDoceDeLeite;
import br.inatel.cdg.brownie.sabores.BrownieNutella;

public class Main {
    public static void main(String[] args) {

        BrownieNutella Nutella = new BrownieNutella("Brownie de Nutella", 40, "Nutella");
        BrownieCafe Cafe = new BrownieCafe("Brownie de Cafe", 30, "Cafe");
        BrownieDoceDeLeite DoceDeLeite = new BrownieDoceDeLeite("Brownie de Doce de Leite", 20, "Doce de Leite");
        Comprador comprador = new Comprador("Yuri", 200);

        Nutella.mostraInfo();
        Cafe.mostraInfo();
        DoceDeLeite.mostraInfo();

        System.out.println(" ");

        Nutella.adicionaNutella();
        Cafe.adicionaCafe();
        DoceDeLeite.adicionaDoceDeLeite();

        System.out.println(" ");

        Nutella.addCarrinhoDeCompras();
        Nutella.calculaValorTotalCompra();

        System.out.println(" ");

        Cafe.addCarrinhoDeCompras();
        Cafe.calculaValorTotalCompra();

        System.out.println(" ");

        DoceDeLeite.addCarrinhoDeCompras();
        DoceDeLeite.calculaValorTotalCompra();

        System.out.println(" ");

        comprador.efetuarCompra(Nutella);
        comprador.efetuarCompra(Cafe);
        comprador.efetuarCompra(DoceDeLeite);
    }
}
