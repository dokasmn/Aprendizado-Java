import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {
        double valorUnitario = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor unitário do produto: "));
        int numeroUnidades = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de unidades: "));
        double valorFinal;
        String resultado = "\n O valor final do produto será de: ";

        if (numeroUnidades<=12) {
            valorFinal = valorUnitario * numeroUnidades;
        }
        else{
            valorFinal = ((valorUnitario) - (valorUnitario *0.10 )) * numeroUnidades;
        }

        resultado += valorFinal + " R$";
        JOptionPane.showMessageDialog(null,resultado);
    }
}
