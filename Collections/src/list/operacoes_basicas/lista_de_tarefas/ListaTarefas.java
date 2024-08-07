package list.operacoes_basicas.lista_de_tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new ArrayList<>();
    }

    public ListaTarefas(List<Tarefa> listaTarefas) {
        this.listaTarefas = listaTarefas;
    }

    public void adicionarTarefa(String descricao){
        listaTarefas.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasRemove = new ArrayList<>();
        for (Tarefa tarefas : listaTarefas) {
            if (tarefas.getDescricao().equals(descricao)) {
                tarefasRemove.add(tarefas);
            }
        }
        listaTarefas.removeAll(tarefasRemove);
    }
    public int obterNumeroTarefas() {
        return listaTarefas.size();
    }
    public void obterDescricoesTarefas() {
        System.out.println(listaTarefas);
    }
}
