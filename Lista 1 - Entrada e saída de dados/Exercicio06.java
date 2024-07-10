import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {
         double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da primeira nota: "));
         double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da segunda nota: "));

         double mediaPonderada = (((nota1 * 4) + (nota2 * 6)) /10 );
     
         JOptionPane.showMessageDialog(null, 
            "\n" +
            "O valor da média ponderada é: " + mediaPonderada +
            "\n"
        );
    }
}