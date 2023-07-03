package model;

public class Dividir {
    public int dividirInt (int n1, int n2) {
        if (n2 != 0) 
            return n1 / n2;
        else
            throw new ArithmeticException("Divisão por zero!");
    }

    public Float dividirFloat (Float n1, Float n2) {
        if (n2 != 0) 
            return n1 / n2;
        else
            throw new ArithmeticException("Divisão por zero!");
    }

    public Double dividirDouble (Double n1, Double n2) {
        if (n2 != 0) 
            return n1 / n2;
        else
            throw new ArithmeticException("Divisão por zero!");
    }  
}
