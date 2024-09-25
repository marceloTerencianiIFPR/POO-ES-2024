package br.ifpr.churrascaria.modelo;

public class Churrascaria {
    String nome;
    String cnpj;
    public Churrascaria() {
    }
    public Churrascaria(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Churrascaria other = (Churrascaria) obj;
        if (cnpj == null) {
            if (other.cnpj != null)
                return false;
        } else if (!cnpj.equals(other.cnpj))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Churrascaria [nome=" + nome + ", cnpj=" + cnpj + "]";
    }
    
    
}
