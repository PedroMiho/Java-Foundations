package desafios;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notas = new int[10];
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite uma nota: ");
            notas[i] = sc.nextInt();
            soma += notas[i];
        }
        for (int nota : notas) {
            System.out.println("Nota: " + nota);
        }
        double media = soma / notas.length;
        System.out.println("A média é igual a " + media);
        sc.close();
    }
}
