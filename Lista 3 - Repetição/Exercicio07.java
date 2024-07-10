import javax.swing.JOptionPane;

public class Exercicio07 {
   public static void main(String[] args) {
        String nomes = "";
        double[] alturas = new double[6];
        int[] pesos = new int[2];
        String pessoaMaisAlta = "";
        String pessoaMaisPesada = "";

        for (int i = 0; i < 6; i++) {
            nomes = JOptionPane.showInputDialog((i + 1) + " Digite seu nome: ");
            alturas[i] += Double.parseDouble(JOptionPane.showInputDialog((i + 1) + " Digite sua altura: "));
            if ((i > 0) && (alturas[i] > alturas[i - 1])) {
                pessoaMaisAlta = nomes;
            }
            pesos[i] += Integer.parseInt(JOptionPane.showInputDialog((i + 1) + " Digite seu peso: "));
            if ((i > 0) && (pesos[i] > pesos[i-1])) {
                pessoaMaisPesada = nomes;
            }
        }
        String resultados = 
        " A pessoa mais alta é: " + pessoaMaisAlta +
        "\n A pessoa mais pesada é: " + pessoaMaisPesada;
        
        JOptionPane.showMessageDialog(null,resultados);
   } 
}
