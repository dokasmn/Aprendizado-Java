import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {


    public static int escolherOpcao(String[] elementos) { 
        String msg = "Insira a opção ";
        int escolha = 0;       
        JComboBox<String> comboOpcao = new JComboBox<String>(elementos);
        Object[] exibirMsg = {msg, comboOpcao};
        JOptionPane.showMessageDialog(null, exibirMsg);
        int value = comboOpcao.getSelectedIndex();

        for (int i = 0; i < elementos.length; i++) {
            if (value == i){
                escolha = i+1;
            }
        }
        return escolha;
    }

    public static String escolherNome(String[] elementos){
        String msg = "Insira a opção";
        JComboBox<String> comboOpcao = new JComboBox<String>(elementos);
        Object[] exibirMsg = {msg, comboOpcao};
        JOptionPane.showMessageDialog(null, exibirMsg);
        String opcao = comboOpcao.getSelectedItem().toString();

        return opcao;
    }

    // public static void teste(){
    //     String msg = "Escolha o que gostaria de editar: ";
    //     String[] opcao = {"Nome", "Tipo", "Preço", "Tamanho", "Marca", "Cor"};
    //     JComboBox comboOpcao = new JComboBox<>(opcao);
    //     Object[] exibirMsg = {msg, comboOpcao};
    //     JOptionPane.showMessageDialog(null, exibirMsg);
    // }


    public static String cadastrarDado(String dado) {
        return JOptionPane.showInputDialog("Informe " + dado);
    }

    public static int escolherQuantidadeCadastro(String dado) {
		return Integer.parseInt(JOptionPane.showInputDialog("Digite o número de " + dado + " que serão cadastrados"));
	}

    public static void mostrar(String msg) {
        JOptionPane.showMessageDialog(null,msg);
    }
}