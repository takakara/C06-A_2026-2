import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor da NPA:");

        int NPA = entrada.nextInt();
        int NP3;
        int NFA;

        if(NPA < 60)
        {
            System.out.println("Digite o valor da NP3:");
            NP3 = entrada.nextInt();
            NFA = (NPA + NP3)/2;
            if(NFA < 50){
                System.out.println("O aluno está reprovado");
                System.out.println("A NFA é: " + NFA);
            } else {
                System.out.println("O aluno está aprovado");
                System.out.println("A NFA é: " + NFA);
            }
        } else
        {
            NFA = NPA;
            System.out.println("O aluno está aprovado");
            System.out.println("A NFA é: "+ NFA);
        }
    }
}
