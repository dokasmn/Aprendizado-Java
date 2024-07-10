import java.util.Random;

import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[] nums1 = new int[10];
        int[] nums2 = new int[10];
        String resultadosIniciais = "";
        

        for (int i = 0; i < 10; i++) {
            nums1[i] = aleatorio.nextInt(100) + 1;
            nums2[i] = aleatorio.nextInt(100) + 1;
            resultadosIniciais += "\n" + nums1[i] + ";" + " --------------- " + nums2[i] + ";" ;
        }

        int[] soma = new int[10];
        String resultadosFinais = "";
        for (int i = 0; i < soma.length; i++) {
            soma[i] = nums1[i] + nums2[i];
            resultadosFinais += "\n" + soma[i] + ";";
        }

        JOptionPane.showMessageDialog(null,"Vetores iniciais: \n" + "1º " + " --------------- " + "2º " + "\n" + resultadosIniciais);
        JOptionPane.showMessageDialog(null,"Vetor da soma dos elementos dos vetores anteriores: " + resultadosFinais);




    }
}
