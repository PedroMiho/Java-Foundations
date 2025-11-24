package variaveis;

import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Metodo Next - Capturar a palavra digitada pelo usuario
        System.out.println("Digite seu nome: ");
        String nome = sc.next();
        sc.nextLine();
        System.out.println(nome);

        //Metodo NextLine - Capturar a linha digitada pelo usuario
        System.out.println("Digite o seu nome completo: ");
        String nomeCompleto = sc.nextLine();
        System.out.println(nomeCompleto);

        //Metodo NextInt - Capturar números inteiros
        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();

        //Metodo NextDouble - Capturar números Decimais
        System.out.println("Digite a sua altura: ");
        double altura = sc.nextDouble();

        System.out.println("O " + nomeCompleto + " tem " + idade + " anos" + " e mede " + altura + " m ");
        sc.close();
    }
}
