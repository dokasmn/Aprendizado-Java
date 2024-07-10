import java.util.ArrayList;
// import javax.swing.JComboBox;
// import javax.swing.JOptionPane;

public class Loja {
    private ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();
    private ArrayList<ProdutoEmEstoque> listaDeProdutosEmEstoque = new ArrayList<ProdutoEmEstoque>();
    private ArrayList<Marca> marcas = new ArrayList<Marca>();

    public ArrayList<Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public void setListaDeProdutos(ArrayList<Produto> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }

    public ArrayList<ProdutoEmEstoque> getListaDeProdutosEmEstoque() {
        return listaDeProdutosEmEstoque;
    }

    public void setListaDeProdutosEmEstoque(ArrayList<ProdutoEmEstoque> listaDeProdutosEmEstoque) {
        this.listaDeProdutosEmEstoque = listaDeProdutosEmEstoque;
    }

    public ArrayList<Marca> getMarcas() {
        return marcas;
    }

    public void setMarcas(ArrayList<Marca> marcas) {
        this.marcas = marcas;
    }

    public String verMarcas() {
        String marcasParceiras = "Marcas parceiras";
        for (Marca marca : this.getMarcas()) {
            marcasParceiras += "\n" + marca.getNomeDaMarca();
        }
        return marcasParceiras;
    }

    public void cadastrarMarcas(Marca marca){
        this.getMarcas().add(marca);
    }

    public void inserirProdutos(Produto produto, ProdutoEmEstoque produtoEstoque) {
        this.getListaDeProdutos().add(produto);
        this.getListaDeProdutosEmEstoque().add(produtoEstoque);
    }

    public void InserirMarca(Marca marca) {
        this.getMarcas().add(marca);
    }

    public void EditarNomeMarca(String marcaEscolhida) {
        int cont = 0;
        for (Marca marca : this.getMarcas()) {
            cont += 1;
            if (marca.getNomeDaMarca().equals(marcaEscolhida)) {
                marca.setNomeDaMarca(EntradaSaida.cadastrarDado("nome da marca que deseja alterar"));
                EntradaSaida.mostrar("dado atualizado");
            } else if (cont == this.getMarcas().lastIndexOf(marca)) {
                EntradaSaida.mostrar("Marca não encontrada");
            }
        }
    }

    public String verPelaMarca(String marcaEscolhida,Loja l) {
        String produtos = "Produtos da marca: ";
        // int cont = 0;

        for (Produto produto : this.getListaDeProdutos()) {
            if (produto.getMarcaProduto().getNomeDaMarca().equals(marcaEscolhida)) {
            // validar se marca existe
                 produtos += "\n" + l.verProdutos(l);
            }
        }
        return produtos;
    }

    public void excluirMarca(String marcaEscolhida,Loja loja) {
        int cont = 0;
        Marca marcaASerExcluida = null;
        for (Marca marca : this.getMarcas()) {
            cont += 1;
            if (marca.getNomeDaMarca().equals(marcaEscolhida)) {
                marcaASerExcluida = marca;
            } else if (cont == this.getMarcas().lastIndexOf(marca)) {
                EntradaSaida.mostrar("marca não encontrada");
            }
        }
        this.getMarcas().remove(marcaASerExcluida);
        EntradaSaida.mostrar("A marca " + marcaASerExcluida.getNomeDaMarca() + " foi excluída");
        for (Produto produto : this.getListaDeProdutos()) {
            if (produto.getMarcaProduto().equals(marcaASerExcluida)) {
                loja.editarProdutos(produto.getNome(),5);
            }
        }
    }

