import javax.swing.JOptionPane;

public class Exercicio01{
    public static void main(String[] args){
        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        String sobrenome = JOptionPane.showInputDialog("Digite o seu sobrenome: ");
        String dataDeNascimento = JOptionPane.showInputDialog("Digite sua data de nascimento: ");
        double pretensaoSalarial = Double.parseDouble(JOptionPane.showInputDialog("Digite o sua pretensão salarial: "));
        String grauDeInstrucao = JOptionPane.showInputDialog("Digite sua formação acadêmica: ");
        String cargoPretendido = JOptionPane.showInputDialog("Digite o cargo pretendido: ");
        String cnh = JOptionPane.showInputDialog("Você possui CNH do tipo B? Sim/Não ");
        String numeroCnh;

        switch (cnh) {
            case "Sim":
                numeroCnh = JOptionPane.showInputDialog("Qual o número da sua cnh? ");
                JOptionPane.showMessageDialog(null,
                    " Cadastro confirmado" +
                    "\n" + 
                    "\n  Nome: " + nome + 
                    "\n Sobrenome: " + sobrenome +
                    "\n Data de nascimento: " + dataDeNascimento +
                    "\n Pretensão salarial: " + pretensaoSalarial +
                    "\n Formação acadêmica: " + grauDeInstrucao +
                    "\n Cargo pretendido: " + cargoPretendido +
                    "\n Possui CNH do tipo B: " + cnh +
                    "\n Número da CNH :" + numeroCnh +
                    "\n"
                );
                break;
        
            case "Não":
                JOptionPane.showMessageDialog(null,
                    " Cadastro confirmado" +
                    "\n" + 
                    "\n  Nome: " + nome + 
                    "\n Sobrenome: " + sobrenome +
                    "\n Data de nascimento: " + dataDeNascimento +
                    "\n Pretensão salarial: " + pretensaoSalarial +
                    "\n Formação acadêmica: " + grauDeInstrucao +
                    "\n  Cargo pretendido: " + cargoPretendido +
                    "\n  Possui CNH do tipo B: " + cnh +
                    "\n"
                );
                break;
            }
    }
}
