package GUI;


import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBasAcess{
     
    private static InfDB idb;
    //Denna metod kopplar upp sig mot databasen.
    public static void Connect()
    {
        try
        {
            if(idb == null)
            {
                idb = new InfDB("C:\\db\\TEST.FDB");  
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }
    //Denna metod returnerar databasen.
    public static InfDB getidb()
    {
        return idb;
    }
    
    
    public static String MakeDBString(String s)
    {
        return "'" + s + "'";
    }
    
    public static int getMaxID() throws InfException
    {
        DataBasAcess.Connect();
        var maxIDQuery = "SELECT MAX(ID) FROM KOMMENTAR";
        var ID = DataBasAcess.getidb().fetchRow(maxIDQuery);
        
        var maxID = ID.get("ID") + 1;
        
        return Integer.parseInt(maxID);
       
        }
    
    public static ArrayList<String> getAllComments() throws InfException
    {
        DataBasAcess.Connect();
        var getAllCommentsQuery = "SELECT NAMN FROM KOMMENTAR";;
        ArrayList<HashMap<String, String>> results;

          results = DataBasAcess.getidb().fetchRows(getAllCommentsQuery);
           var comments = new ArrayList<String>();

            for (HashMap<String, String> result : results) {

                if (result != null) {
                
                    var name = result.get("NAMN");
        
                    comments.add(name);
                }
            }
                return comments;
    }


}



            
            
    

