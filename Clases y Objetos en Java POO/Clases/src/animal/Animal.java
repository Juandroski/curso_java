package animal;

public class Animal {
    protected void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }

}


class Perro extends Animal{
    @Override
    protected void hacerSonido(){
        System.out.println("El perro hace wauf");
    }

}

class Gato extends Animal{
    protected void hacerSonido(){
        System.out.println("El Gato hace miau");
    }
}

class  PruebaAnimal{

    //metodo polimorfico
    static void imprimirSonido(Animal animal){
        animal.hacerSonido();

    }

    public static void main(String[] args) {
        //objeto de la clase padre (Animal)
        //var animal1 = new Animal();
        //var animal1 = new Perro();
        var animal2 = new Gato();
        imprimirSonido(animal2);

    }

}