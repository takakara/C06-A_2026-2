import java.util.Random;

public class Campo {

    Bomba bomba = new Bomba();
    int i, j;
    int quantSeguros = 0, segurosVisit = 0;
    Random rand = new Random();
    int x;

    void preencher()
    {
        for(i = 0; i < bomba.posicao.length; i++)
        {
            for(j = 0; j < bomba.posicao[i].length; j++)
            {
                x = rand.nextInt(2);
                if(x == 0)
                    quantSeguros++;
                bomba.posicao[i][j] = x;
            }
        }
    }

    boolean jogando(Jogador jogador)
    {
        if (bomba.posicao[jogador.linhas][jogador.colunas] == 0){
            System.out.println("Posição Segura");
            segurosVisit++;
        } else if(bomba.posicao[jogador.linhas][jogador.colunas] == 1) {
            System.out.println("Bomba encontrada, tente novamente");
            segurosVisit = 0;
        }
        return segurosVisit != quantSeguros;
    }
}