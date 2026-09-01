import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Salgado salgado1 = new Salgado();
        Salgado salgado2 = new Salgado();
        Salgado salgado3 = new Salgado();
        Cantina cantina = new Cantina();
        Scanner nomeSalgado = new Scanner(System.in);

        cantina.nome = "Cantina do Inatel";
        salgado1.nome = nomeSalgado.next();
        salgado2.nome = nomeSalgado.next();
        salgado3.nome = nomeSalgado.next();

        cantina.addSalgado(salgado1);
        cantina.addSalgado(salgado2);
        cantina.addSalgado(salgado3);


        cantina.mostraInfo();
    }
}
