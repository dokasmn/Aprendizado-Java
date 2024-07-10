package Exercicio03;
import javax.swing.JOptionPane;

public class EntradaSaida {
    public static double perguntarSalario(){
        return Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário atual: "));
    }
    public static double perguntarEmprestimo(){
        return Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do empréstimo: "));
    }
}
