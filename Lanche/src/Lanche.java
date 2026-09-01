import java.util.Scanner;

public class Lanche {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade de lanches: ");
        int lanche1 = entrada.nextInt();
        int lanche2 = entrada.nextInt();
        int lanche3 = entrada.nextInt();
        int soma = lanche1 + lanche2 + lanche3;
        float media = (float) soma/3;

        System.out.println("A soma dos lanches é: " +soma);
        System.out.println("A média dos lanches é: " +media);
    }
}
