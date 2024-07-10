
package Exercicio03;

import javax.swing.JOptionPane;
public class EntradaSaida {

    public static int escolherOpcao(String msg1,String msg2,String msg3){
        return Integer.parseInt(JOptionPane.showInputDialog(
            "Digite a opção desejada: " +
            "\n[1] -" + msg1 +
            "\n[2] -" + msg2 +
            "\n[3] -" + msg3 +
            "\n[4] - Sair"));
    }

    public static int escolherQuantidadeCadastro(String dado) {
		return Integer.parseInt(JOptionPane.showInputDialog("Digite o número de " + dado + " que serão cadastrados"));
	}

    public static String cadastrarDado(String dado){
        return JOptionPane.showInputDialog("Informe " + dado + ":");
    }

    public static void mostrarDados(String msg){
        JOptionPane.showMessageDialog(null,msg);
    }

    public static String pergutarAluno() {
        return JOptionPane.showInputDialog("Informe o nome do aluno");
    }

    public static String perguntarNome() {
        return JOptionPane.showInputDialog("Qual o novo nome? ");
    }

    public static void mostrarAlerta(String msg) {
        JOptionPane.showMessageDialog(null,msg);
    }

}
