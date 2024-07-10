import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) {
        String Destino = JOptionPane.showInputDialog(
        " Informe o seu destino dentre as opções a seguir: " +
        "\n [ ] - Maceió" +
        "\n [ ] - Porto de galinhas" +
        "\n Sua opção: "
        );

        int opcao = Integer.parseInt(JOptionPane.showInputDialog(
        " Com almoço/janta incluso? " +
        "\n [1] - Sim" +
        "\n [2] - Não" +
        "\n Informe o número da sua opção: "
        ));

        double calculo = 3000;

        String resultado = "\n O valor da sua opção sairá por: ";

        switch (Destino) {
            case "Maceió":
                if (opcao == 1) {
                    calculo += calculo;
                }
                else{
                    calculo += calculo * 0.85;
                }
                break;
            case "Porto de galinhas":
                if (opcao == 1) {
                    calculo += calculo * 0.60;
                }
                else{
                    calculo += calculo * 0.45;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opção inválida");
                Destino = JOptionPane.showInputDialog(
                " Informe o seu destino dentre as opções a seguir: " +
                "\n Maceió" +
                "\n Porto de galinhas" +
                "\n Sua opção: "
                );
                break;
        }
        resultado += calculo + " R$";
       JOptionPane.showMessageDialog(null,resultado);
    }
}
