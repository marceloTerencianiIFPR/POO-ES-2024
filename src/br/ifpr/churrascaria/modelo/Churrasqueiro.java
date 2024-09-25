package br.ifpr.churrascaria.modelo;

public final class Churrasqueiro extends Funcionario {
    private String disponibilidade;
   

    public Churrasqueiro() {
        super();
    }
        
    public Churrasqueiro(String nome, double salarioBase, String cpf, String disponibilidade) {
        super(nome, salarioBase, cpf);
        this.disponibilidade = disponibilidade;
    }
        
    @Override
    public String toString() {
        String funcionario = super.toString();
        return funcionario + " Churrasqueiro [disponibilidade=" + disponibilidade + "]";
    }

    @Override
    public double calculaSalario() {
        return super.salarioBase * 2;
    }

    public double calculaSalario(double gorjeta) {
        return (super.salarioBase * 2) + gorjeta;
    }


    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    
}
