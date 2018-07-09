package controllers;

import io.ebean.Ebean;
import io.ebean.Finder;
import io.ebean.Model;
import models.Tarefa;

public class TarefaStore extends Model {

    private static TarefaStore instance;

    public static TarefaStore getInstance() {
        if (instance == null) {
            instance = new TarefaStore();
        }
        return instance;
    }

    public Tarefa addTarefa(Tarefa tarefa) {
        Ebean.save(tarefa);
        return tarefa;
    }

    public Tarefa getTarefa(Long id) {
        return Ebean.find(Tarefa.class, id);
    }

    public Finder<Long, Tarefa> getAllTarefas() {
        return new Finder<Long, Tarefa>(Tarefa.class);
    }

    public Tarefa updateTarefa(Tarefa tarefa) {
        Ebean.update(tarefa);
        return tarefa;
    }

    public boolean deleteTarefa(Long id) {
        Tarefa tarefa = getTarefa(id);
        boolean retorno = false;

        if (tarefa != null){
            retorno = Ebean.delete(tarefa);
        }

        return retorno;
    }
}