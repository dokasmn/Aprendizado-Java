import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {
        int minhaHora = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor em horas: "));
        int meusMinutos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor em minutos: "));
        int meusSegundos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor em segundos: "));

        int horarioEmSegundos = (minhaHora * 3600) + (meusMinutos * 60) + (meusSegundos);
      

        JOptionPane.showMessageDialog(null,
            "\n" +
            "o horário descrito, em segundos, fica segundos: " + horarioEmSegundos + " segundos" +
            "\n"
        );
    }
}