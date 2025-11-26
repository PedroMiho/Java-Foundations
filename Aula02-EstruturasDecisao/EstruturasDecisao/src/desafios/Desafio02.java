package desafios;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        //Desafio 2: Calculadora de Multa por Excesso de Velocidade
        //
        //Crie um programa que calcule o valor da multa a ser paga caso um motorista
        // ultrapasse o limite de velocidade. O limite de
        //velocidade será de 90 km/h e o usuário deve inserir a velocidade do veículo.
        // Para cada quilômetro por hora acima do limite, será cobrado R$ 10,00.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua velocidade: ");
        int velocidade = sc.nextInt();
        double valorKm = 10;

        if (velocidade > 90) {
            double valorMulta = (velocidade-90) * valorKm;
            System.out.println("Você foi multado em " + valorMulta);
        }else {
            System.out.println("Você não foi multado");
        }

        sc.close();
    }
}
