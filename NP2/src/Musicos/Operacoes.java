package Musicos;
import java.nio.file.Path;

public interface Operacoes {

    void lerArquivo(Path arquivo);
    void escreverArquivo(Path arquivo, String musica);

}
