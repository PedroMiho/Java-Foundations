package desafios;

import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {
        //Elabore um programa que peça ao usuário para informar o valor de um empréstimo e o número de
        // parcelas desejadas (6, 12 ou 24 meses).
        // Use uma estrutura switch para calcular o valor final, considerando as taxas
        //6 meses: +5% do valor total.
        //12 meses: +10% do valor total.
        //24 meses: +20% do valor total.
        //Mostre o valor total a ser pago com base na escolha.

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do empréstimo: ");
        double emprestimo = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite o número de parcelas: ");
        System.out.println("6x - 5% de juros");
        System.out.println("12x - 10% de juros");
        System.out.println("24x - 20% de juros");
        int parcelas = sc.nextInt();
        double valorFinal;

        if (parcelas == 6){
            valorFinal = emprestimo * 1.05;
            System.out.println("O valor final do seu empréstimo será de R$ " + valorFinal );
        } else if (parcelas == 12){
            valorFinal = emprestimo * 1.10;
            System.out.println("O valor final do seu empréstimo será de R$ " + valorFinal );
        } else {
            valorFinal = emprestimo * 1.20;
            System.out.println("O valor final do seu empréstimo será de R$ " + valorFinal );
        }

        sc.close();

    }
}
