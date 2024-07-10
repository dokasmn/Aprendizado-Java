import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {
        double saldo;
        String opcao = "";
        int negativos = 0;
        int pessoas = 0;
        String resultados = "";
        do {
            saldo = Double.parseDouble(JOptionPane.showInputDialog(" Informe o seu saldo: "));
            if (saldo < 0) {
                negativos += 1;
            }
            pessoas += 1;
            opcao = JOptionPane.showInputDialog(
            "Deseja informar o saldo de mais uma pessoa?" +
            "\n S - sim" +
            "\n N - não"
            );
        } while (opcao.equals("N") == false);

        if (negativos > pessoas / 2) {
            resultados = "Risco ao banco!";
        }
        else{
            resultados = "Nenhum risco!";
        }
        JOptionPane.showMessageDialog(null,resultados);
    }
}
