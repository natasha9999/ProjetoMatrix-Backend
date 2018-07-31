package br.com.cariocadev.ProjetoMatrix;

import java.math.BigDecimal;

public class CalculadoraSalario {

    public BigDecimal getSalarioLiquido(BigDecimal salarioBruto, BigDecimal percentualImpostoINSS) {
        BigDecimal salarioLiquido = new BigDecimal(0);
        if ((salarioBruto == null) || (percentualImpostoINSS == null))
            throw new IllegalArgumentException();
            
            salarioLiquido = salarioBruto.subtract(salarioBruto.multiply(percentualImpostoINSS.divide(BigDecimal.valueOf(100.00))));
            return salarioLiquido.setScale(2, BigDecimal.ROUND_HALF_UP);
        
    }

    public BigDecimal getValorINSS(BigDecimal salarioBruto) {
    	
        if (salarioBruto == null)
            throw new IllegalArgumentException();
    	
        if (salarioBruto.compareTo(BigDecimal.valueOf(1693.72)) <= 0)
            return salarioBruto.multiply(BigDecimal.valueOf(8)).divide(BigDecimal.valueOf(100)).setScale(2, BigDecimal.ROUND_HALF_UP);
        else if ((salarioBruto.compareTo(BigDecimal.valueOf(1693.72)) > 0) && (salarioBruto.compareTo(BigDecimal.valueOf(2822.90)) <= 0))
            return salarioBruto.multiply(BigDecimal.valueOf(9)).divide(BigDecimal.valueOf(100)).setScale(2, BigDecimal.ROUND_HALF_UP);
        else if (salarioBruto.compareTo(BigDecimal.valueOf(2822.91)) >= 0)
            return salarioBruto.multiply(BigDecimal.valueOf(11)).divide(BigDecimal.valueOf(100)).setScale(2, BigDecimal.ROUND_HALF_UP);
        
        return BigDecimal.ZERO;
        
    }

    public BigDecimal getValorPlanoDeSaude(Integer idade) {
        if ((idade == null) || (idade < 0))
            throw new IllegalArgumentException();
        
        else if ((idade >= 0) && (idade <= 9))
            return BigDecimal.valueOf(75).setScale(2, BigDecimal.ROUND_HALF_UP);
        else if ((idade >= 10) && (idade <= 19))
            return BigDecimal.valueOf(112.50).setScale(2, BigDecimal.ROUND_HALF_UP);
        else if ((idade >= 20) && (idade <= 29))
            return BigDecimal.valueOf(168.75).setScale(2, BigDecimal.ROUND_HALF_UP);
        else if ((idade >= 30) && (idade <= 39))
            return BigDecimal.valueOf(253.13).setScale(2, BigDecimal.ROUND_HALF_UP);
        else if ((idade >= 40) && (idade <= 49))
            return BigDecimal.valueOf(379.69).setScale(2, BigDecimal.ROUND_HALF_UP);
        else if ((idade >= 50) && (idade <= 59))
            return BigDecimal.valueOf(569.54).setScale(2, BigDecimal.ROUND_HALF_UP);
        else if (idade >= 60)
            return BigDecimal.valueOf(854.30).setScale(2, BigDecimal.ROUND_HALF_UP);
        
        return BigDecimal.ZERO;
        
    }
}

