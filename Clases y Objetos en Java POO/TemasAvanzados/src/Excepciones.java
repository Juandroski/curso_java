public class Excepciones {
    public static void main(String[] args) {
        int valro1 = 10 , valor2 = 0;
        try {
            var resultado = valro1/valor2;
            System.out.println(resultado);
        }catch (Exception e){
            System.out.println("ocurrio un error " + e);
        }finally {
            System.out.println("se reviso la division entre 0");
        }

    }

}
