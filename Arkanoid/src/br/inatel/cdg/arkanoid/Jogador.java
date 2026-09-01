package br.inatel.cdg.arkanoid;

public class Jogador {

    private int pontos = 0;

    public void destruirBloco(Bloco bloco)
    {
        bloco.destruir();
        pontos++;
    }

    public int getPontos() {
        return pontos;
    }
}
