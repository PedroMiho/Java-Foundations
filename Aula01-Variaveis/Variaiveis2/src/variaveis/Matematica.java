package variaveis;

import java.util.Scanner;

public class Matematica {
    public static void main(String[] args) {

        //Potência
        int base = 2;
        int expoente = 3;
        double potencia = Math.pow(base,expoente);
        System.out.println("Potência = " + potencia);
        //Raiz Quadrada
        double numero = 16;
        double raizQuadrada = Math.sqrt(numero);
        System.out.println("Raiz Quadrada = " + raizQuadrada);

        // Random - Gerar valores aleatórios
        int aleatorio = (int) (Math.random() * 10);
        System.out.println(aleatorio);

        // PI
        double pi = Math.PI;
        System.out.println(pi);

    }
}
