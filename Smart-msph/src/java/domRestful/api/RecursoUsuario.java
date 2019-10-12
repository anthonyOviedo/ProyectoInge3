/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domRestful.api;

import Smart_msph.logic.Model;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author antony
 */
@Path("RecursoUsuario")
public class RecursoUsuario {

    @Context
    private UriInfo context;

    public RecursoUsuario() {
    }

    @POST
    @Produces({MediaType.TEXT_HTML})
  
    public String add(String campos) throws Exception {

        //recibe los campos y los guarda en un array
        String listCampos[] = campos.split(",");
//********falta bloque de try...
//*****se cae en la siguiente linde de codigo en modelo, probablemente en el constructor.        

      Model.instance().agregarCiudadano(listCampos);
        return "fue y regresa..";
    }

}
