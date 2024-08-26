package orange.mg.service;


import orange.mg.model.RoleUser;
import orange.mg.model.User;
import orange.mg.model.InfoUtilisateur;
import io.vertx.core.json.JsonArray;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import orange.mg.model.DroitUser;
import org.jboss.resteasy.reactive.RestResponse;

import java.util.List;

@Path("/manageUser")
public class UtilisateurService {

    @GET
    @Path("/{param}")
    @Produces(MediaType.APPLICATION_JSON)
    public RestResponse<JsonArray> handleInteraction(@PathParam("param") String param) {

        JsonArray out;
        switch (param) {
            case "role":
                List<RoleUser> roles = InfoUtilisateur.getAllRule();
                out = new JsonArray(roles);
                break;
            case "droit":
                List<DroitUser> droits = InfoUtilisateur.getAllAccess();
                out = new JsonArray(droits);
                break;
            case "alluser":
                List<User> users = InfoUtilisateur.getAllUserWithRuleAndAccess();
                out = new JsonArray(users);
                break;
            case "allrolewithaccess":
                List<RoleUser> rolesWithAccess = InfoUtilisateur.getAllRuleWithAccess();
                out = new JsonArray(rolesWithAccess);
                break;
            default:
                return RestResponse.status(Response.Status.BAD_REQUEST, "Invalid parameter");
        }

        return RestResponse.ok(out.encodePrettily(), MediaType.APPLICATION_JSON_TYPE.withCharset("iso-8859-15"));
    }
}
