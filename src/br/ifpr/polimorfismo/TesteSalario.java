package br.ifpr.polimorfismo;

public class TesteSalario {
    public static void main(String[] args) {
        Funcionario[] fs = new Funcionario[3];

        //fs[0] = new Funcionario();
        fs[1] = new Gerente();
        fs[2] = new Estagiario();

        System.out.println(fs[0].calculaSalario());
        System.out.println(fs[1].calculaSalario());
        System.out.println(fs[2].calculaSalario());
    }
}
