package br.com.projetomatrix.academico;

import br.com.projetomatrix.academico.Aluno;
import br.com.projetomatrix.academico.Boletim;
import java.util.List;

public class Historico {
    
    private List<Boletim> boletins;
    private Aluno aluno;
    
    
    public List<Boletim> getBoletins() {
        return boletins;
    }
    public void setBoletins(List<Boletim> boletins) {
        this.boletins = boletins;
    }
    
    public Aluno getAluno() {
        return aluno;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

 
 
}