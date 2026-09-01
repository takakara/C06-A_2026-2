import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

public class Main {
    public static void main(String[] args) {

        Nave nave = new Nave("Arwing", 1000, "Explosivo");
        Asteroide asteroide = new Asteroide("0W500", "Grande");

        nave.atirar(asteroide);
    }
}
