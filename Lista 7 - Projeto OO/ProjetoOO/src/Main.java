public class Main {

    public static void main(String[] args) {
        Loja loja = new Loja();
        int opcao = 0;
        
        do {
            String[] opcoes = {"Cadastrar produto","Consultar produto","Ver marcas","Fechar o programa"};
            if (opcao != 4){
                opcao = EntradaSaida.escolherOpcao(opcoes);
            }

            switch (opcao) {
                case 1:
                    Produto.cadastrarProduto(loja);
                    break;
                case 2:
                    int escolha = 0;
                    do{
                        String[] opcoes2 = {"Ver todos os produtos","Ver produtos pela marca","Ver um produto","Ver produtos com baixo estoque","Sair"};
                        if (escolha != 5){
                            escolha = EntradaSaida.escolherOpcao(opcoes2);
                        }
                        switch (escolha) {
                            case 1:
                                EntradaSaida.mostrar(loja.verProdutos(loja));
                                break;
                            case 2:
                                String marcaEscolhida = EntradaSaida.cadastrarDado("a marca");
                                EntradaSaida.mostrar(loja.verPelaMarca(marcaEscolhida,loja));
                                break;
                            case 3:
                                String codigoEscolhido = "";
                                System.out.println(codigoEscolhido);
                                codigoEscolhido = EntradaSaida.cadastrarDado("o código do produto");
                                EntradaSaida.mostrar(loja.verUmProduto(codigoEscolhido));
                                String produtoEscolhido = loja.retornarNomeProduto(codigoEscolhido);
                                String[] opcoes3 = {"Editar dados", "Excluir produto", "Dar baixa","Atualizar Entrada","Sair"};
                                do{
                                    if (escolha != 5){
                                        escolha = EntradaSaida.escolherOpcao(opcoes3);
                                    }
                                    switch (escolha) {
                                        case 1:
                                            loja.editarProdutos(produtoEscolhido,0);
                                            break;

                                        case 2:
                                            // loja.excluirProdutosEmEstoque(produtoEscolhido);
                                            loja.excluirProdutos(produtoEscolhido);
                                            break;

                                        case 3: 
                                            loja.atualizarBaixa(produtoEscolhido);
                                            break;
                                        case 4:
                                            loja.atualizarEntrada(produtoEscolhido);
                                            break;
                                    }
                                }while(escolha != 5);
                                break;
                                
                            case 4:
                                EntradaSaida.mostrar(loja.verProdutoEmBaixa(loja));
                                break;
                            case 5:
                                break;       
                        }
                    }while(escolha!=5);
                    break;

                case 3:
                    EntradaSaida.mostrar(loja.verMarcas());
                    int opcao4 = 0;
                    String[] opcoes4 = {"Editar marcas","Excluir marcas","Sair"};
                    String marcaEscolhida = "";
                    do {
                        if (opcao4 != 3){
                            opcao4 = EntradaSaida.escolherOpcao(opcoes4);
                        }
                        switch (opcao4) {
                            case 1:
                                marcaEscolhida = EntradaSaida.cadastrarDado("o nome de uma marca");
                                loja.EditarNomeMarca(marcaEscolhida);
                                break;
                            case 2:
                                marcaEscolhida = EntradaSaida.cadastrarDado("o nome de uma marca");
                                loja.excluirMarca(marcaEscolhida,loja);
                                break;
                        }
                    } while (opcao4 != 3);
                    break;
            }
        } while (opcao != 4);
    }
}
