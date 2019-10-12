/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Smart_msph.logic;

import Smart_msph.data.Dao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leiner
 */
public class Model {

    
    
    
    
    Dao dao = null;

    public Model() {
        this.dao = new Dao();
    }

    private static Model uniqueInstance = null;

    public static Model instance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Model();
        }
        System.out.println("Smart_msph.logic.Model.instance()");
        return uniqueInstance;
    }

    public void agregarCiudadano(String[] listCampos)
            throws Exception {
        //guardar campos en variables
        String name = listCampos[0];
        String surname1 = listCampos[1];
        String surname2 = listCampos[2];
        String username = listCampos[3];
        String password = listCampos[4];
        int idnumber = Integer.parseInt(listCampos[6]);
        String mail = listCampos[7];
        String phoneNumber= listCampos[8];
        

        //crea un usuario
        Ciudadano unCiudadano = new Ciudadano(idnumber, name, surname1,surname2, mail, phoneNumber);
        //crea un usuario a partir del ciudadano.
        
//meter el usuario en la base datos.
//Usuario unUsuario = new Usuario(cedula, correo, contrasenya, correo, unCiudadano.getId(), null);

    citizen_user citizenUser = new citizen_user(username,password,"Ciudadano",unCiudadano);

        dao.insertarCiudadano(unCiudadano);
       dao.insertarUsuarioCiudadano(citizenUser);

    }


 public citizen_user login(String username, String password) throws Exception {
        citizen_user user = dao.getcitizenuser(username);
        if (user.getPassword().equals(password)) {
            return user;
        } else {
            throw new Exception("Clave incorrecta");
        }
    }















//    public Usuario LoggUsuarioCiudadano(int id, String contrasenya) throws Exception {
//        Usuario u = dao.obtenerusuarioCiudadano(id);
//        if (u.getContrasenya().equals(contrasenya)) {
//            return u;
//        } else {
//            throw new Exception("Clave incorrecta");
//        }
//    }

//    public Usuario LoggUsuariofuncionario(int id, String contrasenya) throws Exception {
//        Usuario u = dao.obtenerusuarioFuncionario(id);
//        if (u.getContrasenya().equals(contrasenya)) {
//            return u;
//        } else {
//            throw new Exception("Clave incorrecta");
//        }
//    }
//
//}
}