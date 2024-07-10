package Exercicio03;

public class Validacao {
    public static boolean validarEmprestimo(double valorDoEmprestimo){ 
        if (valorDoEmprestimo > 200000 || valorDoEmprestimo < 100) {
            return true;
        }
        else{
           return false; 
        }
    }
    public static boolean validarValor(double salarioAtual,double parcelas){
        if (parcelas > (salarioAtual * 0.15)) {
            return true;
        }
        else{
            return false; 
        }
    }
}
