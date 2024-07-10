import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {
        int contadorIdade;
        double contadorAltura;
        int contadorPeso;
        int idade = 0;
        int altura = 0;
        int peso = 0;


        for(int i = 0;i < 10; ++i){
            contadorIdade = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + " Digite sua idade: "));
            if (contadorIdade >= 50){
                idade += 1;
            }
            contadorAltura = Double.parseDouble(JOptionPane.showInputDialog((i + 1) + " Digite sua altura: "));
            if (contadorAltura >= 1.60){
                altura += 1;
            }
            contadorPeso = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + " Digite seu peso: "));
            if (contadorPeso >= 80){
                peso += 1;
            }
        }
        String resultados =
            " As pessoas com mais de 60 anos são: " + idade +
            "\n As pessoas com mais de 1.60 m de altura são: " + altura +
            "\n As pessoas que pesam mais de 80 kg são: " + peso;
        JOptionPane.showMessageDialog(null,resultados);
    }
}
