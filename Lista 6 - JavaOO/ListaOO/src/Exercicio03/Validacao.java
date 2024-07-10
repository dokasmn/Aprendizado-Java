package Exercicio03;

public class Validacao {

    public static double validarECadastrarNota(double valorNota) {
        while (valorNota > 10 || valorNota < 0) {
            valorNota = Double.parseDouble(EntradaSaida.cadastrarDado("o valor correto da nota"));
        }
        return valorNota;
    }   
}
