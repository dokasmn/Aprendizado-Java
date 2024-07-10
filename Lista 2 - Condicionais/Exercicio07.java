import javax.swing.JOptionPane;

public class Exercicio07 {
    public static void main(String[] args) {

        String resposta1 = "";
        String questao1 = "";

        while (true) {
            questao1 =JOptionPane.showInputDialog(
                " Quem é o cara mais bonito do mundo? " +
                "\n [A] - Cauan" +
                "\n [B] - Outra pessoa" +
                "\n Informe a letra da sua opção: "
            );
            resposta1 = questao1.toUpperCase().trim();
//rever, usar o default do switch case para tratar resposta inválida
            if (resposta1.equals("A") == true) {
                break;
            }
            else if (resposta1.equals("B") == true) {
                break;
            }
            else {
              JOptionPane.showMessageDialog(null,"Resposta inválida");  
            }
            
        }

        String resultado1 = "";

        switch (resposta1) {
            case "A":
                resultado1 += "Você acertou, pode retirar o seu bônus na Shostners and Shostners";
                break;
            case "B":
                resultado1 += "Você não acertou, mas tente novamente numa próxima”";
                break;  
            }
            JOptionPane.showMessageDialog(null,resultado1);

        String questao2 = "";

        String resposta2 = "";

        while (true) {
            questao2 = JOptionPane.showInputDialog(
                " Quanto dinheiros eu tenho na conta? " +
                "\n [A] - Todos eles" +
                "\n [B] - Nada" +
                "\n Informe a letra da sua opção: "
            );
            resposta2 = questao2.toUpperCase().trim();
            System.out.println(resposta2);

            if (resposta2.equals("A") == true) {
                break;
            }
            else if (resposta2.equals("B") == true) {
                break;
            }
            else {
              JOptionPane.showMessageDialog(null,"Resposta inválida");  
            }
            
        }

        String resultado2 ="";

        switch (resposta2) {
            case "A":
                resultado2 += "Você não acertou, mas tente novamente numa próxima";
                break;
            case "B":
                resultado2 += "Você acertou, pode retirar o seu bônus na Shostners and Shostners";
                break;  
            default:

               questao2 = JOptionPane.showInputDialog(
                " Quanto dinheiros eu tenho na conta? " +
                "\n [A] - Todos eles" +
                "\n [B] - Nada" +
                "\n Informe a letra da sua opção: "
                );
                break;
            }
            JOptionPane.showMessageDialog(null,resultado2); 
    }
}
