/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author colchhina
 */
@Named(value = "data")
@ApplicationScoped
public class Data {

    /**
     * Creates a new instance of Data
     */
    public Data() {
    }
    private String username;
    private String email;
    private Long phone;
    /**
     * Creates a new instance of Data
     */
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public Long getPhone() {
        return phone;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhone(Long phone){
        this.phone = phone;
    }
    
}

    

