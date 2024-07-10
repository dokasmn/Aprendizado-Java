package Exercicio04;
import java.util.ArrayList;

public class Usuario {
    ArrayList<Tarefa> listaDeTarefas = new ArrayList<Tarefa>();
    public Object descricao;

    public void adicionarTarefa(Tarefa tarefa){
      this.listaDeTarefas.add(tarefa);
    }
  
      public String listarTarefas() {
        String resultados = "";
        int filtro = EntradaSaida.escolherOpcao("ver tarefas em aberto", "ver tarefas concluidas", "ver todas as tarfefas");
        do{
          switch (filtro) {
            case 1:
              for (Tarefa tarefa : this.listaDeTarefas) {
                if(tarefa.status.equals("pendente")){
                  resultados += "\nDescrição: " + tarefa.descricao +
                  "\nPrazo: " + tarefa.prazo + 
                  "\nSituação: " + tarefa.status +
                  "\nTipo: " + tarefa.tipo +
                  "\n-----------------------";
                }
            } 
              break;
            case 2:
              for (Tarefa tarefa : this.listaDeTarefas) {
                if(tarefa.status.equals("concluida")){
                  resultados += "\nDescrição: " + tarefa.descricao +
                  "\nPrazo: " + tarefa.prazo + 
                  "\nSituação: " + tarefa.status +
                  "\nTipo: " + tarefa.tipo +
                  "\n-----------------------";
                }
              }
              break;
            case 3:
              for (Tarefa tarefa : this.listaDeTarefas) {
              resultados += "\nDescrição: " + tarefa.descricao +
                "\nPrazo: " + tarefa.prazo + 
                "\nSituação: " + tarefa.status +
                "\nTipo: " + tarefa.tipo +
                "\n-----------------------";
            } 
              break;
          }
          return resultados;
        }while(filtro != 4);
    }

    public String verSomente(String tarefaEscolhida) {
        int i = 0;
        String resultado = "";

        for(Tarefa tarefa : this.listaDeTarefas){
            if(tarefa.descricao.equals(tarefaEscolhida)){
                resultado += "\nTarefa " + (i + 1) + ":\nDescrição: " + tarefa.descricao + 
                    "\nPrazo: " + tarefa.prazo + "\nStatus: " + tarefa.status + 
                    "\nTipo: " + tarefa.tipo + 
                    "\n -----------------------------------------------"; 
            }else if(i == this.listaDeTarefas.lastIndexOf(tarefa)){
              resultado = "Tarefa não encontrada";  
            }
            i += 1;
        }
        return resultado;
    }

    public void alterarStatus(String tarefaEscolhida) {
      int cont = 0;
      for(Tarefa tarefa : this.listaDeTarefas){
            cont += 1;
            if(tarefa.descricao.equals(tarefaEscolhida)){
              tarefa.status =EntradaSaida.cadastrarDado(cont +" o status: (pendente/concluida)");
            }else if(cont == this.listaDeTarefas.lastIndexOf(tarefa)){
              EntradaSaida.mostrar("A tarefa não foi encontrada");
            }
           
        }
    }

	  public void excluirTarefa(String tarefaEscolhida) {
      
      int cont = 0;
      for (Tarefa t : this.listaDeTarefas) {
        cont += 1;
        if (t.descricao.equals(tarefaEscolhida)) {
          this.listaDeTarefas.remove(t);
          EntradaSaida.mostrar("Tarefa excluida");
        }
        else if (cont == this.listaDeTarefas.lastIndexOf(t)){
          EntradaSaida.mostrar("A tarefa não foi encontrada");
        }
      
	  }  
  }
}
