package Exercicio03;

public class Principal {
    public static void main(String[] args) {
        int i = 0;
        int escolha = 0;
        int opcao = 0;
        int opcao2 = 0;

        Escola e = new Escola();
        do{
            opcao = EntradaSaida.escolherOpcao(" Cadastrar aluno ", " Ver dados dos alunos ", " Ver dados de um aluno ");
            switch (opcao) {
                case 1:
                    escolha = EntradaSaida.escolherQuantidadeCadastro("Alunos");
                    for (i=0; i<escolha; i++){

                        // cadastro de aluno
                        Aluno novoAluno = new Aluno();
                        novoAluno.nome = EntradaSaida.cadastrarDado("o nome");
                        String frequencia = EntradaSaida.cadastrarDado("o número da frequencia");
                        
                        novoAluno.frequencia = (frequencia += "%");

                        novoAluno.ocorrencia = Integer.parseInt(EntradaSaida.cadastrarDado("o número de ocorrências"));

                        int novaEscolha = EntradaSaida.escolherQuantidadeCadastro("notas");
                            // cadastro de nota
                        for(int j = 0;j < novaEscolha;j++){
                            Nota novaNota = new Nota();
                            novaNota.valorNota = Double.parseDouble(EntradaSaida.cadastrarDado("o valor da nota " + (j + 1)));
                            novaNota.valorNota = Validacao.validarECadastrarNota(novaNota.valorNota);

                            novaNota.descricaoNota = EntradaSaida.cadastrarDado("a descrição da nota " + (j + 1));

                            novoAluno.adicionarNota(novaNota);
                        }

                        e.adicionarAluno(novoAluno);
                    }
                    break;
                case 2 :
                    EntradaSaida.mostrarDados(e.listarAlunos());
                    break;
                case 3:
                    if(!e.listaDeAlunos.isEmpty()){
                        String alunoEscolhido = EntradaSaida.pergutarAluno();
                        String encontrado = e.procurarAluno(alunoEscolhido);
                        
                        if (encontrado.equals("O nome informado não foi encontrado")) {
                            EntradaSaida.mostrarAlerta("O aluno não foi encontrado");
                        }else{
                            do{
                                EntradaSaida.mostrarDados(e.procurarAluno(alunoEscolhido));
                                opcao2 = EntradaSaida.escolherOpcao(" Alterar nome do aluno ", " Adicionar mais uma nota ", " Calcular média de notas ");
                                switch (opcao2) {
                                    case 1:
                                        e.AlterarNome(alunoEscolhido);
                                    break;

                                    case 2:
                                        e.adicionarNota(alunoEscolhido);
                                        break;

                                    case 3:
                                        EntradaSaida.mostrarDados(e.calcularMedia(alunoEscolhido));
                                        break;

                                    default:
                                        break;

                                }
                            }while(opcao2 != 4);
                        }   
                    }else{
                       EntradaSaida.mostrarAlerta("Nenhum aluno foi cadastrado");
                    }
                break;
            
            }
        }while(opcao != 4);
    }
}
