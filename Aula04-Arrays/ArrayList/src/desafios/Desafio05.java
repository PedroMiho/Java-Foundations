package desafios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Desafio05 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> listaPar = new ArrayList<>();
        ArrayList<String> listaImpar = new ArrayList<>();
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

        //Variaveis
        int comprimento1 = 0;
        int comprimento2 = 0;
        String buffer = "";
        String buffer2 = "";

        System.out.println(lista);

        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.size(); j++) {
                if (i < j) {
                    comprimento1 = lista.get(i).length();
                    comprimento2 = lista.get(j).length();

                    if (comprimento1 > comprimento2) {
                        buffer = lista.get(i);
                        buffer2 = lista.get(j);
                        lista.set(j, buffer);
                        lista.set(i, buffer2);
                    }
                }

            }
        }

        for(String objetos: lista){
            int tamanhoObjetos =  objetos.length();
            int resto = tamanhoObjetos % 2;
            if(resto==0){
                listaPar.add(objetos);
            } else {
                listaImpar.add(objetos);
            }
        }

        System.out.println("Lista par : " + listaPar );
        System.out.println("Lista impar : " + listaImpar );


    }
}
