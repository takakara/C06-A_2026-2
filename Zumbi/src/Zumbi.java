public class Zumbi {

    double vida;
    String nome;


    double mostraVida()
    {
        return vida;
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia)
    {
        if (quantia > vida)
        {
            System.out.println("Não é possivel transferir vida");
        }
        else {
            zumbiAlvo.vida += quantia;
            vida -= quantia;
        }
    }
}
