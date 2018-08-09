package br.com.projetomatrix.academico;

import java.util.List;

public class Turma {
    
     private String codigo;
     private int anoLetivo;
     private String semestre;
     private String dataDeAbertura;
     private String dataDeEncerramento;
     private Horario horario;
     private Disciplina disciplina;
     private Professor professor;
     private List<Aluno>alunos;
     
     
    public  String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public int getAnoLetivo() {
        return anoLetivo;
    }
    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }
    
    public String getSemestre() {
        return semestre;
    }
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    
    public String getDataDeAbertura() {
        return dataDeAbertura;
    }
    public void setDataDeAbertura(String dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }
    
    public String getDataDeEncerramento() {
        return dataDeEncerramento;
    }
    public void setDataDeEncerramento(String dataDeEncerramento) {
        this.dataDeEncerramento = dataDeEncerramento;
    }
    
    public Horario getHorario() {
        return horario;
    }
    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    
    public Disciplina getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public List<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(List<Aluno>alunos) {
        this.alunos = alunos;
    }
    
     
}