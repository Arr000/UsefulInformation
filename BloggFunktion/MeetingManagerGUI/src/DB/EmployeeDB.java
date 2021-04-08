/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Models.Employee;
import Models.IEmployeeDAL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfException;

/**
 *
 * @author nene5
 */
public class EmployeeDB implements IEmployeeDAL{
    
      public ArrayList<Employee> getAllEmployees() {
        
        try {
            DatabasAcess.Connect();
            var employeeList = new ArrayList<Employee>();
            var getAllEmployeesQuery = "SELECT * FROM EMPLOYEE ";
            var results = DatabasAcess.getidb().fetchRows(getAllEmployeesQuery);
            
            for(HashMap<String, String> result : results)
            {
                var id = Integer.parseInt(result.get("ID"));
                var firstname = result.get("FIRSTNAME");
                var lastname = result.get("LASTNAME");
                var anvandarnamn = result.get("ANVANDARNAMN");
                var losenord = result.get("LOSERNORD");
                
                var employe = new Employee(id, firstname, lastname, anvandarnamn);
                employeeList.add(employe);
                  
            }
          return employeeList;
        } catch (InfException ex) {
            Logger.getLogger(MeetingDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
      
      

    
    public Employee getEmployeeByUserName(String username) {
        
         try {
            DatabasAcess.Connect();
            var getEmployeeByUserName = "SELECT * FROM EMPLOYEE WHERE ANVANDARNAMN = " + DatabasAcess.MakeDBString(username);
            var result = DatabasAcess.getidb().fetchRow(getEmployeeByUserName);

            var id = Integer.parseInt(result.get("ID"));
            var firstname = result.get("FIRSTNAME");
            var lastname = result.get("LASTNAME");
            var username1 = result.get("ANVANDARNAMN");
            
            var employee = new Employee(id, firstname, lastname, username1);
            
            return employee;
         
        } catch (InfException ex) {
            Logger.getLogger(MeetingDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public Employee getEmployeeByID(int id) {
        
         try {
            DatabasAcess.Connect();
            var getEmployeeByUserName = "SELECT * FROM EMPLOYEE WHERE ID = " + id;
            var result = DatabasAcess.getidb().fetchRow(getEmployeeByUserName);

            var employeeid = Integer.parseInt(result.get("ID"));
            var firstname = result.get("FIRSTNAME");
            var lastname = result.get("LASTNAME");
            var username1 = result.get("ANVANDARNAMN");
            
            var employee = new Employee(employeeid, firstname, lastname, username1);
            
            return employee;
         
        } catch (InfException ex) {
            Logger.getLogger(MeetingDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<Employee> getAllEmployeesExceptOne(String username) {
        
          try {
              DatabasAcess.Connect();
              var employeeList = new ArrayList<Employee>();
              var getAllEmployeesExceptOneQuery = "SELECT * FROM EMPLOYEE WHERE ANVANDARNAMN != " + DatabasAcess.MakeDBString(username);
              var results = DatabasAcess.getidb().fetchRows(getAllEmployeesExceptOneQuery);
              
              for(HashMap<String, String> result : results)
            {
                var id = Integer.parseInt(result.get("ID"));
                var firstname = result.get("FIRSTNAME");
                var lastname = result.get("LASTNAME");
                var anvandarnamn = result.get("ANVANDARNAMN");
                var losenord = result.get("LOSERNORD");
                
                var employe = new Employee(id, firstname, lastname, anvandarnamn);
                employeeList.add(employe);
                  
            }
          return employeeList;
              
          } catch (InfException ex) {
              Logger.getLogger(EmployeeDB.class.getName()).log(Level.SEVERE, null, ex);
          }
          return null;
}
}
