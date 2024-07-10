package Exercicio02;

import java.util.ArrayList;

public class Estoque {
    public ArrayList<Peca> listaDePecas = new ArrayList<Peca>();

    public void adicionarPeca(Peca p){
        this.listaDePecas.add(p);
    }

    public void removerPeca(String descricaoPeca){
        listaDePecas.removeIf(p -> p.descricao.equals(descricaoPeca));
    }

    public String listarPecas(){
        String pecas = "Peças disponíveis no estoque: ";
        int i = 1;
        for(Peca p : this.listaDePecas){
            
            pecas += "\nPeça " + i + ":\nDescrição: " + p.descricao + 
                "\nPreço: " + p.preco + "\nCor: " + p.cor + 
                "\nAltura: " + p.altura + "\nLargura: " + p.largura +
                "\n -----------------------------------------------"; 
            i += 1;
        }

        return pecas;
    }
}
