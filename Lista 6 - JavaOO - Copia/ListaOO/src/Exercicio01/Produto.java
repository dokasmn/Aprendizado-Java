package Exercicio01;

import java.util.ArrayList;

public class Produto {
    public ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();

    public String nome;
    public double preco;
    public int tamanho;
    public String cor;
    public Marca marcaProduto;

    public void adicionarProduto(Produto tenis){
        this.listaDeProdutos.add(tenis);
    }

    public String listarProdutos(){
        String resultado = "Os dados do Tênis são: \n";
        
        for(Produto tenis : this.listaDeProdutos){
            resultado += "\nNome: " + tenis.nome + 
            "\nTamanho: " + tenis.tamanho + 
            "\nPreço: " + tenis.preco 
            + "\nCor: " +tenis.cor + 
            "\nMarca: " + tenis.marcaProduto.nome;
        }
        
        return resultado;
    }
}