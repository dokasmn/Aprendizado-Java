import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;

        int opcao = 0;

        for (int i = 0; i < 10; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + " Digite um número: "));
            if (numeros[i] % 2 == 0){
                pares += 1;
            }
            if (numeros[i] % 2 != 0){
                impares += 1;
            }
            if (numeros[i] < 0){
                positivos += 1;
            }
            if (numeros[i] > 0){
                negativos += 1;
            }
        }
        while (opcao > 5 || opcao <1){
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                " O que você deseja saber: " +
                "\n [1] - Quantidade de números pares informados" +
                "\n [2] - Quantidade de números ímpares informados" +
                "\n [3] - Quantidade de números negativos informados" +
                "\n [4] - Quantidade de números positivos informados" +
                "\n [5] - Sair" +
                "\n Informe a o número da sua opção: "
            ));
        }

        String resultados = " A quantidade de números é: ";

        switch (opcao) {
            case 1:
                resultados += pares;
                break;
            case 2:
                resultados += impares;
                break;
            case 3:
                resultados += negativos;
                break;
            case 4:
                resultados += positivos;
                break;
            case 5:
                System.exit(0);
        }
        JOptionPane.showMessageDialog(null,resultados);
        
    }
}