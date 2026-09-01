package br.inatel.cdg.arkanoid;

public class Conversor {

    public static void converter(int pontos)
    {
        System.out.println("Sua pontuação foi de: " + pontos);
        System.out.println("Você ganhou " + (pontos * 100) + " moedas");
    }
}
