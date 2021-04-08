/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.DataBasAcess;
import GUI.Kund;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfException;

/**
 *
 * @author nene5
 */
public class KundDB {
    
    
    final String KundID = "ID";
    final String Namn = "NAME";
    final String DateOfBirth = "DATEOFBIRTH";
    final String PhoneNumber = "PHONENUMBER";
    final String KundTabell = "MYTABLE1";
    
    public KundDB(){
    }
        public ArrayList<Kund> getCustomers() {
        try {
            DataBasAcess.Connect();
            var customerQuery = "SELECT * FROM " + KundTabell;
            ArrayList<HashMap<String, String>> results = DataBasAcess.getidb().fetchRows(customerQuery);
            var customers = new ArrayList<Kund>();

            for (HashMap<String, String> result : results) {

                if (result != null) {
                    
                    var id = Integer.parseInt(result.get(KundID));
                    var name = result.get(Namn);
                    var phoneNumber = result.get(PhoneNumber);
                    var dateOfbirth = result.get(DateOfBirth);

                    var customer = new Kund(id, name, dateOfbirth, phoneNumber);
                    
                    customers.add(customer);
                }

            }
            return customers;
        } catch (InfException ex) {
            Logger.getLogger(KundDB.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Något gick fel");
        } 
        return null;
    }
        
    public void addCustomer(int id, String name, String dateOfBirth, String phonenumber) throws ParseException
    {
        try {
            DataBasAcess.Connect();
            var customer = new Kund(id, name, dateOfBirth, phonenumber);
            var addCustomerQuery = "INSERT INTO MYTABLE1 ("
                    + KundID + "," + Namn + "," + DateOfBirth + "," + PhoneNumber + ") Values (" + DataBasAcess.MakeDBString(String.valueOf(id)) + "," + DataBasAcess.MakeDBString(name) + "," + DataBasAcess.MakeDBString(dateOfBirth) + "," + DataBasAcess.MakeDBString(phonenumber) + 
                     ")";
            
            DataBasAcess.getidb().insert(addCustomerQuery);
        } catch (InfException ex) {
            Logger.getLogger(KundDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
     public ArrayList<Employee> getEmployees() {
        try {
            DataBasAcess.Connect();
            var employeeQuery = "SELECT * FROM EMPLOYEE";
            ArrayList<HashMap<String, String>> results = DataBasAcess.getidb().fetchRows(employeeQuery);
            var employees = new ArrayList<Employee>();

            for (HashMap<String, String> result : results) {

                if (result != null) {
                    
                    var id = Integer.parseInt(result.get("ID"));
                    var fornamn = result.get("FORNAMN");
                    var efternamn = result.get("EFTERNAMN");
                 
                    var employee = new Employee(id, fornamn, efternamn);
                    
                    employees.add(employee);
                }

            }
            return employees;
        } catch (InfException ex) {
            Logger.getLogger(KundDB.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Något gick fel");
        } 
        return null;
    }
     
     public Employee getCustomerbyID(int id)
     {
        try {
            DataBasAcess.Connect();
            var employeeQuery = "SELECT * FROM EMPLOYEE WHERE ID = " + id + "";
            HashMap<String, String> result = DataBasAcess.getidb().fetchRow(employeeQuery);
            
      
                if (result != null) {
                    
                    var employeeid = Integer.parseInt(result.get("ID"));
                    var fornamn = result.get("FORNAMN");
                    var efternamn = result.get("EFTERNAMN");
                 
                    var employee = new Employee(id, fornamn, efternamn);
            
                    return employee;
                    
         
            }
        } catch (InfException ex) {
            Logger.getLogger(KundDB.class.getName()).log(Level.SEVERE, null, ex);
        }
           return null;
     }
    
}

