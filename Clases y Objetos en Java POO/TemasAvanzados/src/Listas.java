import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> miLista= new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");

       /* for (String dia: miLista) {
            System.out.println("Dia de la semana " + dia);
        }*/
        //Funcion lambda
        miLista.forEach( elemento -> {
            System.out.println("El elemento es : "+elemento);
        });


        //Metodo por referencian
        //miLista.forEach(System.out::println);

        List<String> nombres = Arrays.asList("juan","carlos","chavez","garcia");
        nombres.forEach(System.out::println);

    }
}
