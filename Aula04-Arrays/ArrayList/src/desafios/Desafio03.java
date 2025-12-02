package desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> listaPares = new ArrayList<>();
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        while (true) {
            System.out.print("Digite um numero [0 para parar]: ");
            int numero = sc.nextInt();

            if (numero == 0) {
                break;
            }

            listaNumeros.add(numero);
        }

        for (int numero : listaNumeros) {
            boolean resto =  numero % 2 == 0;
            if (resto) {
                listaPares.add(numero);
            }
        }

        System.out.println("Números digitados: " + listaNumeros);
        System.out.println("Números pares: " + listaPares);

        sc.close();
    }
}
