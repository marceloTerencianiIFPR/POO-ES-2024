package br.ifpr.churrascaria.modelo;

public abstract class Funcionario {
    public static final double salarioMinimo = 1_412.00;
    protected String nome;
    protected double salarioBase;
    protected String cpf;
    public Funcionario() {
    }
    public Funcionario(String nome, double salarioBase, String cpf) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.cpf = cpf;
    }
    public static double getSalariominimo() {
        return salarioMinimo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        return result;
    }
    @Override
    public final boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Funcionario other = (Funcionario) obj;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", salarioBase=" + salarioBase + ", cpf=" + cpf + "]";
    }
    
    public void imprimeAtributos() {
        System.out.println(this.nome);
    }

    public abstract double calculaSalario();
}
