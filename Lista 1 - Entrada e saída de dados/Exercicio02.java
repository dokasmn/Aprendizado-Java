import javax.swing.JOptionPane;

public class Exercicio02{
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número: "));
        int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro número: "));

        if (y == 0) {
            while (true) {
            // este laço serve para printar os resultados possíveis caso o segundo número seja igual a zero
                JOptionPane.showMessageDialog(null, "O segundo número não pode ser igual a zero.");

                Double p = new Double(Math.pow(x,y));
                int novoP = p.intValue();

                JOptionPane.showMessageDialog(null,
                "\n Resultados:" +
                "\n" + 
                "\n A Soma dos dois números: " + (x + y) + 
                "\n A subtração dos dois números: " + (x - y) +
                "\n A multiplicação dos dois números: " + (x * y) +
                "\n O primeiro número elevado ao segundo número:" + novoP +
                "\n"
                );
                String opcao = JOptionPane.showInputDialog(null, "Quer digitar outro número? sim/não ");

                // aqui o código executará novamente o processo de obtenção de dados e calculo caso a opção acima seja sim
                switch (opcao) {
                    case "não":
                        break;
                    case "sim":
                        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro valor para o primeiro número: "));
                        y = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro valor para o segundo número: "));
                        p = new Double(Math.pow(x,y));
                        novoP = p.intValue();

                        JOptionPane.showMessageDialog(null,
                        "\n" + 
                        "\n A Soma dos dois números: " + (x + y) + 
                        "\n A subtração dos dois números: " + (x - y) +
                        "\n A multiplicação dos dois números: " + (x * y) +
                        "\n A divisão do primeiro pelo segundo: " + (x / y) +
                        "\n O primeiro número elevado ao segundo número:" + novoP +
                        "\n O resto da divisão do primeiro pelo segundo: " + (x % y) +
                        "\n"
                        );
                        break;
                    default:
                        break;
                    }
                break;
            }
        }

        else{
            Double p = new Double(Math.pow(x,y));
            int novoP = p.intValue();

            JOptionPane.showMessageDialog(null,
                "\n" + 
                "\n A Soma dos dois números: " + (x + y) + 
                "\n A subtração dos dois números: " + (x - y) +
                "\n A multiplicação dos dois números: " + (x * y) +
                "\n A divisão do primeiro pelo segundo: " + (x / y) +
                "\n O primeiro número elevado ao segundo número:" + novoP +
                "\n O resto da divisão do primeiro pelo segundo: " + (x % y) +
                "\n"
                );
        }
    }
}