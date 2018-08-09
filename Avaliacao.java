package br.com.projetomatrix.academico;

import br.com.projetomatrix.academico.Aluno;
import br.com.projetomatrix.academico.Turma;
import br.com.projetomatrix.academico.ResponsavelAplicacaoAvaliacao;
import java.math.BigDecimal;
import java.util.Date;

public class Avaliacao {
    
    private int codigo;
    private Date dataDeRealizacao;
    private String descricao;
    private Modo modo;
    private ResponsavelAplicacaoAvaliacao responsavelAplicacaoAvaliacao;
    private Aluno aluno;
    private Turma turma;
     
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public Date getDataDeRealizacao() {
        return dataDeRealizacao;
    }
    public void setDataDeRealizacao(Date dataDeRealizacao) {
        this.dataDeRealizacao = dataDeRealizacao;
    }
    
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public ResponsavelAplicacaoAvaliacao getResponsavelAplicacaoAvaliacao() {
        return responsavelAplicacaoAvaliacao;
    }
    public void setResponsavelAplicacaoAvaliacao(ResponsavelAplicacaoAvaliacao responsavelAplicacaoAvaliacao) {
        this.responsavelAplicacaoAvaliacao = responsavelAplicacaoAvaliacao;
    }
    
    public Modo getModo() {
        return modo;
    }
    public void setModo(Modo modo) {
        this.modo = modo;
    }
    
    public Aluno getAluno() {
        return aluno;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    public Turma getTurma() {
        return turma;
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    public BigDecimal getMedia(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {
        if(nota1 == null || nota2 == null || nota3 == null
                || nota1.compareTo(BigDecimal.ZERO) < 0
                || nota2.compareTo(BigDecimal.ZERO) < 0
                || nota3.compareTo(BigDecimal.ZERO) < 0
                || nota1.compareTo(BigDecimal.TEN) > 0
                || nota2.compareTo(BigDecimal.TEN) > 0
                || nota3.compareTo(BigDecimal.TEN) > 0)
        {throw new IllegalArgumentException();}
       
                
                return new BigDecimal(0.0).add(nota1).add(nota2).add(nota3).divide(new BigDecimal(3),2,BigDecimal.ROUND_HALF_UP);
    }
     

}