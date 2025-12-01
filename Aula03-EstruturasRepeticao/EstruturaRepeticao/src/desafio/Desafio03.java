package desafio;

import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        int contador = 0;

        while (true) {
            System.out.print("Digite um numero: ");
            double numero = sc.nextDouble();

            if (numero == 0) break;

            soma += numero;
            contador++;

        }

        System.out.println("A soma é igual a " + soma);
        System.out.println("A média é igual a " + soma/contador);

        sc.close();
    }
}
