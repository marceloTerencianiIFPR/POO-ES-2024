package br.ifpr.polimorfismo;

public class Gerente extends Funcionario{

    @Override
    public double calculaSalario() {
        return salarioBase + 2000;
    }
}
