package Exercicio02;

import javax.swing.JOptionPane;

public class EntradaSaida {

    public static int escolherOpcao(){
        return Integer.parseInt(JOptionPane.showInputDialog(
            "Digite a opção desejada: " +
            "\n[1] - Cadastrar peça" +
            "\n[2] - Remover peça" +
            "\n[3] - Ver peças" +
            "\n[4] - Sair"));
    }

    public static String cadastrarPeca(String dado){
        return JOptionPane.showInputDialog("Informe " + dado + " da peça:");
    }

    public static String selecionarRemocao() {
        return JOptionPane.showInputDialog("Informe a descrição da peça a ser removida do estoque: ");
    }

    public static void mostrarPecas(String msg){
        JOptionPane.showMessageDialog(null,msg);
    }

	public static int escolherQuantidadeCadastro() {
		return Integer.parseInt(JOptionPane.showInputDialog("Digite o número de peças que serão cadastradas"));
	}
     
}
