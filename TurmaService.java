package br.com.projetomatrix.academico;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.time.LocalDateTime;
import br.com.projetomatrix.academico.Turma;
import br.com.projetomatrix.academico.Professor;
import br.com.projetomatrix.academico.Aluno;


public class TurmaService { 
	    
	    private Long sequencial = new Long(0);
	    
	    private Map<String, Turma> hashTurmas = new HashMap<>();
	    
	    
	    public Turma cadastrarTurma(Turma turma) {
	        
	        if(turma == null || hashTurmas.containsKey(turma.getCodigo()) != true)
	               throw new IllegalArgumentException();
	        
	        turma.setCodigo(gerarCodigo(turma));
	        hashTurmas.put(turma.getCodigo(),turma);
	        return turma;
	    }
	    
	    
	    public Turma recuperarTurma(String codigo) {
	        
	        if(codigo == null || codigo.length() == 0)
	            throw new IllegalArgumentException();
	        return hashTurmas.get(codigo);
	    }
	    
	    public void removerTurma(String codigo) {
	        
	        if(codigo == null || codigo.length() == 0)
	            throw new IllegalArgumentException();
	         hashTurmas.remove(codigo);  
	    }
	    
	    
	    public void atualizarTurmas(Turma TurmaNova) {
	        
	        if(TurmaNova == null || TurmaNova.getCodigo().length() == 0 || TurmaNova.getCodigo() == null )
	            throw new IllegalArgumentException();
	        
	        removerTurma(TurmaNova.getCodigo());
	        cadastrarTurma(TurmaNova);
	    }
	    
	    private String gerarCodigo(Turma turma) {
	        
	        int ano = LocalDateTime.now().getYear();
	        String anoConvertido = Integer.toString(ano);
	        int mes = LocalDateTime.now().getMonthValue();
	        String semestre = mes <= 6 ? "1" : "2";
	        
	        sequencial.sum(sequencial, 1);
	        
	        String codigo = anoConvertido + "." + semestre + sequencial.intValue();
	        turma.setCodigo(codigo);
	        hashTurmas.put(turma.getCodigo(), turma);
	        return codigo;
	    }
	    
	    
	}

	 


