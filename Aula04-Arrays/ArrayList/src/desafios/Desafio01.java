package desafios;

import java.util.ArrayList;

public class Desafio01 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Maria");
        nomes.add("Mario");
        nomes.add("Ana");
        nomes.add("Antonio");
        nomes.add("Anderson");
        nomes.add("Gilberto");

        nomes.removeIf(nome -> nome.charAt(0) != 'A');
        System.out.println(nomes.size());
        for(String nome : nomes){
            System.out.println(nome);
        }
    }
}
