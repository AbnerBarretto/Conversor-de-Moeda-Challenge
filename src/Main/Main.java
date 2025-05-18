package Main;

import Convertion.Conversion;
import Convertion.ConversionCurrency;
import Menu.Menu;

import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        Conversion conversion = new Conversion();

        while (true){
            menu.showMenu();
            System.out.println("Opção: ");
            int choose = scanner.nextInt();


            if (choose == 7){
                System.out.println("Obrigado por usar nosso sistema de conversão :)!");
                break;
            }

            System.out.println("Digite o valor que deseja converter: ");
            double value = scanner.nextDouble();
            String moedaBase = "";
            String moedaDestino = "";

            switch (choose) {
                case 1:
                    moedaBase = "USD";
                    moedaDestino = "ARS";
                    break;
                case 2:
                    moedaBase = "ARS";
                    moedaDestino = "USD";
                    break;
                case 3:
                    moedaBase = "USD";
                    moedaDestino = "BRL";
                    break;
                case 4:
                    moedaBase = "BRL";
                    moedaDestino = "USD";
                    break;
                case 5:
                    moedaBase = "USD";
                    moedaDestino = "COP";
                    break;
                case 6:
                    moedaBase = "COP";
                    moedaDestino = "USD";
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    continue;
            }
            double resultado = conversion.converse(moedaBase, moedaDestino, value);
            System.out.println(" ");
            System.out.printf("%.2f [%s] equivalem a %.2f [%s]\n\n", value, moedaBase, resultado, moedaDestino);
        }
        scanner.close();
    }
}