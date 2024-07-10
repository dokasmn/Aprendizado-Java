import java.util.Random;
import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[] numeros = new int[11];
        String resultados = "";

        for (int i = 0; i < 11; i++) {
            numeros[i] = aleatorio.nextInt(100) + 1;
            resultados += "\n" + numeros[i] + ";";
        }
        
        JOptionPane.showMessageDialog(null,"Elementos de um vetor: \n" + resultados);
        resultados = "";

        int i = 10;
        int j = 0;
        int k = 0;
        
        for (j = 0; j < 6; j++) {
            k = numeros[j];
            numeros[j] = numeros[i];
            numeros[i] = k;
            i -= 1;
        }
        for (int j2 = 0; j2 < 11; j2++) {
            resultados += "\n" + numeros[j2] + ";";
        }

        JOptionPane.showMessageDialog(null,"Elementos de um vetor ordenados em ordem inversa: \n" + resultados);
    }
}
