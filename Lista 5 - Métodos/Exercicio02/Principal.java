package Exercicio02;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        boolean salarioInvalido = false;
        double salarioBruto = 0;
        do {
            salarioBruto = EntradaSaida.pedirSalario();
            salarioInvalido = Validacao.validarSalario(salarioBruto);
        } while (salarioInvalido == true);

        double inss = Calculo.calcularInss(salarioBruto);
        double irpf = Calculo.calcularIrpf(salarioBruto);
        double planoDeSaude = Calculo.calcularPlano(salarioBruto);
        double descontos = Calculo.calcularDescontos(inss,irpf,planoDeSaude);
        double horasExtras = EntradaSaida.pedirHoraExtras();
        double acrescimo = Calculo.calcularAcrescimo(salarioBruto,horasExtras);
        double salarioLiquido = Calculo.calcularSalarioLiquido(salarioBruto,acrescimo,descontos);

        DecimalFormat valorFinal = new DecimalFormat("#,###.00");
            // String emprestimo =
            String folhaDePagamento = valorFinal.format(salarioLiquido);
            

        JOptionPane.showMessageDialog(null, "O valor do salário liquido é de: " + folhaDePagamento + " R$");
    }
}
