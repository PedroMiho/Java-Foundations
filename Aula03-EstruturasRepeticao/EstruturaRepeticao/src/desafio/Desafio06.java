package desafio;

import java.util.Scanner;

public class Desafio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        String numero = sc.nextLine();

        int soma = 0;
        int i = 0;

        while (i < numero.length()) {
            char c = numero.charAt(i);
            int digito = c - '0';
            soma += digito;
            i++;
        }


    System.out.println("A soma é igual a " + soma);


        sc.close();
    }
}
