import br.inatel.cdg.arkanoid.Bloco;
import br.inatel.cdg.arkanoid.Conversor;
import br.inatel.cdg.arkanoid.Jogador;

public class Main {
    public static void main(String[] args) {

        Bloco b1 = new Bloco();
        Bloco b2 = new Bloco();
        Bloco b3 = new Bloco();
        Bloco b4 = new Bloco();
        Bloco b5 = new Bloco();
        Jogador jogador = new Jogador();

        System.out.println("Blocos em jogo: " + Bloco.getNumBlocos());

        jogador.destruirBloco(b1);
        System.out.println("Blocos em jogo: " + Bloco.getNumBlocos());

        jogador.destruirBloco(b2);
        System.out.println("Blocos em jogo: " + Bloco.getNumBlocos());

        jogador.destruirBloco(b3);
        System.out.println("Blocos em jogo: " + Bloco.getNumBlocos());

        jogador.destruirBloco(b4);
        System.out.println("Blocos em jogo: " + Bloco.getNumBlocos());

        jogador.destruirBloco(b5);
        System.out.println("Blocos em jogo: " + Bloco.getNumBlocos());

        int pontos = jogador.getPontos();
        Conversor.converter(pontos);
    }
}
