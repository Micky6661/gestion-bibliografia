package py.com.gestion.business.service;

import py.com.gestion.bibliografia.model.Autor;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/autor")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AutorService {

    @GET
    public Response getListAutor(Autor autor) {

        return Response.ok().build();
    }

    @POST
    public Response saveAutor(Autor autor) {

        return Response.ok().build();
    }

    @PUT
    public Response editAutor(Autor autor) {

        return Response.ok().build();
    }

    @DELETE
    public Response deleteAutor(Autor autor) {

        return Response.ok().build();
    }

}
