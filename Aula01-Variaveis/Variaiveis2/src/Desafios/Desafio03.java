package Desafios;

import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a sua nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite a sua nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("SUA NOTA FINAL FOI DE " + media);

        sc.close();
    }
}
