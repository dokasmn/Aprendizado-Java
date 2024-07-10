import java.util.ArrayList;

public class Banco {
    
    private ArrayList<Conta> listaDeContas = new ArrayList<Conta>();
    
    public ArrayList<Conta> getListaDeContas() {
        return listaDeContas;
    }

    public void setListaDeContas(ArrayList<Conta> listaDeContas) {
        this.listaDeContas = listaDeContas;
    }

    public void adicionarConta(Conta c){
        this.listaDeContas.add(c);
    }

    public String listarContas(){
        String contas="\n Os dados da conta são: ";

        for (Conta conta : this.listaDeContas) {

            contas += 
            "\n Agência: " + conta.getAgencia() + 
            "\n Número da conta:" + conta.getAgencia() +
            "\n Saldo: "+ conta.getSaldo() +
            "\n Nome do titular: " + conta.getTitular().getNome() +
            "\n CPF do titular: "+ conta.getTitular().getCpf() +
            "\n Data de nascimento do titular: "+ conta.getTitular().getDataDeNascimento();

        }

        return contas;
    }

    public Conta encontrarConta(int agencia, int numero) {
        for (Conta conta : this.listaDeContas) {
            if (conta.getAgencia()==agencia && conta.getNumero()==numero) {
                return conta;
            }
        }
        return null;
    }
}