package desafio;

import java.util.Scanner;

public class Desafio06_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero =  sc.nextInt();
        int casa = 1;
        int soma = 0;
        int digito = 0;

        while (numero > 0) {
            digito = (int) (numero % Math.pow(10,casa));
            numero -= digito;
            digito = (int) (digito / Math.pow(10,casa-1));
            soma += digito;
            casa++;
        }
        sc.close();
    }
}
