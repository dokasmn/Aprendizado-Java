package Exercicio01;
    public class Validacao{
        public static boolean validarNota(double nota){
            if (nota <= 0 || nota > 10.0){
                return true;
            }
            else{
                return false;
            }
        }
        public static boolean validarPesos(double peso){
            if (peso < 0) {
                return true;
            }
            else{
                return false;
            }
        }
    }