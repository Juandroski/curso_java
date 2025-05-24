package zona_fit.appzonafit;

import zona_fit.datos.ClienteDAO;
import zona_fit.datos.IClienteDAO;
import zona_fit.dominio.Cliente;

import java.util.Scanner;

public class AppZonaFit {
    public static void main(String[] args) {
        appZonaFit();
    }
    public static void appZonaFit(){
        var salir = false;
        var consola = new Scanner(System.in);

        System.out.println("*** APP ZONA FIT ***");
        //Mostrar opciones disponibles
        IClienteDAO clienteDao = new ClienteDAO();
        while (!salir) {
            try {
                //mostrar las opciones de la app
                var opcion = mostrarOpciones(consola);
                salir = ejecutarOpciones(opcion,consola,clienteDao);
            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            } finally {
                System.out.println();//imprime un salto con cada iteracion
            }
        }
    }


    public static int mostrarOpciones(Scanner consola){
        System.out.print("""
                Opciones app Zona Fit: 
                1. Listar Cliente
                2. Buscar Cliente
                3. Agregar Cliente
                4. Modificar Cliente
                5. Eliminar Cliente
                6. Salir app
                Elige una opcion: \s""");
        //Leemos y retornamos una opcion seleccionada
        return Integer.parseInt(consola.nextLine());
    }

    public static boolean ejecutarOpciones(int opcion, Scanner consola, IClienteDAO clienteDAO){
        var salir = false;

        switch (opcion){
            case 1 -> {
                System.out.println("--- Listado de Clientes ---");
                var clientes = clienteDAO.listarClientes();
                clientes.forEach(System.out::println);
            }
            case 2 -> {
                System.out.println("--- Buscar Cliente ---");
                System.out.println("Introduce El id Del cliente");
                var idCliente = Integer.parseInt(consola.nextLine());
                var cliente = new Cliente(idCliente);
                var encontrado = clienteDAO.buscarClientePorId(cliente);
                if(encontrado)
                    System.out.println("Cliente Encontrado: " + cliente);
                else
                    System.out.println("Cliente no Encontrado: " + cliente);
            }
            case 3 -> { //metodo para agregar clientes
                System.out.println("--- Agregar Cliente ---");
                System.out.println("Introduce los datos del cliente");
                System.out.print("Nombre del cliente: ");
                var nombre = consola.nextLine();
                System.out.print("Apellido del cliente: ");
                var apellido = consola.nextLine();
                System.out.println("Precio de la membrecia");
                var membresia = Integer.parseInt(consola.nextLine());
                var cliente = new ClienteDAO();
                cliente.agregarCliente(new Cliente(nombre,apellido,membresia));
            }
            //case 4 -> //Metodo Eliminar
            case 5 -> {
                System.out.println("Regresa pronto!");
                salir = true;
            }
        }
        return salir;
    }

}
