package controllers;

import models.Tarefa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TarefaStore {

    private static TarefaStore instance;

    private Map<Long, Tarefa> tarefas = new HashMap<Long, Tarefa>();

    public static TarefaStore getInstance() {
        if (instance == null) {
            instance = new TarefaStore();
        }
        return instance;
    }

    public Tarefa addTarefa(Tarefa tarefa) {
        Long id = Long.parseLong(String.valueOf(tarefas.size()));
        tarefa.setId(id);
        tarefas.put(id, tarefa);
        return tarefa;
    }

    public Tarefa getTarefa(Long id) {
        return tarefas.get(id);
    }

    public Set<Tarefa> getAllTarefas() {
        return new HashSet<>(tarefas.values());
    }

    public Tarefa updateTarefa(Tarefa tarefa) {
        Long id = tarefa.getId();
        if (tarefas.containsKey(id)) {
            tarefas.put(id, tarefa);
            return tarefa;
        }
        return null;
    }

    public boolean deleteTarefa(Long id) {
        return tarefas.remove(id) != null;
    }
}
