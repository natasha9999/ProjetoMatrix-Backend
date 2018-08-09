package br.com.projetomatrix.academico;

import br.com.projetomatrix.academico.Aluno;
import br.com.projetomatrix.academico.Avaliacao;
import br.com.projetomatrix.academico.Turma;
import java.util.List;

public class Boletim {
    
    private Aluno aluno;
    private Turma turma;
    private List<Avaliacao> avaliacoes;
    
    
public Aluno getAluno() {
    return aluno;
}
public void setAluno(Aluno aluno) {
    this.aluno = aluno;
}

public Turma getTurma() {
    return turma;
}
public void setTurma(Turma turma) {
    this.turma = turma;
}

public List<Avaliacao> getAvaliacoes() {
    return avaliacoes;
}
public void setAvaliacoes(List<Avaliacao>avaliacoes) {
    this.avaliacoes = avaliacoes;
}

 
}