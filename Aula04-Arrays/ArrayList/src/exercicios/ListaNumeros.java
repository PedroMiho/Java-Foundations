package exercicios;

import java.util.ArrayList;

public class ListaNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        for(Integer numero : numeros){
            System.out.println(numero);
        }
    }
}
