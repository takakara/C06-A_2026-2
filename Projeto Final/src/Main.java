import Musicos.Metallica.Metallica;
import Musicos.Musicos;
import Musicos.Satsuki.Satsuki;
import Musicos.TheWeeknd.TheWeeknd;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Metallica metallica = new Metallica("Metallica","Inglês",1981);
        TheWeeknd theweeknd = new TheWeeknd("TheWeeknd","Inglês",2009);
        Satsuki satsuki = new Satsuki("32ki","Japonês",2019);
        Scanner scanner = new Scanner(System.in);
        Musicos artistaSelecionado = null;

        while (artistaSelecionado == null) {
            System.out.println("\n=== ESCOLHA UM ARTISTA ===");
            System.out.println("1. Metallica");
            System.out.println("2. The Weeknd");
            System.out.println("3. Satsuki (32ki)");
            System.out.print("Digite o número do artista desejado: ");

            try {

                int escolhaArtista = Integer.parseInt(scanner.nextLine());
                switch (escolhaArtista) {
                    case 1:
                        artistaSelecionado = metallica;
                        break;
                    case 2:
                        artistaSelecionado = theweeknd;
                        break;
                    case 3:
                        artistaSelecionado = satsuki;
                        break;
                    default:
                        System.out.println("Opção inválida! Escolha entre 1, 2 ou 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite apenas números inteiros.");
            }
        }

        Path caminhoArquivo = Paths.get("src/Musicos/musicas_" + artistaSelecionado.getNome().toLowerCase() + ".txt");
        int opcaoMenu = 0;
        do {
            System.out.println("--- MENU DE OPÇÕES (" + artistaSelecionado.getNome().toUpperCase() + ") ---");
            System.out.println("1. Mostrar Informações do Artista");
            System.out.println("2. Ler Arquivo de Músicas");
            System.out.println("3. Cadastrar uma Musica no Arquivo");
            System.out.println("4. Trocar de Artista / Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcaoMenu = Integer.parseInt(scanner.nextLine());

                switch (opcaoMenu) {
                    case 1:
                        artistaSelecionado.mostraInfo();
                        break;
                    case 2:
                        artistaSelecionado.lerArquivo(caminhoArquivo);
                        break;
                    case 3:
                        System.out.print("\nDigite o nome da nova música: ");
                        String novaMusica = scanner.nextLine();
                        artistaSelecionado.escreverArquivo(caminhoArquivo, novaMusica);
                        break;
                    case 4:
                        System.out.println("Encerrando o programa");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }

            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor, digite apenas números inteiros.");
                opcaoMenu = 0;
            }

        } while (opcaoMenu != 4);

        scanner.close();
    }
}
