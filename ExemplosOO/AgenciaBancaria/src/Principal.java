
public class Principal {
    public static void main(String[] args) {

        int opcao;
        Banco oBanco = new Banco();//porque queremos apenas um objeto banco

        do{
            
        opcao = EntradaSaida.escolherOpcaoMenu();
        int agencia=0;
        int numero = 0;
        
        switch (opcao) {
            case 1:
                Conta oConta = new Conta();
                oConta.setAgencia(EntradaSaida.solicitarDadoConta(" a agência "));//sempre que presisamos de um novo objeto conta


                oConta.setNumero(EntradaSaida.solicitarDadoConta(" o número "));

                Pessoa oPessoa = new Pessoa();
                oPessoa.setCpf(EntradaSaida.solicitarCpf());
                oPessoa.setNome(EntradaSaida.solicitarDadoTitular(" o nome completo "));
                oPessoa.setDataDeNascimento(EntradaSaida.solicitarDadoTitular(" a data de nascimento "));

                oConta.setTitular(oPessoa);

                oBanco.adicionarConta(oConta);
                break;
            case 2 :
                if (!oBanco.getListaDeContas().isEmpty()){
                    EntradaSaida.mostrarContas(oBanco.listarContas());
                }
                else{
                    EntradaSaida.mostrarAlerta("Nenhuma conta foi cadastrada até o momento");
                }
                break;
            case 3:
                agencia = EntradaSaida.solicitarDadoConta(" a agência ");
                numero = EntradaSaida.solicitarDadoConta(" o número da conta ");
                Conta novaConta = oBanco.encontrarConta(agencia, numero);

                if (novaConta!=null){
                    novaConta.depositar(EntradaSaida.solicitarValorOperacao(" depósito"));
                }
                else{
                    EntradaSaida.mostrarAlerta("A agência e o número digitados não existem: ");
                }
                break;
            case 4:
                agencia = EntradaSaida.solicitarDadoConta("A agência");
                numero = EntradaSaida.solicitarDadoConta("O número da conta");
                Conta saque = oBanco.encontrarConta(agencia, numero);

                if (saque!=null){
                    saque.sacar(EntradaSaida.solicitarValorOperacao("Saque"));
                }
                else{
                    EntradaSaida.mostrarAlerta("A agência e o número digitados não existem: ");
                }
                break;

        }
        }while (opcao != 5);



    }
}
