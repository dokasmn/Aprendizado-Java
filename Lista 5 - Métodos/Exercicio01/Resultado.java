package Exercicio01;
import java.text.DecimalFormat;

public class Resultado {
        public static String mostrarResultado(String tipoMedia, double calculo){
            DecimalFormat valorFinal = new DecimalFormat("#.0");
            String mediaFinal = valorFinal.format(calculo);
            String resultado = "";

            if (calculo > 0 && calculo < 4.0) {
                resultado = " Média: "+mediaFinal+"\n Segundo o cáculo da média "+tipoMedia+" o aluno está reprovado";
            }
            else if (calculo > 4.0 && calculo < 7.0){
                resultado = " Média: "+mediaFinal+"\n Segundo o cáculo da média "+tipoMedia+" o aluno está em exame";
            }
            else{
                resultado = " Média:"+mediaFinal+"\n Segundo o cáculo da média "+tipoMedia+" o aluno está está aprovado";
            }
            return resultado;
        }
    }
