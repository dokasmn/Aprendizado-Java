package Exercicio04;

public class Principal {
    public static void main(String[] args) {
        int opcao1 = 0;
        int opcao2 = 0;
        Usuario novoUser = new Usuario();
        int limite;

        do {
            opcao1 = EntradaSaida.escolherOpcao("Cadastrar tarefa","Ver todas as tarefas","Ver uma tarefa");
            switch (opcao1) {
                case 1:
                    limite = EntradaSaida.escolherQuantidadeCadastro("tarefas");
                    for (int i = 0; i < limite; i++) {
                        Tarefa t = new Tarefa();
                        t.descricao = EntradaSaida.cadastrarDado((i + 1) + " a descrição");
                        t.prazo = EntradaSaida.cadastrarDado((i + 1) + " o prazo");
                        t.status =EntradaSaida.cadastrarDado((i + 1) + " o status: (pendente/concluida)");
                        t.tipo = EntradaSaida.cadastrarDado((i + 1) + " o tipo");

                        novoUser.adicionarTarefa(t);
                    }
                    break;
                case 2:
                    EntradaSaida.mostrar(novoUser.listarTarefas());
                    break;
                case 3:
                    String tarefaEscolhida = EntradaSaida.cadastrarDado("a descrição da tarefa");
                    String validacao = novoUser.verSomente(tarefaEscolhida);

                    if (!(validacao.equals("Tarefa não encontrada"))) {
                        EntradaSaida.mostrar(validacao);
                        do{ 
                            opcao2 = EntradaSaida.escolherOpcao("Alerar status da tarefa","Excluir uma tarefa");
                            switch (opcao2) {
                                case 1:
                                    novoUser.alterarStatus(tarefaEscolhida);
                                    EntradaSaida.mostrar(novoUser.listarTarefas());

                                    break;

                                case 2: 
                                    novoUser.excluirTarefa(tarefaEscolhida);
                                    EntradaSaida.mostrar(novoUser.listarTarefas());
                                    break;
                                
                                default:
                                    break;
                            }
                            }while (opcao2 != 3); 
                    }else{
                        EntradaSaida.mostrar("tarefa não encontrada"); 
                    }
                    break;
            }
        } while(opcao1 != 4);
    }
    
}
