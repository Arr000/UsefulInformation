/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfException;

/**
 *
 * @author nene5
 */
public class Meeting {
    
    private int ID;
    private String plats;
    private String datum;
    private String tid;
    private String KundID;

    public Meeting(){}
    
    public Meeting(int id, String plats, String datum, String tid, int KundID)
    {
        this.ID = id;
        this.plats = plats;
        this.datum = datum;
        this.tid = tid;
        this.KundID = this.KundID;
    }
    
    
    public int getID()
    {
        return ID;
    }
    
    public String getPlats()
    {
        return plats;
    }
    
    public String getDate()
    {
        return datum;
    }
    
    public String getTid()
    {
        return tid;
    }
    
      public static int getMaxID() throws InfException
    {
        DataBasAcess.Connect();
        var maxIDQuery = "SELECT MAX(ID) FROM MEETING";
        var ID = DataBasAcess.getidb().fetchSingle(maxIDQuery);
        
        
        return Integer.parseInt(ID);
       
    }
     
    public ArrayList<Meeting> getMyMeetingsByID(int id)
    {
        try {
            DataBasAcess.Connect();
            var meetingsQuery = "SELECT * FROM MEETING WHERE EMPLOYEEID = " + id + " AND APPROVEDMEETING is null"; 
                                                                                                                
            var results = DataBasAcess.getidb().fetchRows(meetingsQuery);
            var meetings = new ArrayList<Meeting>();
            
            if(results == null )
            {
                return null;
            }
            
            for (HashMap<String, String> result : results)
            {
                
                if (result != null)
                {
                    var meetingID = Integer.parseInt(result.get("ID"));
                    var plats = result.get("PLATS");
                    var tid = result.get("TID");
                    var datum = result.get("DATUM");
                    var employeeID = Integer.parseInt(result.get("EMPLOYEEID"));
                    
                    var meeting = new Meeting(meetingID, plats, datum, tid, employeeID);
                    meetings.add(meeting);
   
                }
            }    
            return meetings;
        } catch (InfException ex) {
            Logger.getLogger(Meeting.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
