package Exercicio03;

import java.util.ArrayList;

public class Escola {
    public ArrayList<Aluno> listaDeAlunos = new ArrayList<Aluno>();

    public void adicionarAluno(Aluno a){
        this.listaDeAlunos.add(a);
    }

    public String listarAlunos(){
        String alunos = "Alunos: ";
        int i = 1;

        for(Aluno aluno : this.listaDeAlunos){
            String nota = aluno.listarNotas();
            alunos += "\nAluno " + i + ":\nNome: " + aluno.nome + 
                "\nFrequencia: " + aluno.frequencia + "\nNº de ocorrências: " + aluno.ocorrencia + 
                "\nNotas: " + nota + 
                "\n -----------------------------------------------"; 
            i += 1;
        }
        return alunos;
    }


    public String procurarAluno(String alunoEscolhido) {
        int i = 0;
        String resultado = "";
        String nota = "";

        for(Aluno aluno : this.listaDeAlunos){
            if(aluno.nome.equals(alunoEscolhido)){
                nota += aluno.listarNotas();
                resultado += "\nAluno " + (i + 1) + ":\nNome: " + aluno.nome + 
                    "\nFrequencia: " + aluno.frequencia + "\nNº de ocorrências: " + aluno.ocorrencia + 
                    "\nNotas: " + nota + 
                    "\n -----------------------------------------------"; 
            }else if(i == this.listaDeAlunos.lastIndexOf(aluno)){
                resultado = "O nome informado não foi encontrado";  
            }
            i += 1;
        }
        return resultado;
    }

    

    public void AlterarNome(String alunoEscolhido) {
        for (Aluno aluno : this.listaDeAlunos) {
            if (aluno.nome.equals(alunoEscolhido)) {
                aluno.nome = EntradaSaida.perguntarNome();
            }
        }
    }

    public void adicionarNota(String alunoEscolhido) {
        for (Aluno aluno : listaDeAlunos) {
            if (aluno.nome.equals(alunoEscolhido)) {

                int numero = EntradaSaida.escolherQuantidadeCadastro("notas");
                    for(int j = 0;j < numero;j++){
                        Nota novaNota = new Nota();
                        novaNota.valorNota = Double.parseDouble(EntradaSaida.cadastrarDado("o valor da nota " + (j + 1)));
                        Validacao.validarECadastrarNota(novaNota.valorNota);

                        novaNota.descricaoNota = EntradaSaida.cadastrarDado("a descrição da nota " + (j + 1));
                        aluno.adicionarNota(novaNota);
                    }  
            }
        }
        
    }

    public String calcularMedia(String alunoEscolhido) {
        int cont = 0;
        double notas = 0;
        String resultado = "";
        for (Aluno aluno : this.listaDeAlunos) {
            if (aluno.nome.equals(alunoEscolhido)) {
                    for(Nota nota: aluno.listaNotas){
                        notas += nota.valorNota;
                        cont += 1;
                    }
            }
        }
        resultado += "A média do aluno é: " + (notas/cont);
        return resultado;
    }
}

