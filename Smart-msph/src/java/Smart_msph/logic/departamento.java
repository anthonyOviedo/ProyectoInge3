/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Smart_msph.logic;

/**
 *
 * @author anton
 */
public class departamento {


    int id;
    String nombre;
    int administrador;

    public departamento() {
    }

    public departamento(int id, String nombre, int administrador) {
        this.id = id;
        this.nombre = nombre;
        this.administrador = administrador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAdministrador() {
        return administrador;
    }

    public void setAdministrador(int administrador) {
        this.administrador = administrador;
    }
       
}
