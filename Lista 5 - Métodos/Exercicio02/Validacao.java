package Exercicio02;

public class Validacao {
    public static boolean validarSalario(double salarioBruto){
        if (salarioBruto < 500 || salarioBruto > 30000) {
            return true;
        }
        else{
            return false;
        }
    }
}
