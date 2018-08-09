package br.com.projetomatrix.academico;

public abstract class Aluno extends Pessoa {
    
    private Curso curso;
    
    public Aluno() {
    	
    }
    
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    

    
}