package br.ifpr.turma.modelo.servico;

import java.util.ArrayList;

import br.ifpr.turma.modelo.diagrama.Turma;

public class TurmaServico {
    private ArrayList<Turma> turmas = new ArrayList<>();

    public void cadastrarTurma(Turma turma) {
        turmas.add(turma);

    }

    public void excluirTurma(Turma turma) {
        turmas.remove(turma);
    }

    public ArrayList<Turma> listarTurmas() {
        return turmas;
    }

}
