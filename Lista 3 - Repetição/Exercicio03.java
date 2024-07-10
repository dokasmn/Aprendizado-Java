import javax.swing.JOptionPane;

public class Exercicio03 {
    public static void main(String[] args) {
        int avaliacao = 0;
        double otimo = 0;
        double bom = 0;
        double ruim = 0;

        int i = 0;
        int opcao = 0;
        int pessoas = 0;

        do {
            avaliacao = 0;
            while (avaliacao > 3 || avaliacao < 1){
                avaliacao = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + 
                " Avalie o filme 'As marvels' como: " +
                "\n [1] - Ótimo" +
                "\n [2] - Bom" +
                "\n [3] - Ruim"));

                switch (avaliacao) {
                    case 1:
                        otimo += 1;
                        break;
                    case 2:
                        bom += 1;
                        break;
                    case 3:
                        ruim += 1;
                        break;
                }
            }
            pessoas += 1;

            opcao = Integer.parseInt(JOptionPane.showInputDialog(
            " Digite uma opção: " +
            "\n [1] - Informar mais uma avaliação" +
            "\n [2] - Sair"));

        } while (opcao != 2);

        String media = "";
        Double calculo = ((otimo*3.0) + (bom*2.0) + (ruim*1.0))/pessoas;
        if (calculo>=0 && calculo<=1) {
            media = "Ruim";
        }
        else if(calculo>1 && calculo<=2){
            media = "Bom";
        }
        else if(calculo>2 && calculo<=3.0){
            media = "Ótimo";
        }

        otimo = (otimo / pessoas) * 100;
        bom = (bom / pessoas) * 100;
        ruim = (ruim / pessoas) * 100;
        

        String resultados = "A porcentagem de pessoas que avaliaram o filme 'As Marvels' como:" +
        "\n [1] - Ótimo: " + otimo + "%" +
        "\n [2] - Bom: " + bom + "%" +
        "\n [3] - Ruim: " + ruim  + "%" +
        "\n O número de pessoas que responderam a pesquisa foi de: " + pessoas +
        "\n A média das respostas foi: " + media;
        
        JOptionPane.showMessageDialog(null,resultados);
    }
}
