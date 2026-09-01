public class Cantina {

    String nome;
    Salgado[] salgado = new Salgado[3];

    void addSalgado(Salgado novoSalgado)
    {
        for(int i = 0; i < 3; i++)
        {
            salgado[i] = novoSalgado;
        }
    }

    void mostraInfo()
    {
        for (int i = 0; i < 3; i++){
            System.out.println(salgado[i].nome);
        }
    }
}
