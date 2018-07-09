package controllers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Tarefa;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import utils.Util;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Servico extends Controller {

    Map<Long, Tarefa> tarefas = new HashMap<Long, Tarefa>();

    @Inject
    private FormFactory formFactory;


    public  Result adicionar() {
        JsonNode json = request().body().asJson();
        if (json == null){
            return badRequest(Util.createResponse(
                    "Expecting Json data", false));
        }
        Tarefa tarefa = TarefaStore.getInstance().addTarefa(
                (Tarefa) Json.fromJson(json, Tarefa.class));
        JsonNode jsonObject = Json.toJson(tarefa);
        return created(Util.createResponse(jsonObject, true));

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
        return ok(Util.createResponse(jsonObjects, true));
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
        return ok(Util.createResponse(jsonObject, true));
    }

    public  Result listar () {
        Set<Tarefa> result = TarefaStore.getInstance().getAllTarefas();
        ObjectMapper mapper = new ObjectMapper();

        JsonNode jsonData = mapper.convertValue(result, JsonNode.class);
        return ok(Util.createResponse(jsonData, true));
    }

}