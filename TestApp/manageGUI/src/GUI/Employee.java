/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author nene5
 */
public class Employee {
    
    private int ID;
    private String forNamn;
    private String efterNamn;
    private int kundId;
    
    public Employee(int id, String fornamn, String efternamn)
    {
        this.ID = id;
        this.forNamn = fornamn;
        this.efterNamn = efternamn;   
    }
    
    public Employee(int id, String fornamn, String efternamn, int KundId)
    {
        this.ID = id;
        this.forNamn = fornamn;
        this.efterNamn = efternamn;   
        this.kundId = KundId;
    }

    public int getID()
    {
        return this.ID;
    }
    
    public String getforNamn()
    {
        return this.forNamn;
    }
    
    public String getefterNamn()
    {
        return this.efterNamn;
    }
}
