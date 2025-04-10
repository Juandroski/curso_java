package persona.pruebaPersona;

import persona.Persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("*** Creacion de Clases y Objetos Persona ***");
        System.out.println("Variable estatica: "
                + Persona.getContadorPersonas());
        //creando un objeto de clase persona o hacer una instancia de la clase
        var objeto1 = new Persona("Juan","Chavez");
        //objeto1.mostrarPersona();
        System.out.println(objeto1);
        System.out.println("Variable estatica: " + Persona.getContadorPersonas());
        System.out.println();
        //segundo objeto u otra instancia
        var objeto2 = new Persona("carlos","chavez");
        System.out.println(objeto2);
        System.out.println("Variable estatica: " + Persona.getContadorPersonas());


    }
}
