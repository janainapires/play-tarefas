package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.Tarefa;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import utils.Util;

import java.util.Set;
import java.util.stream.Collectors;

public class Servico extends Controller {
    public  Result adicionar() {
        JsonNode json = request().body().asJson();

        if (json == null){
            return badRequest(Util.createResponse(
                    "Expecting Json data", false));
        }
        Tarefa tarefa = TarefaStore.getInstance().addTarefa(
                (Tarefa) Json.fromJson(json, Tarefa.class));
        JsonNode jsonObject = Json.toJson(tarefa);
        return created(jsonObject);

    }

    public  Result excluir(Long id) {
        boolean status = TarefaStore.getInstance().deleteTarefa(id);
        if (!status) {
            return notFound(Util.createResponse(
                    "Tarefa com id:" + id + " não encontrada", false));
        }
        return ok(Util.createResponse(
                "Tarefa com id:" + id + " deletada", true));
    }

    public Result pesquisar(Long id) {
        Tarefa tarefa = TarefaStore.getInstance().getTarefa(id);
        if (tarefa == null) {
            return notFound(Util.createResponse(
                    "Tarefa com id:" + id + " não encontrada", false));
        }
        JsonNode jsonObjects = Json.toJson(tarefa);
        return ok(jsonObjects);
    }

    public  Result atualizar() {
        JsonNode json = request().body().asJson();
        if (json == null){
            return badRequest(Util.createResponse(
                    "Expecting Json data", false));
        }
        Tarefa tarefa = TarefaStore.getInstance().updateTarefa(
                (Tarefa) Json.fromJson(json, Tarefa.class));
        if (tarefa == null) {
            return notFound(Util.createResponse(
                    "Tarefa não encontrada", false));
        }

        JsonNode jsonObject = Json.toJson(tarefa);
        return ok(jsonObject);
    }

    public  Result listar () {
        Set<Tarefa> result = TarefaStore.getInstance().getAllTarefas().all().stream().collect(Collectors.toSet());
        ObjectMapper mapper = new ObjectMapper();

        JsonNode jsonData = mapper.convertValue(result, JsonNode.class);
        return ok(jsonData);
    }
}