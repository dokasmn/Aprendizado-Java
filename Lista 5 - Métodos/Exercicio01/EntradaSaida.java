package Exercicio01;

import javax.swing.JOptionPane;

public class EntradaSaida {
        public static int perguntarTotalNotas(){
            return Integer.parseInt(JOptionPane.showInputDialog(null," Qual será o número de notas? "));
        }
        public static double perguntarNota(int i){
                return Double.parseDouble(JOptionPane.showInputDialog("Digite a " + i + " nota:"));
        }
        public static int perguntarOpcao(){
            return Integer.parseInt(JOptionPane.showInputDialog(null,
            "Escolha uma opção para o calculo da mádia:" +
            "\n[1]- aritmética" +
            "\n[2]- ponderada"));
        }
        public static double pedirPesos(int i){
            return Double.parseDouble(JOptionPane.showInputDialog(null," Qual será o peso da nota " + i));
        }
        }
    
