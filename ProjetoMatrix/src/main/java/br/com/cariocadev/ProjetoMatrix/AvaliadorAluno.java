package br.com.cariocadev.ProjetoMatrix;

import java.math.BigDecimal;

public class AvaliadorAluno {

    public BigDecimal getMaiorNota(BigDecimal[] notas) {
		if(notas == null){
                    throw new IllegalArgumentException();
                }
                BigDecimal maiorNota = new BigDecimal(0);
                for (int i = 0; i < notas.length; i++){
                    if (notas[i].compareTo(maiorNota) > 0){
                        maiorNota = notas[i];
                    }
                }

        return maiorNota;
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

    public String getStatus(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {
        BigDecimal media = getMedia(nota1 ,nota2, nota3);
        if((nota1 == null) || (nota2 == null) || (nota3 == null)
                || (nota1.compareTo(BigDecimal.ZERO) < 0)
                || (nota2.compareTo(BigDecimal.ZERO) < 0)
                || (nota3.compareTo(BigDecimal.ZERO) < 0)
                || (nota1.compareTo(BigDecimal.TEN) > 0)
                || (nota2.compareTo(BigDecimal.TEN) > 0)
                || (nota3.compareTo(BigDecimal.TEN) > 0))
                throw new IllegalArgumentException();
        
        else if (media.compareTo(BigDecimal.valueOf(6)) >= 0)
                return "APROVADO";
        else if (media.compareTo(BigDecimal.valueOf(4)) < 0)
                return "REPROVADO";
        else 
                return "PROVA_FINAL";
            
        }
}
        




