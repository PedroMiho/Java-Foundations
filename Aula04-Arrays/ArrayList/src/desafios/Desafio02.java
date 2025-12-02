package desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        double soma = 0;

        while(true){
            System.out.print("Digite um número [0 para parar]: ");
            int numero = sc.nextInt();

            if (numero == 0) {
                break;
            } else {
                numeros.add(numero);
            }
        }

        for (int numero : numeros) {
            soma += numero;
        }
        double media = soma / numeros.size();
        System.out.println("O números digitados foram " + numeros);
        System.out.println("A soma é igual a " + soma);
        System.out.println("A média é igual a " +  media);



        sc.close();
    }
}
