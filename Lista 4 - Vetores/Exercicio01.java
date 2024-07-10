import java.util.Random;
import javax.swing.JOptionPane;


public class Exercicio01 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int escolha = 0;
        Random aleatorio = new Random();
        String resultados = "";
        boolean encontrou = false;

        for (int i = 0; i < 10; i++) {
            numeros[i] = aleatorio.nextInt(100) + 1;
            System.out.println(numeros[i]);
        }
        for (int j = 0; j < 10; j++) {
            escolha = Integer.parseInt(JOptionPane.showInputDialog("Tentativa: "+ (j + 1) +
            "\n Tente adivinhar o valor de um número aleatório de 1 a 100"));
            for (int cont = 0; cont < 10; cont++) {
                if (escolha == numeros[cont]) {
                    encontrou = true;
                    resultados = "Parabéns" +
                    "Você encontou um número secreto na posição: " + cont + 
                    "\n :)";
                }
                else if((cont == 9) && (encontrou == false)){
                    resultados = "Você não encontrou o número secreto :( ";
                }
            }
        }
        JOptionPane.showMessageDialog(null,resultados);
    }
    
}