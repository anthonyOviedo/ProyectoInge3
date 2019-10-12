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
public class Usuario {

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombreUsuario=" + nombreUsuario + ", contrasenya=" + contrasenya + ", Rol=" + Rol + ", ciudadano=" + ciudadano + ", funcionario=" + funcionario + '}';
    }

    private int id;
    private String nombreUsuario;
    private String contrasenya;
    private String Rol;
    private Ciudadano ciudadano;
    private Funcionario funcionario;

    public Usuario() {
    }

    public Usuario(int id, String nombreUsuario, String contrasenya, String Rol, Ciudadano ciudadano, Funcionario funcionario) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.contrasenya = contrasenya;
        this.Rol = Rol;
        this.ciudadano = ciudadano;
        this.funcionario = funcionario;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public Ciudadano getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(Ciudadano ciudadano) {
        this.ciudadano = ciudadano;
    }
  }
