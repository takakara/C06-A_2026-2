package PCMania.Cliente;

import PCMania.Promocao.Computador;

public class Cliente {

    private String nome;
    private String cpf;
    private Computador[] computador = new Computador[4];

    public void setComputador(Computador[] computador) {
        this.computador = computador;
    }

    public Cliente(String nome, String cpf)
    {
        this.nome = nome;
        this.cpf = cpf;
    }

    public float calculaTotalCompra()
    {
        float total = 0;
        for(int i = 0; i < computador.length; i++) {
            total += this.computador[i].getPreco();
        }
        return total;
    }
}
