package br.ifpr.turma;

import java.util.ArrayList;
import java.util.Scanner;

import br.ifpr.turma.controle.TurmaControle;
import br.ifpr.turma.modelo.diagrama.Turma;

public class Visao {
    static int quantidadeEstudantes = 0;
    static TurmaControle turmaControle = new TurmaControle();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int opcao = 0;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            roteador(opcao);
        } while (opcao != 0);
    }

    public static void roteador(int opcao) {
        switch (opcao) {
            case 1:
                cadastrarTurma();
                break;
            case 2:
                // fazer cadastro de campus
                break;
            case 3:
                // fazer cadastro de curso
                break;
            case 4:
                // fazer cadastro de estudante
                break;
            case 5:
                // fazer cadastro de matricula
                break;
            case 6:
                gerarRelatorio();
                break;
            default:
                if (opcao != 0) {
                    System.out.println("Opção inválida");
                }
                break;
        }
    }

    public static void gerarRelatorio() {
        ArrayList <Turma> turmas = turmaControle.listarTurmas();
        for (Turma turma : turmas) {
            System.out.println("Nome da turma: " + turma.getNome());
            System.out.println("Numero minimo de alunos: " + turma.getNumeroMinimo());
            System.out.println("Ano de ingresso: " + turma.getAnoIngresso());
        }
    }

    public static void cadastrarTurma() {
        scanner.nextLine();// apaga o enter (\n)
        Turma turma = new Turma();
        System.out.println("Digite o nome da turma: ");
        
        turma.setNome(scanner.nextLine());

        System.out.println("Digite a numero minimo de alunos: ");

        int numeroMinimo = scanner.nextInt();
        turma.setNumeroMinimo(numeroMinimo);

        System.out.println("Digite o ano de ingresso: ");
        turma.setAnoIngresso(scanner.nextInt());

        turmaControle.cadastrarTurma(turma);
    }

    public static void exibirMenu() {
        System.out.println("============================");
        System.out.println("[1] Cadastro de turma: ");
        System.out.println("[2] Cadastro de campus: ");
        System.out.println("[3] Cadastro de curso: ");
        System.out.println("[4] Cadastro de estudante: ");
        System.out.println("[5] Cadastro de matricula: ");
        System.out.println("[6] Exibir tudo: ");
        System.out.println("[0] Sair: ");
        System.out.println("============================");
    }
}
