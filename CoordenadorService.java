package br.com.projetomatrix.academico;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.time.LocalDateTime;
import br.com.projetomatrix.academico.Coordenador;
       

public class CoordenadorService {
    
    private Long sequencial = new Long(0);
    
    private Map<String, Coordenador> hashCoordenadores = new HashMap<>();
    
    
    public Coordenador cadastrarCoordenador(Coordenador coordenador) {
        
        if(coordenador == null || hashCoordenadores.containsKey(coordenador.getMatricula()) != true)
               throw new IllegalArgumentException();
        
        coordenador.setMatricula(gerarMatricula(coordenador));
        hashCoordenadores.put(coordenador.getMatricula(),coordenador);
        return coordenador;
    }
    
    
    public Coordenador recuperarCoordenador(String matricula) {
        
        if(matricula == null || matricula.length() == 0)
            throw new IllegalArgumentException();
        return hashCoordenadores.get(matricula);
    }
    
    public void removerCoordenador(String matricula) {
        
        if(matricula == null || matricula.length() == 0)
            throw new IllegalArgumentException();
        hashCoordenadores.remove(matricula);  
    }
    
    
    public void atualizarCoordenadores(Coordenador coordenadorNovo) {
        
        if(coordenadorNovo == null || coordenadorNovo.getMatricula().length() == 0 || coordenadorNovo.getMatricula() == null )
            throw new IllegalArgumentException();
        
        removerCoordenador(coordenadorNovo.getMatricula());
        cadastrarCoordenador(coordenadorNovo);
    }
    
    private String gerarMatricula(Coordenador coordenador) {
        
        int ano = LocalDateTime.now().getYear();
        String anoConvertido = Integer.toString(ano);
        int mes = LocalDateTime.now().getMonthValue();
        String semestre = mes <= 6 ? "1" : "2";
        
        sequencial.sum(sequencial, 1);
        
        String matricula = anoConvertido + "." + semestre + sequencial.intValue();
        coordenador.setMatricula(matricula);
        hashCoordenadores.put(coordenador.getMatricula(), coordenador);
        return matricula;
    }
    
    
}

 