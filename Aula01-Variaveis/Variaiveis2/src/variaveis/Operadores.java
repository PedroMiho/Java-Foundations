package variaveis;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        System.out.print("Digite um número: ");
        int numero2 = sc.nextInt();

        //Operador soma (+)
        int soma = numero + numero2;
        System.out.println("A soma de " + numero + "+" + numero2 + "=" + soma);

        //Operador Multiplicação (*)
        int multiplicacao = numero * numero2;
        System.out.println("A multiplicação de " + numero + "*" + numero2 + "=" + multiplicacao);

        //Operador Subtração (-)
        int subtracao = numero - numero2;
        System.out.println("A subtração de " + numero + "-" + numero2 + "=" + subtracao);

        //Operador Divisão (/)
        double divisao = (double) numero / numero2;
        System.out.println("A divisão de " + numero + "/" + numero2 + "=" + divisao);

        //Operador Módulo (%)
        int modulo = numero % numero2;
        System.out.println("O módulo de " + numero + "%" + numero2 + "=" + modulo);



        sc.close();
    }

}
