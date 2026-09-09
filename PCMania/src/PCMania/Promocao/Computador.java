package PCMania.Promocao;

import PCMania.Computador.HardwareBasico;
import PCMania.Computador.MemoriaUSB;
import PCMania.Computador.SistemaOperacional;

public class Computador {

    private String marca;
    private float preco;
    private HardwareBasico[][] hardwareBasico;
    private SistemaOperacional operacional;
    private MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco, SistemaOperacional sistemaOperacional)
    {
        this.marca = marca;
        this.preco = preco;
        this.hardwareBasico = new HardwareBasico[3][3];
        this.operacional = sistemaOperacional;
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }

    public void setHardwareBasico(HardwareBasico[][] hardwareBasico) {
        this.hardwareBasico = hardwareBasico;
    }

    public float getPreco() {
        return preco;
    }

    public String getMarca() {
        return marca;
    }

    public void mostraPCConfigs()
    {
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Preço: R$ " + this.getPreco());
        System.out.println("Sistema Operacional: " + this.operacional.getNome() + " " + this.operacional.getTipo() + " Bits");
        for(int i = 0; i < hardwareBasico.length; i++) {
                System.out.println("Hardware Básico: Processador " + this.hardwareBasico[i][0].getNome() + " de " + this.hardwareBasico[i][0].getCapacidade() + " Mhz");
                System.out.println(this.hardwareBasico[i][1].getNome() + " de " + this.hardwareBasico[i][1].getCapacidade() + " Gb");
                System.out.println(this.hardwareBasico[i][2].getNome() + " de " + hardwareBasico[i][2].getCapacidade() + " Gb");
        }
        System.out.println("Acompanha " + this.memoriaUSB.getNome() + " de " + this.memoriaUSB.getCapacidade() + " Gb");
    }
}