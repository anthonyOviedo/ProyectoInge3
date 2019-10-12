/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Smart_msph.data;

import Smart_msph.logic.Ciudadano;
import Smart_msph.logic.Funcionario;
import Smart_msph.logic.Usuario;
import Smart_msph.logic.citizen_user;
import Smart_msph.logic.departamento;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leiner
 */
public class Dao {
    
    RelDatabase db;
     
    public Dao() {
        db = new RelDatabase();
    }
    

    // creacion de los objetos desde la base
     private departamento departamento(ResultSet rs){
        try {
            departamento dep = new departamento();
            dep.setId(rs.getInt("id"));
            dep.setNombre(rs.getString("departmentname"));
            dep.setAdministrador(rs.getInt("administrator_id"));
            return dep;
        } catch (SQLException ex) {
            return null;
        }
      }
     
     private Funcionario funcionario(ResultSet rs){
         try {
             System.out.println("aaa");
             Funcionario fun = new Funcionario();
             fun.setId(rs.getInt("id"));
             fun.setNombre(rs.getString("administratorname"));
             fun.setApellido(rs.getString("surname1"));
             fun.setApellido(rs.getString("surname2"));
             fun.setCorreo(rs.getString("e-mail"));
             fun.setTelefono(rs.getString("phoneNumber"));
             fun.setDepartamento(departamento(rs));
             return fun;
             
         } catch (SQLException ex) {
             return null;
         }
       }
    
    
    private Ciudadano ciudadano(ResultSet rs){ 
        try {
          Ciudadano ciu = new Ciudadano();
          ciu.setId(rs.getInt("Id"));
          ciu.setNombre(rs.getString("citizenname"));
          ciu.setApellido(rs.getString("surname1"));
          ciu.setApellido(rs.getString("surname2"));
          ciu.setCorreo(rs.getString("e-mail"));
          ciu.setTelefono(rs.getString("phoneNumber"));
          
          return ciu;
          
        } catch (SQLException ex) {
        return null;
        }
    }
    
//     private Usuario citizen_user(ResultSet rs){
//         try {
//             Usuario us = new Usuario();
//             us.setId(rs.getInt("id"));
//             us.setNombreUsuario(rs.getString("username"));
//             us.setContrasenya(rs.getString("password"));
//             us.setContrasenya(rs.getString("'role'"));
//             us.setCiudadano(ciudadano(rs));            
//             return us;
//            } catch (SQLException ex) {
//         return null;
//         }    
//     }
    
     
        private citizen_user citizen_user(ResultSet rs){
         try {
             citizen_user us = new citizen_user();
             us.setId(rs.getInt("id"));
             us.setUsername(rs.getString("username"));
             us.setPassword(rs.getString("password"));
             us.setRole(rs.getString("'role'"));
             us.setCitizen_id(ciudadano(rs));            
             return us;
            } catch (SQLException ex) {
         return null;
         }    
     }
     
     
    private Ciudadano citizen(ResultSet rs){ 
        try {
          Ciudadano ciu = new Ciudadano();
          ciu.setId(rs.getInt("idcitizen"));
          ciu.setNombre(rs.getString("citizenname"));
          ciu.setApellido(rs.getString("surname1"));
          ciu.setApellido(rs.getString("surname2"));
          ciu.setCorreo(rs.getString("mail"));
          ciu.setTelefono(rs.getString("phoneNumber"));
          
          return ciu;
          
        } catch (SQLException ex) {
        return null;
        }
    }
     
    
     // crear un ciudadano
     public void insertarCiudadano(Ciudadano c) throws Exception{
         String sql = "insert into citizen (id,citizenname,surname1,surname2,mail,phoneNumber)"
                 + " values ('%d','%s','%s','%s','%s','%s')";

         sql = String.format(sql,c.getId(),c.getNombre(),c.getApellido(),c.getApellido2(),c.getCorreo(),c.getTelefono());
         int count = db.executeUpdate(sql);
         if(count==0){
              throw new Exception("Ciudadano ya existe");
         }
         
     }
    
    // crear el Usuario para el Ciudadano
     public void insertarUsuarioCiudadano(citizen_user u) throws Exception{   
         String sql = "insert into citizen_user(username,password,role,citizen_id) "
                 + "values ('%s','%s','%s','%d')";
         sql = String.format(sql,u.getUsername(),u.getPassword(),u.getRole(),u.getCitizen_id().getId());
         int count = db.executeUpdate(sql);
         if(count==0){
              throw new Exception("Usuario ya existe");
         }
     }
   
     
     // obtener un usuario
     
         private citizen_user citizen_user2(ResultSet rs){
         try {
             citizen_user us = new citizen_user();
             us.setId(rs.getInt("iduser"));
             us.setUsername(rs.getString("username"));
             us.setPassword(rs.getString("password"));
             us.setRole(rs.getString("role"));
             us.setCitizen_id(citizen(rs));            
             return us;
            } catch (SQLException ex) {
         return null;
         }    
     }
     public citizen_user getcitizenuser(String username) throws Exception {
        String sql = "select * from  rep_citizen_user where username = '%s'";
        sql = String.format(sql, username);
        ResultSet rs = db.executeQuery(sql);
        if (rs.next()) {
            return citizen_user2(rs);
        } else {
            throw new Exception("Usuario no Existe");
        }
    }
     
     
     
 
    // obtener el Usuario_ciudadano
//     public Usuario obtenerusuarioCiudadano(int id) throws Exception{
//         String sql = "select * from usuario_ciudadano uc inner join ciudadano c on "
//                 + "uc.Ciudadano_Id=c.id where uc.id = '%d'";
//         sql = String.format(sql,id);
//         ResultSet rs = db.executeQuery(sql); 
//         if(rs.next()){
//         return usuario(rs);
//         } else {
//            throw new Exception("Usuario no Existe");
//        }
//       }
//     
     // obtener Usuario_funcionario
     
//        public Usuario obtenerusuarioFuncionario(int id) throws Exception{
//         String sql = "select * from usuario_funcionario uf inner join funcionario f "
//                 + "inner join departamento d on "
//                 + "uf.funcionario_Id=f.id and f.Departamento_id=d.id where uf.id = '%d'";
//         sql = String.format(sql,id);
//         ResultSet rs = db.executeQuery(sql); 
//         if(rs.next()){
//         return usuario(rs);
//         } else {
//            throw new Exception("Usuario no Existe");
//        }
//       }
     
    
}
