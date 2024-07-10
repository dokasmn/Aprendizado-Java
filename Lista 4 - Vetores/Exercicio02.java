import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {
        int[] vet = new int[5];
        int maior = vet[0];
        int menor = vet[0];

        for (int index = 0; index < 5; index++) {
            vet[index] = Integer.parseInt(JOptionPane.showInputDialog(index + "Preencha um vetor: "));
            maior = Math.max(vet[index], maior);
            menor = Math.min(vet[index], menor);
        }

        String resultados = "O maior número do vetor é: " + maior +
        "\n O menor número do vetor é: " + menor;

        JOptionPane.showMessageDialog(null,resultados);
    }
}
