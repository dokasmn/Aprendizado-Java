package Exercicio03;

public class Calculo {
    public static double calcularValorTotal(double emprestimo,double juros){
        return emprestimo + (emprestimo * juros);
    }
    public static double calcularParcelas(double valorTotal,double prazo){
        return valorTotal/prazo;
    }
}
