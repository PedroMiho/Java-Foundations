package desafios;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
//        Crie um programa que leia a nota de um aluno e mostre uma mensagem detalhada:
//
//        Nota abaixo de 5: "Reprovado - precisa melhorar muito".
//        Nota entre 5 e 6.9: "Recuperação - dedicação é necessária".
//        Nota entre 7 e 8.9: "Aprovado - desempenho satisfatório".
//        Nota 9 ou mais: "Aprovado com Distinção - excelente!".

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a nota: ");
        int nota = sc.nextInt();

        if (nota >= 9){
            System.out.println("Aprovado com Distinção - excelente!");
        }

        else if (nota >= 7){
            System.out.println("Aprovado - desempenho satisfatório");
        }

        else if (nota >= 5){
            System.out.println("Recuperação - dedicação é necessária");
        }

        else {
            System.out.println("Reprovado - precisa melhorar muito");
        }

        sc.close();
    }
}
