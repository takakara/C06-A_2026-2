package Musicos;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public abstract class Musicos implements Operacoes{

    protected String nome;
    protected String idioma;
    protected int ano_inicio;

    public Musicos(String nome, String idioma, int ano_inicio) {
        this.nome = nome;
        this.idioma = idioma;
        this.ano_inicio = ano_inicio;
    }

    public void mostraInfo()
    {
        System.out.println(this.nome);
        System.out.println(this.idioma);
        System.out.println(this.ano_inicio);
    }

    @Override
    public void lerArquivo(Path arquivo) {
        try {
            if (!Files.exists(arquivo)) {
                Files.createFile(arquivo);
                System.out.println("Ficheiro não encontrado, mas foi criado automaticamente em: " + arquivo.toAbsolutePath());
            }
            String conteudo = Files.readString(arquivo);
            System.out.println("\n--- CONTEÚDO DO ARQUIVO ---");
            if (conteudo.isEmpty()) {
                System.out.println("O arquivo está vazio. Use a opção de adicionar música!");
            } else {
                System.out.println(conteudo);
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro ao abrir arquivo: " + arquivo.toAbsolutePath(), e);
        }
    }

    @Override
    public void escreverArquivo(Path arquivo, String textoMusica) {
        try {
            Files.writeString(arquivo, textoMusica, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("Música adicionada com sucesso ao arquivo!");

        } catch (IOException e) {
            throw new RuntimeException("Erro ao escrever no arquivo, tente novamente");
        }
    }

    public String getNome() {
        return nome;
    }
}
