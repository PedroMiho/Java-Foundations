package exercicios;

import java.util.Scanner;

public class DecisaoTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Você esta grávida [S/N]: ");
        String resposta = sc.nextLine();

        //É usado o equals() para comparar igualdade em valores do tipo String

        if (resposta.equals("S")) {
            System.out.println("Ela não vai pagar o trem");
        } else {
            System.out.println("Ela vai pagar o trem");
        }

        sc.close();
    }
}
