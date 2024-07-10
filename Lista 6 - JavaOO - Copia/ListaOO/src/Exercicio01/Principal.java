package Exercicio01;

public class Principal {
    public static void main(String[] args) {
        Produto tenis = new Produto();
        tenis.nome  = EntradaSaida.solicitarDados("o nome");
        tenis.tamanho  = Integer.parseInt(EntradaSaida.solicitarDados("o tamanho"));
        tenis.preco = Double.parseDouble((EntradaSaida.solicitarDados("o preço")));
        tenis.cor =   EntradaSaida.solicitarDados("a cor");
        
        Marca m = new Marca();
        tenis.marcaProduto = m;
        tenis.marcaProduto.nome = EntradaSaida.solicitarDados("a marca");

        tenis.adicionarProduto(tenis); //adicionar o objeto tenis na lista de produtos

        EntradaSaida.mostrarTenis(tenis.listarProdutos());
    }
}
