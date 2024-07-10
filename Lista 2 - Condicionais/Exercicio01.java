import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog(" Digite sua idade: "));
        String resultado = "\n A Sua faixa etária indica que você é: ";
        while (idade<0) {
            idade = Integer.parseInt(JOptionPane.showInputDialog(" Digite sua idade: "));
        }
        
        if (idade>=0 && idade<14){
            resultado += "Criança";   
        }
        else if (idade>14 && idade<=17){
            resultado += "Adolescente";   
        }
        else if (idade>17 && idade<=30){
            resultado += "Adulto jovem";   
        }
        else {
            resultado += "Adulto";   
        }
        JOptionPane.showMessageDialog(null,resultado);
    }
}
