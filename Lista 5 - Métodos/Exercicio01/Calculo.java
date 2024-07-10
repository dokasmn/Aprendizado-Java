package Exercicio01;

import javax.swing.JOptionPane;

public class Calculo{
        public static double calcularMediaAritimetica(double soma,int fatores){
            return soma/fatores;
        }
        public static double calcularMediaPonderada(double[] notas,int numeroDePesos){
            double[] pesos = new double[numeroDePesos];
            int calculo = 0;
            int pesoDaDivisao = 0;
            for (int i = 0; i < numeroDePesos; i++) {
                pesos[i] = EntradaSaida.pedirPesos(i + 1);
                Validacao.validarPesos(pesos[i]);

                while (Validacao.validarPesos(pesos[i])) {
                    JOptionPane.showMessageDialog(null, "Valor para peso inválido: " + "\n Tente novamente: ");
                    pesos[i] = EntradaSaida.pedirPesos(i + 1);
                }

                pesoDaDivisao += pesos[i];
                calculo += notas[i] * pesos[i];
            }
            calculo = calculo/pesoDaDivisao;
            return calculo;
        }
    }