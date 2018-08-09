package br.com.projetomatrix.academico;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import br.com.projetomatrix.academico.Horario;

public class HorarioService {
	
	private Long sequencial = new Long(0);
    
    private Map<String, Horario> hashHorarios = new HashMap<>();
    
    
    public Horario cadastrarHorario(Horario horario) {
        
        if(horario == null || hashHorarios.containsKey(horario.getCodigo()) != true)
               throw new IllegalArgumentException();
        
        horario.setCodigo(gerarCodigo(horario));
        hashHorarios.put(horario.getCodigo(),horario);
        return horario;
    }
    
    
    public Horario recuperarHorario(String codigo) {
        
        if(codigo == null || codigo.length() == 0)
            throw new IllegalArgumentException();
        return hashHorarios.get(codigo);
    }
    
    public void removerHorario(String codigo) {
        
        if(codigo == null || codigo.length() == 0)
            throw new IllegalArgumentException();
         hashHorarios.remove(codigo);  
    }
    
    
    public void atualizarHorarios(Horario HorarioNovo) {
        
        if(HorarioNovo == null || HorarioNovo.getCodigo().length() == 0 || HorarioNovo.getCodigo() == null )
            throw new IllegalArgumentException();
        
        removerHorario(HorarioNovo.getCodigo());
        cadastrarHorario(HorarioNovo);
    }
    
    private String gerarCodigo(Horario horario) {
        
        int ano = LocalDateTime.now().getYear();
        String anoConvertido = Integer.toString(ano);
        int mes = LocalDateTime.now().getMonthValue();
        String semestre = mes <= 6 ? "1" : "2";
        
        sequencial.sum(sequencial, 1);
        
        String codigo = anoConvertido + "." + semestre + sequencial.intValue();
        horario.setCodigo(codigo);
        hashHorarios.put(horario.getCodigo(), horario);
        return codigo;
    }
    

}
