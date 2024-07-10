import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) {
        int meuInteiro = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro: "));
        int antecessor = (meuInteiro - 1);
        int sucessor = (meuInteiro + 1);

        JOptionPane.showMessageDialog(null,
            "\n" +
            "\n Seu número é: " + meuInteiro + 
            "\n O sucessor do seu número é: " + sucessor +
            "\n O antecessor do seu número é: " + antecessor +
            "\n"
        );
    }
}