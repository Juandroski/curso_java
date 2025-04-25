package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksArchivos implements  IServicioSnacks{
    private final String NOMBRE_ARCHIVO = "snacks.txt";
    //Crear la lista de snacks
    private List<Snack> snacks = new ArrayList<>();

    public ServicioSnacksArchivos() {
        //Creamos el archivo si no existe
        var archivo = new File(NOMBRE_ARCHIVO);
        var existe = false;
        try {
            existe = archivo.exists();
            if(existe){
                this.snacks = obtenerSnacks();
            }else{//Creamos el archivo
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close();//guardar el archivo en disco
                System.out.println(" se ha creado el archivo");
            }

        }catch(Exception e){
            System.out.println("Error al crear el archvivo "+ e.getMessage());
        }
        //Si no existe el archivo, cargamos algunos snacks de manera inicial
        if(!existe){
            cargarSnacksIniciales();
        }
    }

    private void cargarSnacksIniciales(){
        this.agregarSnack(new Snack("papas", 70));
        this.agregarSnack(new Snack("cheve", 80));
        this.agregarSnack(new Snack("sabritones", 65));
        this.agregarSnack(new Snack("cacahuates", 30));
    }

    @Override
    public void agregarSnack(Snack snack) {
        //Agregamos el nuevo snack,
        //1. a la lista en memoria
        this.snacks.add(snack);
        //2. Guardamos el nuevo snack en el archivo
        this.agregarSnackArchivo(snack);
    }

    private void agregarSnackArchivo(Snack snack){
        boolean anexar = false;
        var archivo = new File(NOMBRE_ARCHIVO);
        try {
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo,anexar));
            salida.println(snack.ecribirSnack());
            salida.close();//Se escribe la informacion en el archivo

        }catch (Exception e){
            System.out.println("Error al agregar snack"+ e.getMessage());
            e.printStackTrace();
        }
    }

    private List<Snack> obtenerSnacks(){
        var snacks = new ArrayList<Snack>();
        try {
            List<String> lineas = Files.readAllLines(Paths.get(NOMBRE_ARCHIVO));
            for (var linea:lineas) {
               String[] lineaSnack = linea.split(",");//parse separado por coma
                var idSnack = lineaSnack[0];//no se usa
                var nombre = lineaSnack[1];
                var precio = Double.parseDouble(lineaSnack[2]);
                var snack = new Snack(nombre,precio);
                snacks.add(snack);//agregamos el snack leido en la lista
            }
        }catch (Exception e){
            System.out.println("Error al leer archivo de snacks: "+ e.getMessage());
            e.printStackTrace();
        }
        return snacks;
    }

    @Override
    public void mostrarSnacks() {
        System.out.println("--- Snacks en el Inventario ---");
        //Mostramos la lista de snacks
        var inventarioSnacks = "";
        for(var snack: this.snacks){
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println(inventarioSnacks);
    }

    @Override
    public List<Snack> getSnacks() {
        return this.snacks;
    }
}
