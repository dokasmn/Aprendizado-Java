package Exercicio02;

public class Principal {
    public static void main(String[] args) {
        int i = 0;
        int escolha = 0;
        int opcao = 0;

        Estoque e = new Estoque();
        do{
            opcao = EntradaSaida.escolherOpcao();
            switch (opcao) {
                case 1:
                    escolha = EntradaSaida.escolherQuantidadeCadastro();
                    for (i=0;  i<escolha; i++){
                        Peca novaPeca = new Peca();
                        novaPeca.descricao = EntradaSaida.cadastrarPeca("a descricao");
                        novaPeca.preco = Double.parseDouble(EntradaSaida.cadastrarPeca("o preço"));
                        novaPeca.cor = EntradaSaida.cadastrarPeca("a cor");
                        novaPeca.altura = Double.parseDouble(EntradaSaida.cadastrarPeca("a altura"));
                        novaPeca.largura = Double.parseDouble(EntradaSaida.cadastrarPeca("a largura"));
                        System.out.println(novaPeca.largura);

                        e.adicionarPeca(novaPeca);
                    }
                    break;
                case 2 :
                    String pecaRemovida = EntradaSaida.selecionarRemocao();
                    e.removerPeca(pecaRemovida);
                break;
                case 3:
                    EntradaSaida.mostrarPecas(e.listarPecas());
                break;
            
            }
        }while(opcao != 4);
    }
}
