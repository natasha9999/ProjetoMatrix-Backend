package br.com.projetomatrix.academico;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.time.LocalDateTime;
import br.com.projetomatrix.academico.Professor;
import br.com.projetomatrix.academico.Turma;
       

public class ProfessorService {
    
    private Long sequencial = new Long(0);
    
    private Map<String, Professor> hashProfessores = new HashMap<>();
    
    
    public Professor cadastrarProfessor(Professor professor) {
        
        if(professor == null || hashProfessores.containsKey(professor.getMatricula()) != true)
               throw new IllegalArgumentException();
        
        professor.setMatricula(gerarMatricula(professor));
        hashProfessores.put(professor.getMatricula(),professor);
        return professor;
    }
    
    
    public Professor recuperarProfessor(String matricula) {
        
        if(matricula == null || matricula.length() == 0)
            throw new IllegalArgumentException();
        return hashProfessores.get(matricula);
    }
    
    public void removerProfessor(String matricula) {
        
        if(matricula == null || matricula.length() == 0)
            throw new IllegalArgumentException();
         hashProfessores.remove(matricula);  
    }
    
    
    public void atualizarProfessores(Professor professorNovo) {
        
        if(professorNovo == null || professorNovo.getMatricula().length() == 0 || professorNovo.getMatricula() == null )
            throw new IllegalArgumentException();
        
        removerProfessor(professorNovo.getMatricula());
        cadastrarProfessor(professorNovo);
    }
    
    private String gerarMatricula(Professor professor) {
        
        int ano = LocalDateTime.now().getYear();
        String anoConvertido = Integer.toString(ano);
        int mes = LocalDateTime.now().getMonthValue();
        String semestre = mes <= 6 ? "1" : "2";
        
        sequencial.sum(sequencial, 1);
        
        String matricula = anoConvertido + "." + semestre + sequencial.intValue();
        professor.setMatricula(matricula);
        hashProfessores.put(professor.getMatricula(), professor);
        return matricula;
    }
    
    
}

 