package desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Maçã");
        lista.add("Copo");
        lista.add("Colher");
        lista.add("Escada");
        lista.add("Computador");
        lista.add("Mesa");
        lista.add("Mouse");
        lista.add("Teclado");
        lista.add("Servidor");
        lista.add("Cadeira");

        System.out.println("Digite uma letra: ");
        String letra = sc.nextLine().toUpperCase();

        lista.removeIf(nome -> nome.toUpperCase().contains(letra));

        for (String nome : lista) {
            System.out.println("Nome: " +  nome);
        }

        sc.close();
    }
}
