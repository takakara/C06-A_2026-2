public class Main {

    public static void main(String[] args) {

        Personagem personagem = new Personagem();
        Arma arma = new Arma();

        personagem.nome = "Joao";
        personagem.pontos = 40;
        arma.nome = "Pistola";
        arma.poder = 40;
        arma.resistencia = 30;
        arma.descricao = "Pistola semi-automática";
        personagem.arma = arma;

        personagem.arma.mostrarinfoArma();
        personagem.tomarDano();
        personagem.usarArma();
        System.out.println(personagem.pontos);
        System.out.println(arma.resistencia);
    }
}
