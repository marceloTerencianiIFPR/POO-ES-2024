package br.ifpr.polimorfismo;

public class Teste {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        CalculadoraMateus calMa = new CalculadoraMateus();
        Calculadora calMa2 = new CalculadoraMateus();

        System.out.println(cal.dividir(10, 0));
        System.out.println(calMa.dividir(10, 0));
        System.out.println(calMa2.dividir(10, 0));

    }







    public static double somar(double x, double y) {
        System.out.println("Passou por aqui!");
        return x + y;
    }

    public static double somar(int x, int y) {
        System.out.println("Passou por aqui 2!");
        return x + y;
    }

}
