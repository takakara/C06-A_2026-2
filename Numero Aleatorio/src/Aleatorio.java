import java.util.Random;
import java.util.Scanner;

public class Aleatorio {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        int x = rand.nextInt(10) + 1;
        int num = entrada.nextInt();

        while (num != x)
        {
            if (num < x)
            {
                System.out.println("O número inserido é menor que o gerado");
            } else
            {
                System.out.println("O número inserido é maior que o gerado");
            }
            num = entrada.nextInt();
        }

        entrada.close();
        System.out.println("Parabéns! Você acertou o número gerado");
    }
}
