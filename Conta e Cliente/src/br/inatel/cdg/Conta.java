package br.inatel.cdg;

public class Conta {

    private int numero;
    private int i = 1;
    private float saldo;
    private float limite = 1000;
    private Cliente[] cliente;

    public Conta() {
        cliente = new Cliente[3];
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void sacar(float quantia)
    {
        if(this.saldo < quantia || quantia > this.limite)
            System.out.println("Saque Negado");
        else
            this.saldo -= quantia;
    }

    public void depositar(float quantia)
    {
        this.saldo += quantia;
    }

    public void setCliente(Cliente[] cliente) {
        this.numero = i;
        this.cliente = cliente;
        i++;
    }

    public void getCliente(int i) {
        System.out.println(cliente[i].getNome());
        System.out.println(cliente[i].getCpf());
    }

    public boolean existeConta(int i)
    {
        boolean existe;
        if(cliente[i] == null)
            existe = false;
        else
            existe = true;

        return existe;
    }

}
