package aritmetica;

public class Aritmetica {
    //atributos
    private int operando1;
    private int operando2;
    //constructor sin parametros
    public Aritmetica(){

    }
    //constructor sobrecargado con parametros
    public Aritmetica(int operando1, int operando2){
        System.out.println("ejecutando el constructor");
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    //metodos o funciones
    public void sumar(){
        var resultado = this.operando1 + this.operando2;
        System.out.println("El resultado de la Suma: " + resultado);
    }

    public void restar(){
        var resultado = this.operando1 - this.operando2;
        System.out.println("El resultado de la resta: " + resultado);
    }

    public int getOperando1() {
        return this.operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return this.operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }
}
