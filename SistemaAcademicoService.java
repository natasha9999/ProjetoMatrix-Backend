package br.com.projetomatrix.academico;

import br.com.projetomatrix.academico.Aluno;
import br.com.projetomatrix.academico.Avaliacao;
import br.com.projetomatrix.academico.Boletim;
import br.com.projetomatrix.academico.Coordenador;
import br.com.projetomatrix.academico.Curso;
import br.com.projetomatrix.academico.Disciplina;
import br.com.projetomatrix.academico.Professor;
import br.com.projetomatrix.academico.Horario;
import br.com.projetomatrix.academico.Turma;
import br.com.projetomatrix.academico.Status;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class SistemaAcademicoService {
    
    public Aluno cadastrarAluno(Aluno aluno) {
        return alunoService.cadastrarAluno(aluno);
    }
    
    public Aluno atualizarAluno(Aluno aluno) {
        return alunoService.atualizarAluno(aluno);
    }
    
    public void removerAluno(Aluno aluno) {
        alunoService.removerAluno(aluno);
    }
    
    public Professor cadastrarProfessor(Professor professor) {
        return professorService.cadastrarProfessor(professor);
    }
    
    public Professor atualizarProfessor(Professor professor) {
        return professorService.atualizarProfessor(professor);
    }
    
    public void removerProfessor(Professor professor) {
        professorService.removerProfessor(professor);
    }
    
    public Coordenador cadastrarCoordenador(Coordenador coordenador) {
        return coordenadorService.cadastrarCoordenador(coordenador);
    }
    
    public Coordenador atualizarCoordenador(Coordenador coordenador) {
        return coordenadorService.atualizarCoordenador(coordenador);
    }
    
    public void removerCoordenador(Coordenador coordenador) {
        coordenadorService.removerCoordenador(coordenador);
    }
    
    public Turma cadastrarTurma(Turma turma) {
        return turmaService.cadastrarTurma(turma);
    }
    
    public Turma atualizarTurma(Turma turma) {
        return turmaService.atualizarTurma(turma);
    }
    
    public void removerTurma(Turma) {
        turmaService.removerTurma(turma);
    }
    
    public Disciplina cadastrarDisciplina(Disciplina disciplina) {
        return disciplinaService.cadastrarDisciplina(disciplina);
    }
    
    public Disciplina atualizarDisciplina(Disciplina disciplina) {
        return disciplinaService.atualizarDisciplina(disciplina);
    }
    
    public void removerDisciplina(Disciplina disciplina) {
        disciplinaService.removerDisciplina(disciplina);
    }
    
    public Curso cadastrarCurso(Curso curso) {
        return cursoService.cadastrarCurso(curso);
    }
    
    public Curso atualizarCurso(Curso curso) {
        return cursoService.atualizarCurso(curso);
    }
    
    public void removerCurso(Curso curso) {
        cursoService.removerCurso(curso);
    }
    
    public Horario cadastrarHorario(Horario horario) {
        return horarioService.cadastrarHorario(horario);
    }
    
    public Horario atualizarHorario(Horario horario) {
        return horarioService.atualizarHorario(horario);
    }
    
    public void removerHorario(Horario horario) {
        horarioService.removerHorario(horario);
    }
    
    public Avaliacao cadastrarAvaliacao(Avaliacao avaliacao) {
        return avaliacaoService.cadastrarAvaliacao(avaliacao);
    }
    
    public Avaliacao atualizarAvaliacao(Avaliacao avaliacao) {
        return avaliacaoService.atualizarAvaliacao(avaliacao);
    }
    
    public void removerAvaliacao(Avaliacao avaliacao) {
        avaliacaoService.removerAvaliacao(avaliacao);
    }
    
 
    
    
}



