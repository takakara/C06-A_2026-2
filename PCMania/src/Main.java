import Compra.ProcessarPedido;
import PCMania.Cliente.Cliente;
import PCMania.Promocao.Computador;
import PCMania.Computador.HardwareBasico;
import PCMania.Computador.MemoriaUSB;
import PCMania.Computador.SistemaOperacional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int opcao;
        int i;
        float total = 0;
        Cliente cliente = new Cliente("Yuri", "123456789");

        SistemaOperacional Win10 = new SistemaOperacional("Windows 10", 64);
        SistemaOperacional Win8 = new SistemaOperacional("Windows 8", 64);
        SistemaOperacional macOS = new SistemaOperacional("macOS Sequoia", 64);

        Computador Samsung = new Computador("Samsung", 2183, Win8);
        Computador Apple = new Computador("Apple", 2182, macOS);
        Computador Dell = new Computador("Dell", 2184, Win10);
        Computador[] computador = new Computador[3];
        computador[0] = Apple;
        computador[1] = Samsung;
        computador[2] = Dell;

        MemoriaUSB PD_16Gb = new MemoriaUSB("Pen-Drive", 16);
        MemoriaUSB PD_32Gb = new MemoriaUSB("Pen-Drive", 32);
        MemoriaUSB HDExt_1Tb = new MemoriaUSB("HD Externo", 1000);
        MemoriaUSB[] memoriaUSB = new MemoriaUSB[3];
        memoriaUSB[0] = PD_16Gb;
        memoriaUSB[1] = PD_32Gb;
        memoriaUSB[2] = HDExt_1Tb;

        HardwareBasico[][] hardwareBasico = new HardwareBasico[3][3];
        HardwareBasico Corei5 = new HardwareBasico("Pentium Core i5", 2200);
        HardwareBasico Corei7_3370 = new HardwareBasico("Pentium Core i7", 3370);
        HardwareBasico Corei7_4500 = new HardwareBasico("Pentium Core i7", 4500);
        HardwareBasico RAM_8Gb = new HardwareBasico("Mémoria RAM", 8);
        HardwareBasico RAM_16Gb = new HardwareBasico("Mémoria RAM", 16);
        HardwareBasico RAM_32Gb = new HardwareBasico("Mémoria RAM", 32);
        HardwareBasico HD_500Gb = new HardwareBasico("HD", 500);
        HardwareBasico HD_1Tb = new HardwareBasico("HD", 1000);
        HardwareBasico HD_2Tb = new HardwareBasico("HD", 2000);
        hardwareBasico[0][0] = Corei5;
        hardwareBasico[0][1] = RAM_8Gb;
        hardwareBasico[0][2] = HD_500Gb;
        hardwareBasico[1][0] = Corei7_3370;
        hardwareBasico[1][1] = RAM_16Gb;
        hardwareBasico[1][2] = HD_1Tb;
        hardwareBasico[2][0] = Corei7_4500;
        hardwareBasico[2][1] = RAM_32Gb;
        hardwareBasico[2][2] = HD_2Tb;

        for(i = 0; i < computador.length; i++)
        {
            computador[i].addMemoriaUSB(memoriaUSB[i]);
        }

        for(i = 0; i < hardwareBasico.length; i++)
        {
                computador[i].setHardwareBasico(hardwareBasico);
        }

        for(i = 0; i < computador.length; i++)
        {
            cliente.setComputador(computador);
        }
        System.out.println("Olá seja bem-vindo a PCMania!");
        System.out.println("Atualmente estamos com várias promoções na loja, aqui estão algumas delas: ");
        for(i = 0; i < computador.length; i++)
        {
                computador[i].mostraPCConfigs();
        }

        System.out.println("Qual promoção você quer comprar? Caso não queira aproveitar nenhuma promoção digite 0");
        opcao = scan.nextInt();
        while(opcao != 0)
        {
            ProcessarPedido.Compra(computador);
            total = cliente.calculaTotalCompra();
            System.out.println("Qual promoção você quer comprar? Caso não queira aproveitar nenhuma promoção digite 0");
            opcao = scan.nextInt();
        }

        System.out.println("O total da sua compra foi R$ " + total);
        System.out.println("Obrigado pela preferência!");
        scan.close();
    }
}
