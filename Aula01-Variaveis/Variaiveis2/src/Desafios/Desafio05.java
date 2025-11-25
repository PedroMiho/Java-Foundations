package Desafios;

import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");
        double raio = sc.nextDouble();

        double perimetro = Math.PI * 2 * raio;
        double area = Math.PI * Math.pow(raio,2);

        System.out.println("O perímetro é de " + perimetro + "m");
        System.out.println("A área é de " + area + "m²");

        sc.close();
    }
}
