//import java.util.Random;
import java.util.UUID;

public class Produto {

    private String nome;
    private String codigo;
    private String tipo;
    private double preco;
    private String tamanho;
    private Marca marcaProduto;
    private String cor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Marca getMarcaProduto() {
        return marcaProduto;
    }

    public void setMarcaProduto(Marca marcaProduto) {
        this.marcaProduto = marcaProduto;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public static void cadastrarProduto(Loja l) {
        Produto novoProduto = new Produto();

        //gera o código do produto aleatóriamente 
        boolean codigoValido = true;
        do {
            UUID id = UUID.randomUUID();
            String myRandom = id.toString();
            novoProduto.setCodigo(myRandom.substring(0,5));
            codigoValido = Validacao.validarExisteCodigo(novoProduto.getCodigo(),l);
            System.out.println(novoProduto.getCodigo());

        }while(codigoValido == false);

        novoProduto.setNome(EntradaSaida.cadastrarDado(("o nome do produto")));

        String[] opcoes = {"camisa","camiseta","calça","shorts","tênis","acessórios"};
        novoProduto.setTipo(EntradaSaida.escolherNome(opcoes));
        
        boolean n = true;
        while (n){
            try {
                do{
                    novoProduto.setPreco(Double.parseDouble(EntradaSaida.cadastrarDado(("o preço do produto"))));
                }while(Validacao.validarDecimal(novoProduto.getPreco()) == false);
                n = false;
            } catch (Exception e) {
                n = true;
            }
        }

        n = true;
        while (n){
            if (novoProduto.getTipo().equals("tênis")) {
                try {
                    novoProduto.setTamanho(EntradaSaida.cadastrarDado(("o tamanho do produto")));
                    n = false;
                } catch (Exception e) {
                    n = true;
                }
            }
            else{
                String[] opcoes2 = {"PP","P","M","G","GG","XG"};
                novoProduto.setTamanho(EntradaSaida.escolherNome(opcoes2));
                n = false;
            }
        }
        
        Marca marcaDoProduto = new Marca();

        marcaDoProduto.setNomeDaMarca(EntradaSaida.cadastrarDado("a Marca do produto"));
        novoProduto.setMarcaProduto(marcaDoProduto);
        l.cadastrarMarcas(marcaDoProduto);

        ProdutoEmEstoque p = new ProdutoEmEstoque();
        p.setProduto(novoProduto);

        n = true;
        while (n){
            try {
                do{
                    p.setQuantidadeMin(Integer.parseInt(EntradaSaida.cadastrarDado("a quantidade mínima do produto no estoque")));
                }while(Validacao.validarInteiro(p.getQuantidadeMin()) == false);
                n = false;
            } catch (Exception e) {
                n = true;
            }
        }

        n = true;
        while (n){
            try {
                do{
                    p.setQuantidadeAtual(Integer.parseInt(EntradaSaida.cadastrarDado("a quantidade atual do produto no estoque")));
                }while(Validacao.validarInteiro(p.getQuantidadeAtual()) == false);
                n = false;
            } catch (Exception e) {
                n = true;
            }
        }

        p.setProdutoFaltando(Validacao.validarProdutoFaltando(p.getQuantidadeMin(), p.getQuantidadeAtual()));
        
        String[] cores = {"Azul", "Preto", "Branco", "Vermelho", "Colorido"};
        novoProduto.setCor(EntradaSaida.escolherNome(cores));

        l.inserirProdutos(novoProduto, p);
    }

}
