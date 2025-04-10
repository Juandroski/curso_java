package ejercicios_listas;

import java.util.ArrayList;
import java.util.Arrays;

/*iltrar números pares de una lista:

Crea una lista de números enteros: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10].
Escribe código para crear una nueva lista que contenga solo los números pares de la lista original.
Pista: Puedes usar un bucle for y una condición if.*/
public class ParesLista {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13,14,15,16));
        ArrayList<Integer> listaPares = new ArrayList<>();
        for (int numero: listaNumeros) {
                if(numero % 2 != 0){
                    System.out.println("el numero: " + numero +" deja residuo es impar" );
                }else{
                    listaPares.add(numero);
                }
        }
        System.out.println(listaPares);
    }
}
