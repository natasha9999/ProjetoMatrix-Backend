package br.com.projetomatrix.academico;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import br.com.projetomatrix.academico.Disciplina;

public class DisciplinaService {
	
	private Long sequencial = new Long(0);
    
    private Map<String, Disciplina> hashDisciplinas = new HashMap<>();
    
    
    public Disciplina cadastrarDisciplina (Disciplina disciplina) {
        
        if(disciplina == null || hashDisciplinas.containsKey(disciplina.getCodigo()) != true)
               throw new IllegalArgumentException();
        
        disciplina.setCodigo(gerarCodigo(disciplina));
        hashDisciplinas.put(disciplina.getCodigo(),disciplina);
        return disciplina;
    }
    
    
    public Disciplina recuperarDisciplina(String codigo) {
        
        if(codigo == null || codigo.length() == 0)
            throw new IllegalArgumentException();
        return hashDisciplinas.get(codigo);
    }
    
    public void removerDisciplina(String codigo) {
        
        if(codigo == null || codigo.length() == 0)
            throw new IllegalArgumentException();
         hashDisciplinas.remove(codigo);  
    }
    
    
    public void atualizarDisciplinas(Disciplina DisciplinaNova) {
        
        if(DisciplinaNova == null || DisciplinaNova.getCodigo().length() == 0 || DisciplinaNova.getCodigo() == null )
            throw new IllegalArgumentException();
        
        removerDisciplina(DisciplinaNova.getCodigo());
        cadastrarDisciplina(DisciplinaNova);
    }
    
    private String gerarCodigo(Disciplina disciplina) {
        
        int ano = LocalDateTime.now().getYear();
        String anoConvertido = Integer.toString(ano);
        int mes = LocalDateTime.now().getMonthValue();
        String semestre = mes <= 6 ? "1" : "2";
        
        sequencial.sum(sequencial, 1);
        
        String codigo = anoConvertido + "." + semestre + sequencial.intValue();
        disciplina.setCodigo(codigo);
        hashDisciplinas.put(disciplina.getCodigo(), disciplina);
        return codigo;
    }
    
}
    


