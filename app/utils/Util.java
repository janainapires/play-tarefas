package utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;

public class Util {

    public static ObjectNode createResponse(
            Object response, boolean ok) {

        ObjectNode result = Json.newObject();
        result.put("Sucesso: ", ok);
        if (response instanceof String) {
            result.put("body", (String) response);
        }
        else {
            result.set("body", (JsonNode) response);
        }

        return result;
    }
}
