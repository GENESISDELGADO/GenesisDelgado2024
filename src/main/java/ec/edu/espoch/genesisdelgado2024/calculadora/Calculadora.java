
package ec.edu.espoch.genesisdelgado2024.calculadora;

import java.util.Stack;


public class Calculadora {
    private double suma;
    private double numero1;
    private double numero2;
    private Stack<Integer>deshacer;
    private Stack<Integer>rehacer;
     Integer opciones;

    public Calculadora(double suma, double numero1, double numero2, Stack<Integer> deshacer, Stack<Integer> rehacer, Integer opciones) {
        this.suma = suma;
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.deshacer = deshacer;
        this.rehacer = rehacer;
        this.opciones = opciones;
        piladeshacer stack<>=new;
        pilarehacer stack<>=new;
            
        
        
    }

    public double getSuma() {
        return suma;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public Stack<Integer> getDeshacer() {
        return deshacer;
    }

    public Stack<Integer> getRehacer() {
        return rehacer;
    }

    public Integer getOpciones() {
        return opciones;
    }
    
    public Double sumar(){
        double suma=0;
        suma=this.getNumero1()+this.getNumero2();
        return suma;
    }
    public void deshacer (){
        if(!pilaDeshacer.isEmpty()){
            pilaRehacer.push(opciones);
            opciones = pilaDeshacer.pop();
            System.out.println(" Desea deshacer: " + opciones);
            
        }else{
            System.out.println("deshacer");
        }
    }
    public void rehacer(){
        if(!pilaRehacer.isEmpty()){
            pilaDeshacer.push(opciones);
            opciones = pilaRehacer.pop();
            System.out.println(" rehacer : "+ opciones);
        }else{
            System.out.println("Desea rehacer");
        }
    }
    
    
}
