package Exercicio01;

import javax.swing.JOptionPane;

public class Principal {
        public static void main(String[] args) {

            int numeroDeNotas = EntradaSaida.perguntarTotalNotas();
            double[] notas = new double[numeroDeNotas];
            boolean notaInvalida = false;
            double todasNotas = 0;

            for (int i = 0; i < numeroDeNotas; i++) {
                notas[i] = EntradaSaida.perguntarNota((i + 1));               
                while(Validacao.validarNota(notas[i])==true){
                    notas[i] = EntradaSaida.perguntarNota((i + 1));               
                }
                todasNotas += notas[i];
            }

            int opcao = EntradaSaida.perguntarOpcao();
            boolean opcaoInvalida = false;
            String media = "";
            double calculo = 0;
            do {
                switch (opcao) {
                    case 1:
                        //media aritimética
                        media += "Aritimética";
                        calculo = Calculo.calcularMediaAritimetica(todasNotas,numeroDeNotas);
                        break;
                    case 2:
                        //média ponderada
                        media += "Ponderada";
                        calculo = Calculo.calcularMediaPonderada(notas,numeroDeNotas);
                        break;
                
                    default:
                        opcaoInvalida = true;
                        break;
                }
            } while (opcaoInvalida == true);

            Resultado.mostrarResultado(media,calculo);
        }
    }
