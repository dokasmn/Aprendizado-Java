import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) {
        String[] disciplinas = new String[4];
        String[] cargaHoraria = new String[4];
        String[] professor = new String[4];
        String pesquisa = "";
        String resultados = "";
        

        for (int i = 0; i < 4; i++) {
            disciplinas[i] = JOptionPane.showInputDialog((i + 1) + " Informe uma disciplina: ");
            professor[i] = JOptionPane.showInputDialog((i + 1) + " O nome do professor: ");
            cargaHoraria[i] = JOptionPane.showInputDialog((i + 1) + " Informe a carga horária da disciplina: ");
        }

        pesquisa = JOptionPane.showInputDialog(" pesquise por uma disciplina: ");

        for (int i = 0; i < 4; i++) {
            if (pesquisa.equals(disciplinas[i]) == true) {
                resultados = " Disciplina: " + disciplinas[i] +
                "\n Professor: " + professor[i] +
                "\n Carga Horaria: " + cargaHoraria[i];
                break;
            }
            else if(i == 3){
                resultados = "Disciplina não encontrada";
            }
            
        }
        JOptionPane.showMessageDialog(null,resultados);
    }
}
