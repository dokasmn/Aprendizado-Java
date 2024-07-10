import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {
        int quantidadeAtual = Integer.parseInt(JOptionPane.showInputDialog(" Informe o quantidade atual do produto em estoque: "));
        int maximo = Integer.parseInt(JOptionPane.showInputDialog(" Informe o quantidade máxima de produtos em estoque: "));
        int minimo = Integer.parseInt(JOptionPane.showInputDialog(" Informe o quantidade mínima de produtos em estoque: "));

        double quantidadeMedia = (maximo + minimo) / 2;
        String resultado = "Status: ";

        if (quantidadeAtual >= quantidadeMedia) {
            resultado += "Não efetuar compra";
        }
        else {
            resultado += "Efetuar compra";
        }

        JOptionPane.showMessageDialog(null,resultado);
    }
}
