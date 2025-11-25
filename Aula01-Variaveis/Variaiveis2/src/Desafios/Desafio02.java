package Desafios;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o capital inicial: ");
        double capitalInicial = sc.nextDouble();
        System.out.print("Digite a taxa de juros mensal: ");
        double juros = sc.nextDouble() / 100;
        System.out.print("Números de meses: ");
        int meses = sc.nextInt();

        double jurosTotal = 1 + juros;

        double montante = capitalInicial * Math.pow(jurosTotal,meses);
        System.out.print("O montante final foi de R$ " + String.format("%.2f" , montante));

        sc.close();
    }
}
