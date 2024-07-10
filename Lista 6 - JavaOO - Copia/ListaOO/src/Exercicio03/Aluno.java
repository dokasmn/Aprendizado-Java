package Exercicio03;

import java.util.ArrayList;

public class Aluno {
    public String nome;
    public String frequencia;
    public int ocorrencia;    
    
    public ArrayList<Nota> listaNotas = new ArrayList<Nota>();

    public void adicionarNota(Nota novaNota) {
        this.listaNotas.add(novaNota);
    }

    public String listarNotas(){
        String notas = "\n";
        for(Nota n : listaNotas) {
            notas += n.valorNota;
            notas += " - " + n.descricaoNota + "\n";
        }
        return notas;
    }
}
