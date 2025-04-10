package ventas;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("*** Sistema de vemtas ***");
        var producto1 = new Producto("blusa",30.00);
        var producto2 = new Producto("zapatos",10.00);
        //primera orden
        var orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        System.out.println(orden1);
        //orden1.mostrarOrden();
        //segunda orden
        var orden2 = new Orden();
        orden2.agregarProducto(new Producto("short",50));
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        //orden2.mostrarOrden();
        System.out.println(orden2);
    }
}
