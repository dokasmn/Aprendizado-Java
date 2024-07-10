package Exercicio02;

import javax.swing.JOptionPane;

public class EntradaSaida {
    public static double pedirSalario(){
        return Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do seu salário bruto: "));
    }
    public static double pedirHoraExtras(){
        return Double.parseDouble(JOptionPane.showInputDialog("Informe o número de horas extras: "));
    }
}
