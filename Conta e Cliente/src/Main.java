import br.inatel.cdg.Cliente;
import br.inatel.cdg.Conta;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Conta conta = new Conta();
        Scanner quantidade = new Scanner(System.in);
        Scanner Entradanome = new Scanner(System.in);
        Scanner Entradacpf = new Scanner(System.in);
        Scanner opcoes = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        int opcao, i;
        Cliente[] cliente = new Cliente[3];

        for (i = 0; i < 3; i++) {
            if (!conta.existeConta(i)) {
                System.out.println("Digite o nome do cliente que você quer cadastrar");
                String nome = Entradanome.next();
                cliente[i].setNome(nome);
                System.out.println("Digite o cpf do cliente que você quer cadastrar");
                long cpf = Entradacpf.nextLong();
                cliente[i].setCpf(cpf);
                conta.setCliente(cliente);
                System.out.println("Digite o limite da conta");
                int limite = quantidade.nextInt();
                conta.setLimite(limite);
            } else {
                System.out.println("Digite a opção que você quer acessar");
                opcao = opcoes.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Digite o valor do deposito");
                        int deposito = quantidade.nextInt();
                        conta.depositar(deposito);
                        break;
                    case 2:
                        System.out.println("Digite o valor do saque");
                        int saque = quantidade.nextInt();
                        conta.sacar(saque);
                        break;
                    case 3:
                        System.out.println("Digite o nome do cliente que você quer cadastrar");
                        String nome = Entradanome.next();
                        cliente[i].setNome(nome);
                        System.out.println("Digite o cpf do cliente que você quer cadastrar");
                        long cpf = Entradacpf.nextLong();
                        cliente[i].setCpf(cpf);
                        conta.setCliente(cliente);
                        System.out.println("Digite o limite da conta");
                        int limite = quantidade.nextInt();
                        conta.setLimite(limite);
                        break;
                    case 4:
                        System.out.println("Qual conta você quer acessar");
                        int j = entrada.nextInt();
                        conta.getCliente(j);
                        break;
                }
            }
        }
    }
}
