package br.com.projetomatrix.academico;

import br.com.projetomatrix.academico.Avaliacao;
import br.com.projetomatrix.academico.Aluno;
import br.com.projetomatrix.academico.Turma;;
import br.com.projetomatrix.academico.ResponsavelAplicacaoAvaliacao;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class AvaliacaoService {
    
    private Long sequencial = new Long(0);
    
    private Map<String, Avaliacao> hashAvaliacao = new HashMap<>();
    
    public Avaliacao cadastrarAvaliacao(Avaliacao avaliacao) {
        if(avaliacao == null || hashAvaliacao.containsKey(avaliacao.getCodigo()) != true)
               throw new IllegalArgumentException();
        
        avaliacao.setCodigo(gerarCodigo(avaliacao));
        hashAvaliacao.put(avaliacao.getCodigo(),avaliacao);
        return avaliacao;
    }
    
    public Avaliacao recuperarAvaliacao(String codigo) {
        
        if(codigo == null || codigo.length() == 0)
            throw new IllegalArgumentException();
        return hashAvaliacao.get(codigo);
    }
    
    public void removerAvaliacao(String codigo) {
        
        if(codigo == null || codigo.length() == 0)
            throw new IllegalArgumentException();
        hashAvaliacao.remove(avaliacao.getCodigo());  
    }
    
    public void atualizarAvaliacao(Avaliacao avaliacaoNova) {
        
        if(avaliacaoNova == null || avaliacaoNova.getCodigo().length() == 0 || avaliacaoNova.getCodigo() == null )
            throw new IllegalArgumentException();
        
        cadastrarAvaliacao(avaliacaoNova);
        
    }
    
    private String gerarCodigo(Avaliacao avaliacao) {
        
        int ano = LocalDateTime.now().getYear();
        String anoConvertido = Integer.toString(ano);
        int mes = LocalDateTime.now().getMonthValue();
        String semestre = mes <= 6 ? "1" : "2";
        
        sequencial.sum(sequencial, 1);
        
        String codigo = anoConvertido + "." + semestre + sequencial.intValue();
        avaliacao.setMatricula(codigo);
        hashAvaliacao.put(avaliacao.getCodigo(), avaliacao);
        return codigo;
    }
    
}