    public String verProdutos(Loja loja) {
        String produtos = "Produtos em estoque: ";
        int i = 0;

        for (ProdutoEmEstoque produto : this.getListaDeProdutosEmEstoque()) {
            i++;
            produtos += "\n==================================================" +
                    "\nNome: " + produto.getProduto().getNome() +
                    "\n==================================================" +
                    "\nProduto " + i + 
                    "\nCodigo: " + produto.getProduto().getCodigo() + "\nTipo: " + produto.getProduto().getTipo() +
                    "\nPreço: " + produto.getProduto().getPreco() + "\nTamanho: " + produto.getProduto().getTamanho() +
                    "\nMarca: " + produto.getProduto().getMarcaProduto().getNomeDaMarca() + "\nCor: " + produto.getProduto().getCor() +
                    "\nQuantidade atual no estoque: " + produto.getQuantidadeAtual() + "\nQuantidade mínina no estoque: " + produto.getQuantidadeMin() +
                    "\n -------------------------------------------------";
        }
        return produtos;
    }

    public void editarProdutos(String produtoEscolhido,int opcaoPreEscolhida) {
        int opcao;
        int cont = 0;
        boolean n = true;
        for (Produto produto : this.getListaDeProdutos()) {
            cont += 1;
            if (produto.getNome().equals(produtoEscolhido)) {
                String[] opcoes = {"Nome", "Tipo", "Preço", "Tamanho", "Marca", "Cor"};
                opcao = EntradaSaida.escolherOpcao(opcoes);
                if (opcaoPreEscolhida != 0) {
                    opcao = opcaoPreEscolhida;
                }
                switch (opcao) {
                    case 1:
                        n = true;
                        while (n){
                            try {
                                produto.setNome(EntradaSaida.cadastrarDado("nome"));
                                n = false;
                            }
                             catch (Exception e) {
                                n = true;
                            }
                        }
                        break;
                    case 2:
                        String[] opcoes2 = {"camisa","camiseta","calça","shorts","tênis","acessórios"};
                        produto.setTipo(EntradaSaida.escolherNome(opcoes2));
                        break;
                    case 3:
                        n = true;
                        while (n){
                            try {
                                do{
                                    produto.setPreco(Integer.parseInt(EntradaSaida.cadastrarDado("preco")));
                                }while(Validacao.validarDecimal(produto.getPreco()) == false);
                                n = false;
                            }
                             catch (Exception e) {
                                n = true;
                            }
                        }
                        break;
                    case 4:
                        n = true;
                        while (n){
                            if (produto.getTipo().equals("tênis")) {
                                try {
                                    produto.setTamanho(EntradaSaida.cadastrarDado(("o tamanho do produto")));
                                    n = false;
                                } catch (Exception e) {
                                    n = true;
                                }
                            }
                            else{
                                String[] opcoes3 = {"PP","P","M","G","GG","XG"};
                                produto.setTamanho(EntradaSaida.escolherNome(opcoes3));
                                n = false;
                            }
                        }
                        break;
                    case 5:
                        produto.getMarcaProduto().setNomeDaMarca(EntradaSaida.cadastrarDado("a marca"));;
                    case 6:
                        String[] cores = {"Azul", "Preto", "Branco", "Vermelho", "Colorido"};
                        produto.setCor(EntradaSaida.escolherNome(cores));
                        break;
                        
                    
                }    
            } else if (cont == this.getListaDeProdutos().lastIndexOf(produto)) {
                EntradaSaida.mostrar("Produto não encontrado");
            }
        }
    }


    public void excluirProdutos(String produtoEscolhido){
        int cont = 0;
        Produto produtoAExcluir = null;
        for (Produto produto2 : this.getListaDeProdutos()) {
            if(produto2.getNome().equals(produtoEscolhido)){
                produtoAExcluir = produto2;
            }
            else if (cont == this.getListaDeProdutos().lastIndexOf(produto2)) {
                EntradaSaida.mostrar("Produto não encontrado");
            }
        cont++;
        }
        
        this.getListaDeProdutosEmEstoque().removeIf(p -> p.getProduto().getNome().equals(produtoEscolhido));
        this.getListaDeProdutos().remove(produtoAExcluir);
        EntradaSaida.mostrar("O produto " + produtoAExcluir.getNome() + " foi excluído");
    }


