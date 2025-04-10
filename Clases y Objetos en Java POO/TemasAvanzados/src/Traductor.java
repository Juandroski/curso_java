public interface Traductor {
    //public y abstract
    void traducir();

    //Metodos con implementacion por desault
    default void iniciarTraductor(){
        System.out.println("Iniciando traductor...");
    }
}


class Ingles implements Traductor {
    @Override
    public void traducir() {
        System.out.println("Traduzco a ingles");
    }
}

class Frances implements Traductor{
    @Override
    public void traducir() {
        System.out.println("Traduzco al frances");
    }
    public void iniciarTraductor(){
        System.out.println("Iniciando traductor a frances...");
    }
}

class PruebaTraductor{
    public static void main(String[] args) {
        Traductor ingles = new Ingles();
        ingles.iniciarTraductor();
        ingles.traducir();
        Traductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();



    }
}

