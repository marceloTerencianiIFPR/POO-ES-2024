package br.ifpr.polimorfismo;

public class Vendedor extends Funcionario{

    @Override
    public double calculaSalario() {
        // TODO Auto-generated method stub
        return salarioBase + 1000;
    }
    
}
