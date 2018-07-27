package br.com.cariocadev.ProjetoMatrix;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculadoraSalario {

	public BigDecimal getSalarioLiquido(BigDecimal salarioBruto, BigDecimal percentualImpostoINSS) {
		if((salarioBruto==null) || (percentualImpostoINSS==null)) {
			throw new IllegalArgumentException("Entrada invalida");
		}
		else {
			System.out.println(new salarioBruto.subtract(new percentualImpostoINSS));
		}
		
		return getSalarioLiquido(salarioBruto,percentualImpostoINSS);
	}

	
	
	
	public BigDecimal getValorINSS(BigDecimal salarioBruto) {
		String result = "invalido";
		if(salarioBruto == null) {
			throw new IllegalArgumentException();
		
		}
		 else if(salarioBruto<=1693.72){
			  
			  return System.out.println(salarioBruto.multiply(new BigDecimal("0.08")),2,RoundingMode.UP);
		 }
		 else if((salarioBruto<=2822.90) && (salarioBruto>=1693.73)){
			     
			       return System.out.println(salarioBruto.multiply(new BigDecimal("0.09")),2,RoundingMode.UP);
		    }
		       else if(salarioBruto>=2822.91){
				    
				    return System.out.println(salarioBruto.multiply(new BigDecimal("0.11")),2,RoundingMode.UP);
		       }
		return getValorINSS(salarioBruto);
		
	}

	
	
	
	
	public BigDecimal getValorPlanoDeSaude(Integer idade) {
		if((idade==null) || (idade<0)) {
			throw new IllegalArgumentException("Entrada invalida");
		}
		 else if((idade>=0) && (idade<=9))
			System.out.println(new BigDecimal("75.00"));
		 else if((idade>=10) && (idade<=19))
		    System.out.println(new BigDecimal("112.50"));
		 else if((idade>=20) && (idade<=29))
		    System.out.println(new BigDecimal("168.75"));
		 else if((idade>=30) && (idade<=39))
		    System.out.println(new BigDecimal("253.13"));
		 else if((idade>=40) && (idade<=49))
	    	 System.out.println(new BigDecimal("379.69"));
		 else if((idade>=50) && (idade<=59))
	    	 System.out.println(new BigDecimal("569.54"));
		 else if(idade>=60)
	    	 System.out.println(new BigDecimal("854.30"));
		          
		return getValorPlanoDeSaude(idade);
	}

}
