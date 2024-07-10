public class ProdutoEmEstoque {
    private Produto produto;
    private int quantidadeAtual;
    private int quantidadeMin;
    private boolean produtoFaltando;
    
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public int getQuantidadeAtual() {
        return quantidadeAtual;
    }
    public void setQuantidadeAtual(int quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }
    public int getQuantidadeMin() {
        return quantidadeMin;
    }
    public void setQuantidadeMin(int quantidadeMin) {
        this.quantidadeMin = quantidadeMin;
    }
    public boolean getProdutoFaltando() {
        return produtoFaltando;
    }
    public void setProdutoFaltando(boolean produtoFaltando) {
        this.produtoFaltando = produtoFaltando;
    }
}
