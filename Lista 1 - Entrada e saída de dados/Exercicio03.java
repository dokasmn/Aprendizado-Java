import javax.swing.JOptionPane;

public class Exercicio03 {
    public static void main(String[] args) {
        double valorDeCompra = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da compra: "));
        double valorDorepresentante = (valorDeCompra * 0.20);
        double impostos = (valorDeCompra * 0.30);
        double valorDeVenda = (valorDeCompra + valorDorepresentante + impostos);
        
        JOptionPane.showMessageDialog(null,
            "\n" + 
            "\n Valor de compra: " + valorDeCompra + "R$" +
            "\n Valor do representante: " + valorDorepresentante + "R$" +
            "\n Impostos: " + impostos + "R$" +
            "\n Valor de venda é: " + valorDeVenda + "R$" +
            "\n"
        );
        
    }
}