package exercicios;

import java.util.ArrayList;

public class ListaNomes {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        //Adicionar valores a ArrayList
        nomes.add("Pedro");
        nomes.add("Diego");
        nomes.add("Maria");

        //Adicionar valor em uma posição especifica
        nomes.add(1, "Enzo");
        nomes.add(2, "Nathan");
        nomes.add("Maria");

        //Verificar um item na lista
        System.out.println(nomes.get(0));

        //Alterar um valor na lista
        nomes.set(0, "João");
        System.out.println(nomes);

        //Retornar a posição a partir do valor
        System.out.println(nomes.indexOf("Pedro"));
        System.out.println(nomes.indexOf("João"));
        System.out.println(nomes.indexOf("Maria"));

        //Remover elemento
        nomes.remove("Maria");
        nomes.remove(1);

        //Verificar o tamanho da lista
        System.out.println(nomes.size());

        //RemoveIf
        nomes.removeIf(itens  -> itens.charAt(0) == 'J');

        for(String nome : nomes){
            System.out.println(nome);
        }


    }
}
