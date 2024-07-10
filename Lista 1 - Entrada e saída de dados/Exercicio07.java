import javax.swing.JOptionPane;

public class Exercicio07{
    public static void main(String[] args){
        String nomeDoVendedor = JOptionPane.showInputDialog(null, "Digite o nome do vendedor: ");
        String mes = JOptionPane.showInputDialog(null, "Digite o nome do respectivo mês: ");
        int carrosVendidos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número de carros vendidos "));
        double totalDeVendas = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor total de vendas do respectivo mês: "));
        double salario = (1500 + (350 * carrosVendidos) +(0.001 * totalDeVendas));

        JOptionPane.showMessageDialog(null, 
            nomeDoVendedor +
            "\n" +
            "\n Mês: " + mes +
            "\n Número de carros vendidos: " + carrosVendidos +
            "\n Valor total de vendas do mês: " + totalDeVendas + "R$" +
            "\n Salário: " + salario + " R$" +
            "\n"
        );

    }
}