package br.com.projetomatrix.academico;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import br.com.projetomatrix.academico.Curso;


public class CursoService {
	
	private Long sequencial = new Long(0);
    
    private Map<String, Curso> hashCursos = new HashMap<>();
    
    
    public Curso cadastrarCurso(Curso curso) {
        
        if(curso == null || hashCursos.containsKey(curso.getCodigo()) != true)
               throw new IllegalArgumentException();
        
        curso.setCodigo(gerarCodigo(curso));
        hashCursos.put(curso.getCodigo(),curso);
        return curso;
    }
    
    
    public Curso recuperarCurso(String codigo) {
        
        if(codigo == null || codigo.length() == 0)
            throw new IllegalArgumentException();
        return hashCursos.get(codigo);
    }
    
    public void removerCurso(String codigo) {
        
        if(codigo == null || codigo.length() == 0)
            throw new IllegalArgumentException();
         hashCursos.remove(codigo);  
    }
    
    
    public void atualizarCursos(Curso CursoNovo) {
        
        if(CursoNovo == null || CursoNovo.getCodigo().length() == 0 || CursoNovo.getCodigo() == null )
            throw new IllegalArgumentException();
        
        removerCurso(CursoNovo.getCodigo());
        cadastrarCurso(CursoNovo);
    }
    
    private String gerarCodigo(Curso curso) {
        
        int ano = LocalDateTime.now().getYear();
        String anoConvertido = Integer.toString(ano);
        int mes = LocalDateTime.now().getMonthValue();
        String semestre = mes <= 6 ? "1" : "2";
        
        sequencial.sum(sequencial, 1);
        
        String codigo = anoConvertido + "." + semestre + sequencial.intValue();
        curso.setCodigo(codigo);
        hashCursos.put(curso.getCodigo(), curso);
        return codigo;
    }
    
    
}


