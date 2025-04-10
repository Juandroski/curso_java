package ejercicios_listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 */

public class OrdenarListas {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>(Arrays.asList("manzana", "banana", "kiwi", "naranja", "uva"));
        //Funcion por referencia
        //frutas.forEach(System.out::println);
        //Collections.sort(frutas);
        //funcion lambda imprimir la lista ya que sort la ordeno
        frutas.forEach(elemento -> {
            System.out.println(elemento);
        });
        System.out.println("funcion lambda imprimir la lista ya que sort la ordeno");
        //Funcion lambda con comparator
            Collections.sort(frutas, (f1,f2) -> f1.compareTo(f2));
        System.out.println(frutas);
        /*System.out.println("Despues del compareTo");
        for (String elemento: frutas
             ) {
            System.out.println(elemento);
        }*/

    }
}
