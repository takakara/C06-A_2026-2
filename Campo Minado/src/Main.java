public class Main {
    public static void main(String[] args) {

        Jogador jogador = new Jogador();
        Campo campo = new Campo();
        boolean jogar = true;

        campo.preencher();

        while(jogar)
        {
            System.out.println("Insira a linha que você quer visitar");
            jogador.linhas = jogador.entradaLinhas.nextInt();
            System.out.println("Insira a coluna que você quer visitar");
            jogador.colunas = jogador.entradaColunas.nextInt();
            jogar = campo.jogando(jogador);
        }

        jogador.entradaLinhas.close();
        jogador.entradaColunas.close();
    }
}