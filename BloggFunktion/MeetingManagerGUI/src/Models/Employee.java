/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author nene5
 */
public class Employee {
    
    private int id;
    private String firstname;
    private String lastname;
    private String username;
    
    public Employee(int id, String firstname, String Lastname, String username)
    {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
    }
    
    public int getID()
    {
        return id;
    }
    
    public String getFirstname()
    {
        return firstname;
    }
    
    public String getLastname()
    {
        return lastname;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public String getUsernameAndFirstName()
    {
        return username + " " + firstname;
    }
    
}
