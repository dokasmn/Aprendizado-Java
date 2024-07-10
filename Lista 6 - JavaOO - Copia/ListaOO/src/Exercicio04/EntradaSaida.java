package Exercicio04;

import javax.swing.JOptionPane;

public class EntradaSaida {

    public static int escolherOpcao(/*String msg1,String msg2,String msg3*/String...elementos) { //pode haver um número indefinido de parâmetros
        String menu = "Digite a opção desejada: ";
        int cont = 1;
        for(String valor : elementos) {
            menu += "\n[" + cont + "] -" + valor;
            cont += 1;
        }
        menu +=  "\n["+ cont +"] - Sair";
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }

    public static String cadastrarDado(String dado) {
        return JOptionPane.showInputDialog(" Informe " + dado + ":");
    }

    public static int escolherQuantidadeCadastro(String dado) {
		return Integer.parseInt(JOptionPane.showInputDialog("Digite o número de " + dado + " que serão cadastrados"));
	}


    public static void mostrar(String msg) {
        JOptionPane.showMessageDialog(null,msg);
    }
    
}
