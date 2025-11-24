package variaveis;

import java.util.Scanner;

public class EntradaFixacao {
    public static void main(String[] args){
        //Crie duas variaveis, uma para armazenar a cidade aonde a pessoa mora e
        //outra para armazenar a UF.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a cidade: ");
        String cidade = sc.nextLine();

        System.out.print("Digite o estado: ");
        String estado = sc.nextLine();



        //Crie duas variaveis, uma para armazenar a população da cidade e outra
        // o tamanho da cidade;

        System.out.print("Digite a população da sua cidade: ");
        int populcao = sc.nextInt();
        System.out.print("Digite o tamanho da sua cidade: ");
        double tamanho = sc.nextDouble();

        System.out.println("Cidade: " + cidade + "\nEstado: " + estado + "\nPopulação: " + populcao +
                "\nTamanho: " + tamanho + "km²");

        //\n - Quebra linha
        sc.close();
    }
}
