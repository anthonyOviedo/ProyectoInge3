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
public class Denuncia {
    String descripcion, fecha,ubicacion;
    Usuario usuario;
    Tiquete tiquete;    
    departamento Depa;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Tiquete getTiquete() {
        return tiquete;
    }

    public void setTiquete(Tiquete tiquete) {
        this.tiquete = tiquete;
    }

    public departamento getDepa() {
        return Depa;
    }

    public void setDepa(departamento Depa) {
        this.Depa = Depa;
    }

    public Denuncia(String descripcion, String fecha, String ubicacion, Usuario usuario, Tiquete tiquete, departamento Depa) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.usuario = usuario;
        this.tiquete = tiquete;
        this.Depa = Depa;
    }
    }
