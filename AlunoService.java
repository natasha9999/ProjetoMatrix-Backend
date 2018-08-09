package br.com.projetomatrix.academico;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import br.com.projetomatrix.academico.Aluno;
import br.com.projetomatrix.academico.Turma;
import br.com.projetomatrix.academico.StatusAcademico;
import br.com.projetomatrix.academico.Avaliacao;

       

public class AlunoService {
    
    private Long sequencial = new Long(0);
    
    private Map<String, Aluno> hashAlunos = new HashMap<>();
    
    
    public Aluno cadastrarAluno(Aluno aluno) {
        
        if(aluno == null || hashAlunos.containsKey(aluno.getMatricula()) != true)
               throw new IllegalArgumentException();
        
        aluno.setMatricula(gerarMatricula(aluno));
        hashAlunos.put(aluno.getMatricula(),aluno);
        return aluno;
    }
    
    public BigDecimal calcularMedia(List<Avaliacao>avaliacoes) {
        if(avaliacaoService == null || avaliacaoService.compareTo(BigDecimal.TEN) > 0
                || avaliacaoService.compareTo(BigDecimal.ZERO) < 0)
            {throw new IllegalArgumentException();}
        
        return new BigDecimal(0.0).add(avaliacoes).divide(new BigDecimal (3),2,BigDecimal.ROUND_HALF_UP);
    }
    
    
    public Aluno buscarStatusAcademico(Aluno aluno, Turma turma) {
        
        if(aluno == null || hashAlunos.containsKey(aluno.getMatricula()))
               throw new IllegalArgumentException();
        BigDecimal media = calcularMedia(aluno,turma);
        
        else if (media.compareTo(BigDecimal.valueOf(6)) >= 0)
                return StatusAcademico.APROVADO;
        else if (media.compareTo(BigDecimal.valueOf(4)) < 0)
                return StatusAcademico.REPROVADO;
        else 
                return StatusAcademico.PROVA_FINAL;
         
    }
    
    public Aluno recuperarAluno(String matricula) {
        
        if(matricula == null || matricula.length() == 0)
            throw new IllegalArgumentException();
        return hashAlunos.get(matricula);
    }
    
    public void removerAluno(String matricula) {
        
        if(matricula == null || matricula.length() == 0)
            throw new IllegalArgumentException();
        hashAlunos.remove(aluno.getMatricula());  
    }
    
    
    public void atualizarAluno(Aluno alunoNovo) {
        
        if(alunoNovo == null || alunoNovo.getMatricula().length() == 0 || alunoNovo.getMatricula() == null )
            throw new IllegalArgumentException();
        
        removerAluno(alunoNovo.getMatricula());
        cadastrarAluno(alunoNovo);
    }
    
    private String gerarMatricula(Aluno aluno) {
        
        int ano = LocalDateTime.now().getYear();
        String anoConvertido = Integer.toString(ano);
        int mes = LocalDateTime.now().getMonthValue();
        String semestre = mes <= 6 ? "1" : "2";
        
        sequencial.sum(sequencial, 1);
        
        String matricula = anoConvertido + "." + semestre + sequencial.intValue();
        aluno.setMatricula(matricula);
        hashAlunos.put(aluno.getMatricula(), aluno);
        return matricula;
    }
}
    