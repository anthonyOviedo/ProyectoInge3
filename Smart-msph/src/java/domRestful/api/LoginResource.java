/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domRestful.api;

import Smart_msph.logic.Model;
import Smart_msph.logic.citizen_user;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author leine
 */
@Path("login")
public class LoginResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of LoginResource
     */
    public LoginResource() {
    }

    @POST
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes(MediaType.APPLICATION_JSON)
    public citizen_user add(citizen_user user) throws Exception {

       
         citizen_user u = new citizen_user();
         u.setPassword(user.getPassword());
         u.setUsername(user.getUsername());
//********falta bloque de try...
//*****se cae en la siguiente linde de codigo en modelo, probablemente en el constructor.        
        // System.out.println(u.getUsername());
      return  Model.instance().login(u.getUsername(), u.getPassword());
         
        //return "fue y regresa..";
    }
}
