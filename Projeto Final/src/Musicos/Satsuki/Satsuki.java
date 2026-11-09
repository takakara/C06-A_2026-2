package Musicos.Satsuki;
import Musicos.Musicos;

public class Satsuki extends Musicos {
    public Satsuki(String nome, String idioma, int ano_inicio) {
        super(nome, idioma, ano_inicio);
    }

    @Override
    public void mostraInfo() {
        System.out.println(this.nome);
        System.out.println(this.idioma);
        System.out.println(this.ano_inicio);
    }
}
