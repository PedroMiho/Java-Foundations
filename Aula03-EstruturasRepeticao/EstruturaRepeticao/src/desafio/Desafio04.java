package desafio;

import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int somaPar = 0;
        int somaImpar = 0;

        while (true) {
            System.out.print("Digite um numero: ");
            int numero = sc.nextInt();

            int resto = numero % 2;

            if (numero == 0){
                break;
            }

            if (resto == 0) {
                somaPar += numero;
            } else {
                somaImpar += numero;
            }
        }

        System.out.println("A soma dos números pares é igual a " + somaPar);
        System.out.println("A soma dos números impares é igual a " + somaImpar);



        sc.close();
    }
}
