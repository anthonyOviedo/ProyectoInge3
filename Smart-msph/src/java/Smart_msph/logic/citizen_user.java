/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Smart_msph.logic;

/**
 *
 * @author leine
 */
public class citizen_user {
    
    private int id;
    private String username;
    private String password;
    private String role;
    private Ciudadano citizen_id;

    public citizen_user() {
    }

    public citizen_user(String username, String password, String role, Ciudadano citizen_id) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.citizen_id = citizen_id;
    }

    
    
    public citizen_user(int id, String username, String password, String role, Ciudadano citizen_id) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.citizen_id = citizen_id;
    }

    public Ciudadano getCitizen_id() {
        return citizen_id;
    }

    public void setCitizen_id(Ciudadano citizen_id) {
        this.citizen_id = citizen_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    
    
    
    
    
}
