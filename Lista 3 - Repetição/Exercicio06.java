import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(" Digite um número: "));
        String resultados = "";
        for (int i = 0; i < 11; i++) {
            resultados += "\n" + numero * i;
        }
        JOptionPane.showMessageDialog(null,resultados);
    }
}
