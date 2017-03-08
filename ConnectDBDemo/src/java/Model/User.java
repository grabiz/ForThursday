/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Win_64
 */
public class User implements Serializable{
    private String email;
    private String fn;
    private String ln;

    public User() {
        this.email ="";
        this.fn = "";
        this.ln = "";
    }

    public User(String email, String fn, String ln) {
        this.email = email;
        this.fn = fn;
        this.ln = ln;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public String getLn() {
        return ln;
    }

    public void setLn(String ln) {
        this.ln = ln;
    }

    
}
