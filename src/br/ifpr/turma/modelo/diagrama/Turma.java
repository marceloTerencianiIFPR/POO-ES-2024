package br.ifpr.turma.modelo.diagrama;

public class Turma {
    private String nome;
    private int numeroMinimo;
    private int anoIngresso;

    public Turma() {
    }

    public Turma(String nome, int numeroMinimo, int anoIngresso) {
        this.nome = nome;
        this.numeroMinimo = numeroMinimo;
        this.anoIngresso = anoIngresso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroMinimo() {
        return numeroMinimo;
    }

    public void setNumeroMinimo(int numeroMinimo) {
        this.numeroMinimo = numeroMinimo;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + numeroMinimo;
        result = prime * result + anoIngresso;
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
        Turma other = (Turma) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (numeroMinimo != other.numeroMinimo)
            return false;
        if (anoIngresso != other.anoIngresso)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Turma [nome=" + nome + ", numeroMinimo=" + numeroMinimo + ", anoIngresso=" + anoIngresso + "]";
    }

}
