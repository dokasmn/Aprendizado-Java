package Exercicio02;

public class Calculo {
    public static double calcularInss(double salarioBruto){
        return salarioBruto * 0.20;
    } 
    public static double calcularIrpf(double salarioBruuto){
        return salarioBruuto * 0.10;
    }
    public static double calcularPlano(double salarioBruto){
        return salarioBruto * 0.05;
    }
    public static double calcularDescontos(double inss,double irpf,double planoDeSaude){
        return inss + irpf + planoDeSaude;
    }
    public static double calcularAcrescimo(double salarioBruto,double horasExtras){
        return ((salarioBruto/160) * (horasExtras * 0.5));
    }
    public static double calcularSalarioLiquido(double salarioBruto,double acrescimo,double descontos){
        return salarioBruto - descontos + acrescimo;
    }
}
