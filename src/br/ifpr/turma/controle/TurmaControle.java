package br.ifpr.turma.controle;

import java.util.ArrayList;

import br.ifpr.turma.modelo.diagrama.Turma;
import br.ifpr.turma.modelo.servico.TurmaServico;

public class TurmaControle {
    TurmaServico turmaServico = new TurmaServico();

    public void cadastrarTurma(Turma turma) {
        turmaServico.cadastrarTurma(turma);
    }

    public void excluirTurma(Turma turma) {
        turmaServico.excluirTurma(turma);
    }

    public ArrayList<Turma> listarTurmas() {
        return turmaServico.listarTurmas();
    }
}
