package controllers;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Tarefa;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.HashMap;
import java.util.Map;

public class Servico extends Controller {

    Map<Long, Tarefa> tarefas = new HashMap<Long, Tarefa>();

    public  Result adicionar() {
        ObjectNode response = Json.newObject();

        Tarefa tarefa = new Tarefa();
        tarefa.id = (long) tarefas.values().size();
        tarefa.descricao = request().body().asMultipartFormData()
                .asFormUrlEncoded().get("descricao")[0];
        tarefa.titulo = request().body().asMultipartFormData()
                .asFormUrlEncoded().get("titulo")[0];
        tarefa.completada = false;
        tarefas.put(tarefa.id, tarefa);

        response.put("id", tarefa.id);
        response.put("resposta", "Tarefa Adicionada com Sucesso!");

        return ok(response);
    }

    public  Result excluir(Long id) {
        ObjectNode response = Json.newObject();

        if(tarefas.containsKey(id)) {
            tarefas.remove(id);
            response.put("resposta", "Tarefa excluída com sucesso!");
        } else {
            response.put("resposta", "Tarefa não encontrada.");
        }
        return ok(response);
    }

    public  Result completar(Long id) {
        ObjectNode response = Json.newObject();

        if(tarefas.containsKey(id)) {
            Tarefa tarefa = tarefas.get(id);
            tarefa.completada = true;
            response.put("resposta", "Tarefa completada com sucesso!");
        } else {
            response.put("resposta", "Tarefa não encontrada.");
        }
        return ok(response);
    }

    public  Result listar () {
        ObjectNode node = Json.newObject();
        ArrayNode response = node.arrayNode();
        for (Tarefa tarefa : tarefas.values()) {
            node = Json.newObject();
            node.put("id", tarefa.id);
            node.put("titulo", tarefa.titulo);
            node.put("descricao", tarefa.descricao);
            node.put("completada", tarefa.completada);
            response.add(node);
        }
        return ok(response);
    }

}