package br.com.projetomatrix.academico;

import java.util.List;

public class Curso {
    
    private String descricao;
    private String codigo;
    private Integer cargaHoraria;
    private String ementa;
    private String bibliografia;
    private List<Disciplina> disciplinas;
    private Coordenador coordenador;
    
    
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public Integer getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    public String getEmenta() {
        return ementa;
    }
    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }
    
    public String getBibliografia() {
        return bibliografia;
    }
    public void setBibliografia(String bibliografia) {
        this.bibliografia = bibliografia;
    }
    
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplina(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    public Coordenador getCoordenador() {
        return coordenador;
    }
    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }
	
    
}