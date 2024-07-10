package Exercicio03;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javax.swing.JOptionPane;

public class Principal {
        public static void main(String[] args) {
            double salarioAtual = EntradaSaida.perguntarSalario();
            boolean emprestimoInvalido = false;
            double valorDoEmprestimo = 0;

            do {
                valorDoEmprestimo = EntradaSaida.perguntarEmprestimo();
                emprestimoInvalido = Validacao.validarEmprestimo(valorDoEmprestimo);
            } while (emprestimoInvalido == true);

            int prazo = 24;
            double juros = 0.35;
            double valorTotal = Calculo.calcularValorTotal(valorDoEmprestimo,juros);
            double parcelas = Calculo.calcularParcelas(valorTotal,prazo);
            boolean valorInvalido = Validacao.validarValor(salarioAtual,parcelas);
            String resultado = "";

            DecimalFormat valorFinal = new DecimalFormat("#,###.00");
            // String emprestimo =
            String emprestimo = valorFinal.format(valorDoEmprestimo);
            String parcela = valorFinal.format(parcelas);

            if (valorInvalido != true) { 
                resultado += "Empréstimo concedido" +
                "\n valor Total: " + emprestimo + " R$" +
                "\n valor de cada parcela: " + parcela + " R$";
            }
            else{
                resultado += "Empréstimo não concedido";
            }
            JOptionPane.showMessageDialog(null, resultado);
        }
    }
