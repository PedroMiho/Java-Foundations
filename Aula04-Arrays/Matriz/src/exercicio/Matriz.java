package exercicio;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] notas = new int[5];

        //Adicionar elementos na matriz
        notas[0] = 5;
        notas[1] = 6;
        notas[2] = 7;
        notas[3] = 9;

        System.out.println(Arrays.toString(notas));
        System.out.print(notas[0] + ",");
        System.out.print(notas[1] + ",");
        System.out.print(notas[2] + ",");
        System.out.print(notas[3] + ",");
        System.out.println(notas[notas.length - 1]);


        //Percorrer Matriz
        for (int i = 0; i < notas.length; i++){
            System.out.println(notas[i]);
        }


        for (int nota : notas) {
            System.out.println(nota);
        }



        sc.close();
    }
}
