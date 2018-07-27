package br.com.cariocadev.ProjetoMatrix;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class AvaliadorAluno {
	

	public BigDecimal getMaiorNota(BigDecimal[] notas) {
		if(notas==null) {
			throw new IllegalArgumentException("Entrada invalida");
		}
		else {
			return System.out.println(new BigDecimal("2.00").max(new BigDecimal("1.5")));
	}
	   

	public BigDecimal getMedia(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {
		
		if((nota1==null)|| (nota2==null)|| (nota3==null)|| (nota1<0)|| (nota2<0)|| (nota3<0)|| (nota1>10)|| (nota2>10)|| (nota3>10)) {
			throw new IllegalArgumentException("Entrada invalida");
		}
		else {
			System.out.println((new BigDecimal("4.00").add(new BigDecimal("5.00").add(new BigDecimal("7.00"))/3,2,RoundingMode.UP)));
		}
		return getMedia(nota1,nota2,nota3);
	}

	public String getStatus(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {
	    else if(getMedia(nota1,nota2,nota3)>=6) {
		   System.out.println("Aprovado");
	    }
	    else if(getMedia(nota1,nota2,nota3).compareTo(new )
	}
		return getStatus(nota1,nota2,nota3);
	}
	
	

}
