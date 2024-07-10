public class Principal{
    public static void main(String[] args) {
        // Pedir os números
        double num1 = EntradaSaida.pedirNumero("1º");
        double num2 = EntradaSaida.pedirNumero("2º");
        double resultado = 0;
        int opcao = 0;
        boolean opcaoInvalida = false;
       
        // Mostrar o valor do cálculo
        opcao = EntradaSaida.pedirOperacao();

        switch (opcao) {
            case 1:
                resultado = Calculo.somar(num1, num2);
                break;
            case 2:
                resultado = Calculo.subtrair(num1, num2);
                break;
            case 3:
                resultado = Calculo.multiplicar(num1, num2);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = Calculo.dividir(num1, num2);
                }
                else{
                    EntradaSaida.mostrarMsg(" A divisão não pode ser calculada ");
                    opcaoInvalida = true;
                }
                break;
            default:
                EntradaSaida.mostrarMsg(" Opção inválida ");
                opcaoInvalida = true;
                break;
        }
        if(opcaoInvalida == false){
            EntradaSaida.mostrarResultado(num1, num2, opcao, resultado);
        }
    }
}