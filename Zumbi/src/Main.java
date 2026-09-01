public class Main {

    public static void main(String[] args) {

        Zumbi zumbi1 = new Zumbi();
        zumbi1.vida = 1000;
        zumbi1.nome = "Robson";

        Zumbi zumbi2 = new Zumbi();
        zumbi2.vida = 2000;
        zumbi2.nome = "Gerson";

        zumbi1.transfereVida(zumbi2, 500);
        System.out.println(zumbi2.mostraVida());
    }
}
