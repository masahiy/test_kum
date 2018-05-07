package advent.kumsample;

import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/rest")
public class RestResource {
    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response getResources() {

        Map<String, String> json = new HashMap<>();
        json.put("nogizaka46", "mai shiraishi");

        return Response.ok(json).build();
    }
}