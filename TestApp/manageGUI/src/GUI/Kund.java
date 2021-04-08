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
public class Kund {

    private int ID;
    private String Namn;
    private String Telefon;
    private String DateofBirth;

     
    
    public Kund(int ID, String namn, String dateOfBirth, String Telefon)
    {
        this.ID= ID;
        this.Namn = namn;
        this.Telefon = Telefon;
        this.DateofBirth = dateOfBirth;
       
    }
    
     public int getID()
    {   
        return this.ID;
    }
    
     public String getNamn()
    {   
        return this.Namn;
    }
    
    public String getTelefon()
    {   
        return this.Telefon;
    }
    
     public String getDateOfBirth()
    {   
        return this.DateofBirth;
    }
   
   
     
     
   
    
}
