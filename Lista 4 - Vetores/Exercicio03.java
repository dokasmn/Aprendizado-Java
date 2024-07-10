import javax.swing.JOptionPane;

public class Exercicio03 {
    public static void main(String[] args) {
        double[] vet = new double[10];
        String resultados = "";
        double soma = 0;

        for (int i = 0; i < 10; i++) {
            vet[i] = Double.parseDouble(JOptionPane.showInputDialog((i + 1) + " Preencha um vetor: "));
            soma += vet[i];
            resultados += "\n" + vet[i] + ";";
        }
        
        double media = soma/10;
        resultados += "\n A soma dos valore é Engual a: " + soma + ";" +
        "\n A média dos valores é Engual a: " + media + ".";
        JOptionPane.showMessageDialog(null,resultados);
    }
}
