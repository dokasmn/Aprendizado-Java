import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(" Digite um número limite para uma sequência: "));
        int incremento = Integer.parseInt(JOptionPane.showInputDialog("Digite um incremento para a sequência: "));
        String resultados = "";
        int i = 0;
        int cont = 0;
    /**Rever - fazer com FOR */
        if (numero % incremento == 0){
            while (cont < 10) {
                if (numero > incremento) {
                    i = i + incremento;
                }
                else {
                    if (incremento > 0) {
                        incremento = incremento * (-1);
                    }
                     i = i + incremento;
                }
                resultados += "\n" + i;
                cont += 1;
            }
        }
        else{
            JOptionPane.showMessageDialog(null," Número escolhido para o incremento inválido");
        }

        JOptionPane.showMessageDialog(null,"A sequência de números formada é: " + resultados);
    }
}
