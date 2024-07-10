
package Exercicio01;
import javax.swing.JOptionPane;
public class EntradaSaida {

    public static String solicitarDados(String dado) {
        return JOptionPane.showInputDialog("Informe " + dado + ":");
    }

    public static void mostrarTenis(String listarProdutos) {
        JOptionPane.showMessageDialog(null, listarProdutos);
    }
    
}
