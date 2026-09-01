public class Main {
    public static void main(String[] args) {

        Kart kart1 = new Kart();
        Piloto piloto1 = new Piloto();

        piloto1.nome = "Mario";
        piloto1.vilao = false;
        kart1.piloto = piloto1;

        kart1.motor.cilindradas = "150";
        kart1.nome = "Big Horn";
        kart1.motor.velocidadeMaxima = 200;
    }
}