    public void atualizarBaixa(String produtoEscolhido){
        int cont = 0;
        int saida = 0;
        int Quantidade = 0;
        for (ProdutoEmEstoque p : this.getListaDeProdutosEmEstoque()) {
            cont += 1;
            if (p.getProduto().getNome().equals(produtoEscolhido)) {
                saida = Integer.parseInt(EntradaSaida.cadastrarDado("Quantidade de saída"));
                if(Validacao.validarSaida(saida,p.getQuantidadeAtual())){
                    Quantidade = p.getQuantidadeAtual();
                    p.setQuantidadeAtual(Quantidade - saida);
                }
                else{
                    EntradaSaida.mostrar("Quantidade de saída inválida");
                }
            }
            else if(cont == this.getListaDeProdutos().lastIndexOf(p)){
                EntradaSaida.mostrar("Produto não encontrado");
            }
        }
    }

    public void atualizarEntrada(String produtoEscolhido){
        int cont = 0;
        int entrada = 0;
        int Quantidade = 0;
        for (ProdutoEmEstoque p : this.getListaDeProdutosEmEstoque()) {
            cont += 1;
            if (p.getProduto().getNome().equals(produtoEscolhido)) {
                entrada = Integer.parseInt(EntradaSaida.cadastrarDado("Quantidade de entrada: "));
                if(Validacao.validarInteiro(entrada)){
                    Quantidade = p.getQuantidadeAtual();
                    p.setQuantidadeAtual(Quantidade + entrada);
                }
                else{
                    EntradaSaida.mostrar("Quantidade de entrada inválida");
                }
            }
            else if(cont == this.getListaDeProdutos().lastIndexOf(p)){
                EntradaSaida.mostrar("produto não encontrado");
            }
        }
    }

    public String verUmProduto(String codigoDoProduto) {
        String produto = "Produtos em estoque: ";
        int i = 1;

        for (ProdutoEmEstoque p : this.getListaDeProdutosEmEstoque()) {
            if (p.getProduto().getCodigo().equals(codigoDoProduto)) {

                produto += "\n==================================================" +
                        "\nNome: " + p.getProduto().getNome() +
                        "\n==================================================" +
                        "\nProduto " + i + 
                        "\nCodigo: " + p.getProduto().getCodigo() + "\nTipo: " + p.getProduto().getTipo() +
                        "\nPreço: " + p.getProduto().getPreco() + "\nTamanho:" + p.getProduto().getTamanho() +
                        "\nMarca:" + p.getProduto().getMarcaProduto().getNomeDaMarca() + "\nCor:" + p.getProduto().getCor() +
                        "\n Quantidade atual no estoque: " + p.getQuantidadeAtual() + "\nQuantidade mínima no estoque: " + p.getQuantidadeMin() +
                        "\n -------------------------------------------------";
            }
            i += 1;
        }
        return produto;
    }

    public String verProdutoEmBaixa(Loja loja) {
        String produtos = "";
        int i = 0;
        for (ProdutoEmEstoque p : this.listaDeProdutosEmEstoque) {
            if (p.getProdutoFaltando() == true) {
                i++;
                produtos += "\n==================================================" +
                        "\nNome: " + p.getProduto().getNome() +
                        "\n==================================================" +
                        "\nProduto " + i + 
                        "\nCodigo: " + p.getProduto().getCodigo() + "\nTipo: " + p.getProduto().getTipo() +
                        "\nPreço: " + p.getProduto().getPreco() + "\nTamanho:" + p.getProduto().getTamanho() +
                        "\nMarca:" + p.getProduto().getMarcaProduto().getNomeDaMarca() + "\nCor:" + p.getProduto().getCor() +
                        "\n Quantidade atual no estoque: " + p.getQuantidadeAtual() + "\nQuantidade mínima no estoque: " + p.getQuantidadeMin() +
                        "\n -------------------------------------------------";
            }
        }
        return produtos;
    }

    public String retornarNomeProduto(String codigoEscolhido) {
        int cont = 0;
        String resultado = "";
        for (Produto produto : listaDeProdutos) {
            if (produto.getCodigo().equals(codigoEscolhido)){
                resultado =  produto.getNome();
            }
            else if (cont == this.getListaDeProdutos().lastIndexOf(produto)) {
                EntradaSaida.mostrar("Produto não encontrado");
            }
            cont++;
        }
        return resultado;
    }

}
