package Desafios;

import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o capital inicial: ");
        double capital = sc.nextDouble();
        System.out.print("Digite a taxa de juros mensal: ");
        double taxaJuros = sc.nextDouble() / 100;
        System.out.print("Tempo em meses: ");
        int meses = sc.nextInt();

        double juros = capital * taxaJuros * meses;

        System.out.println("O valor dos juros foi de R$" + String.format("%.2f", juros));

        sc.close();
    }
}
