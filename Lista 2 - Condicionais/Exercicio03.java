import javax.swing.JOptionPane;

public class Exercicio03 {
    public static void main(String[] args) {
        int timeA = Integer.parseInt(JOptionPane.showInputDialog(" Digite a quantidade de gols do time A: "));
        int timeB = Integer.parseInt(JOptionPane.showInputDialog(" Digite a quantidade de gols do time B: "));
        String resultado = "O resultado da comparação entre os dois times é que:";
        
        
        if (timeA == timeB){
            resultado += "eles empataram";
        }
        else if (timeA > timeB) {
            resultado += "time A venceu";
        }
        else{
            resultado += "time B venceu";
        }

        JOptionPane.showMessageDialog(null,resultado);
    }
}
