package br.ifpr.polimorfismo;

public class CalculadoraMateus extends Calculadora{
    public double dividir(double a, double b) {
        System.out.println("divisao mateus");
        if (b == 0)
            return 0;
        
        return a / b;
    }
}
