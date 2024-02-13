import entities.Binario;
import entities.Decimal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===================");
        System.out.println("Conversor de bases");
        System.out.println("===================");

        System.out.println();

        int resposta = 1;
        while(true) {
            System.out.println("Escolha a conversão que você deseja realizar:");
            System.out.println("1 - Decimal para binario;");
            System.out.println("2 - Binario para decimal;");
            System.out.println("0 - Encerrar programa;");
            resposta = sc.nextInt();
            sc.nextLine();

            if (resposta != 1 && resposta != 2) {
                System.out.println("Programa encerrado.");
                break;
            }

            System.out.println("Digite o valor que deseja converter:");
            int valor = sc.nextInt();
            sc.nextLine();

            int valorConvertido;
            if(resposta == 1) {
                Decimal decimal = new Decimal(valor);
                valorConvertido = decimal.converterParaOutroFormato();
            } else {
                Binario binario = new Binario(valor);
                valorConvertido = binario.converterParaOutroFormato();
            }

            System.out.println("Valor convertido: " + valorConvertido);
            System.out.println();
        }

        sc.close();

    }
}