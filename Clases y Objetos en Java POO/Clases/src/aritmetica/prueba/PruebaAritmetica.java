package aritmetica.prueba;

import aritmetica.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        System.out.println("**Ejemplo Aritmetica**");
        //instancia o creacion de objetos
        var aritmetica1 = new Aritmetica(7,5);
        System.out.println("Atributo operando1: " + aritmetica1.getOperando1());
        aritmetica1.setOperando1(10);
        aritmetica1.sumar();
        aritmetica1.restar();
        //creamos un segundo objeto
        System.out.println();
        var aritmetica2 = new Aritmetica(10,17);
        aritmetica2.sumar();
        aritmetica2.restar();

    }
}
