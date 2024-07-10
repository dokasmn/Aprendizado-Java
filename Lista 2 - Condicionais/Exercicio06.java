import javax.swing.JOptionPane;
import java.util.Random;

public class Exercicio06 {
    public static void main(String[] args) {
        Random numeroAleatorio = new Random();
        int maximo = 100;
        
        int numeroDaSorte = numeroAleatorio.nextInt(maximo) + 1;

        int numeroEscolhido = Integer.parseInt(JOptionPane.showInputDialog(" Tente adivinhar o numero da sorte: "));
        String resultado;

        if (numeroEscolhido == numeroDaSorte) {
            resultado = "Você acertou";
        }
        else {
            resultado = "Você errou";
        }

        JOptionPane.showMessageDialog(null,resultado);
    }
}
 