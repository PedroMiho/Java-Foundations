package desafios;

import java.util.Scanner;

public class Desafio06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o valor gasto: R$ ");
        double valorGasto = sc.nextDouble();
        sc.nextLine();

        System.out.println("Informe o método de pagamento");
        System.out.println("A- PIX");
        System.out.println("B - Débito");
        System.out.println("C - Crédito");
        System.out.print("A método de pagamento escolhido foi: ");
        String opcao = sc.nextLine();
        double valorFinal = 0;
        switch (opcao) {
            case "A":
                valorFinal = valorGasto * 0.9;
                System.out.println("O valor final foi de " + valorFinal);
                break;
            case "B":
                valorFinal = valorGasto * 0.95;
                System.out.println("O valor final foi de " + valorFinal);
                break;
            case "C":
                System.out.println("Informe a forma de parcelamento");
                System.out.println("1 - A vista");
                System.out.println("2 - 2 Parcelas");
                System.out.println("3 - 3 Parcelas");
                System.out.println("Forma de parcelamento escolhido foi: ");
                opcao = sc.nextLine();
                switch (opcao) {
                    case "1":
                        valorFinal = valorGasto;
                        System.out.println("O valor final foi de " + valorFinal);
                        break;
                    case "2":
                        valorFinal = valorGasto * 1.05 / 2;
                        System.out.println("O valor final foi de " + valorFinal);
                        break;
                    case "3":
                        valorFinal = valorGasto * 1.1 / 3;
                        System.out.println("O valor final foi de " + valorFinal);
                        break;
                }
                break;
        }



        sc.close();
    }
}
