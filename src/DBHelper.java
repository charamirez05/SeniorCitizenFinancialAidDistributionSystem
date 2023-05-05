/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Charmaine Mae I. Ramirez
 */


import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Time;
import java.sql.Date;

        
public class DBHelper {
    Connection con =null;
    Statement stmt =null;
    
    public void ConnectDB() throws Exception{
       // con = DriverManager.getConnection("jdbc:derby://localhost:1527/dbSeniorCitizenFinancialAidDistributionSystem;create=true", "", "");
       //con = DriverManager.getConnection(url, user, password)
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/dbSeniorCitizenFinancialAidDistributionSystem;create=true");
       System.out.println("Connected to Database");
    }
    
    
    public boolean insertUserInfomationRecord(int seniorIDNum, String votersIDNum, String fname, String mname, String lname, String gender, boolean vaxStatus, int birthDay, String birthMonth, int birthYear, int houseNum, String street, String baranggay, String city, String prov, int zipCode, String contactNum){
        boolean flag = false;
        try {
            stmt = con.createStatement();
            String sql = "INSERT INTO TBLUSERINFORMATION VALUES ("+seniorIDNum+",'"+votersIDNum+"','"+fname+"','"+mname+"','"+lname+"','"+gender+"',"+vaxStatus+","+birthDay+",'"+birthMonth+"',"+birthYear+","+houseNum+",'"+street+"','"+baranggay+"','"+city+"','"+prov+"',"+zipCode+",'"+contactNum+"')";
            //for int "+variableName+" for string '"+variableName+"'
            if(stmt.executeUpdate(sql)!= 0) {
                 flag=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag; 
    }
    
    public boolean insertUserCredentialsRecord(int seniorIDNum, String username, String password){
        boolean flag = false;
        try {
            stmt = con.createStatement();
            String sql = "INSERT INTO TBLUSERLOGINCREDENTIALS VALUES ("+seniorIDNum+",'"+username+"','"+password+"')";
            //for int "+variableName+" for string '"+variableName+"'
            if(stmt.executeUpdate(sql)!= 0) {
                 flag=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag; 
    }
    
    public boolean insertAdminInfomationRecord(int IDNum, String fname, String mname, String lname){
        boolean flag = false;
        try {
            stmt = con.createStatement();
            String sql = "INSERT INTO TBLADMININFORMATION VALUES ("+IDNum+",'"+fname+"','"+mname+"','"+lname+"')";
            //for int "+variableName+" for string '"+variableName+"'
            if(stmt.executeUpdate(sql)!= 0) {
                 flag=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag; 
    }
    
    public boolean insertAdminCredentialsRecord(int seniorIDNum, String username, String password){
        boolean flag = false;
        try {
            stmt = con.createStatement();
            String sql = "INSERT INTO TBLADMINLOGINCREDENTIALS VALUES ("+seniorIDNum+",'"+username+"','"+password+"')";
            //for int "+variableName+" for string '"+variableName+"'
            if(stmt.executeUpdate(sql)!= 0) {
                 flag=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag; 
    }
    
    public boolean insertUserEventsSchedules(int seniorIDNum, Date date, Time time, String venue, String eventName){
        boolean flag = false;
        try {
            stmt = con.createStatement();
            String sql = "INSERT INTO TBLUSEREVENTSSCHEDULES VALUES ("+seniorIDNum+",'"+date+"', '"+time+"', '"+venue+"','"+eventName+"')";
            //for int "+variableName+" for string '"+variableName+"' 
            if(stmt.executeUpdate(sql)!= 0) {
                 flag=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag; 
    }
    
    public ResultSet displayAllUserInformationRecords(){
        ResultSet rs= null;
        try {
            stmt = con.createStatement();
            String sql = "Select * from TBLUSERINFORMATION";
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
        public ResultSet displayAllUserCredentialsRecords(){
        ResultSet rs= null;
        try {
            stmt = con.createStatement();
            String sql = "Select * from TBLUSERLOGINCREDENTIALS";
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
        
    public ResultSet displayAllAdminCredentialsRecords(){
        ResultSet rs= null;
        try {
            stmt = con.createStatement();
            String sql = "Select * from TBLADMINLOGINCREDENTIALS";
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    
    public ResultSet displayBySeniorCitizenIDNum(int seniorIDNum){
        ResultSet rs= null;
        try {
            stmt = con.createStatement();
            String sql = "Select * from TBLUSERINFORMATION where seniorcitizenIDnum = "+seniorIDNum+"";
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet displayByBirthday(){
        ResultSet rs= null;
        try {
            stmt = con.createStatement();
            String sql = "Select seniorcitizenIDnum, birthmonth, birthday, birthyear from TBLUSERINFORMATION";
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet displayUserSchedules(int seniorIDNum){
        ResultSet rs= null;
        try {
            stmt = con.createStatement();
            String sql = "Select * from TBLUSEREVENTSSCHEDULES where seniorcitizenIDnum = "+seniorIDNum+"";
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    
    public boolean UpdateRecord(int seniorIDNum, String votersIDNum, String fname, String mname, String lname, String gender, boolean vaxStatus, int birthDay, String birthMonth, int birthYear, int houseNum, String street, String baranggay, String city, String prov, int zipCode, String contactNum){
        boolean flag = false;
        try {
            stmt = con.createStatement();
            String sql = "UPDATE TBLUSERINFORMATION SET votersidnum = '"+votersIDNum+"', firstname='"+fname+"', middlename='"+mname+"', lastname= '"+lname+"', gender= '"+gender+"', vaccinationstatus = "+vaxStatus+", birthday= "+birthDay+", birthmonth = '"+birthMonth+"', birthyear = "+birthYear+", houseno = "+houseNum+", street = '"+street+"', baranggay = '"+baranggay+"', city = '"+city+"', province = '"+prov+"', zipcode = "+zipCode+", contactnum = '"+contactNum+"' where seniorcitizenIDnum = "+seniorIDNum+"";
            //for int "+variableName+" for string '"+variableName+"'
            if(stmt.executeUpdate(sql)!= 0) {
                 flag=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag; 
    
    }
    
    
    public boolean UpdateUserSchedule(int seniorIDNum, Time time){
        boolean flag = false;
        try {
            stmt = con.createStatement();
            String sql = "UPDATE TBLUSEREVENTSSCHEDULES SET SCHEDULETIME='"+time+"' where seniorcitizenIDnum = "+seniorIDNum+"";
            //for int "+variableName+" for string '"+variableName+"'
            if(stmt.executeUpdate(sql)!= 0) {
                 flag=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag; 
    
    }
    
    public boolean deleteUserInformationRecord(int seniorIDNum){
        boolean flag = false;
        try {
            stmt = con.createStatement();
            String sql = "DELETE FROM TBLUSERINFORMATION where seniorcitizenIDnum = "+seniorIDNum+"";
            //for int "+variableName+" for string '"+variableName+"'
            if(stmt.executeUpdate(sql)!= 0) {
                 flag=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag; 
    }
    
    public boolean deleteUserCredentialsRecord(int seniorIDNum){
        boolean flag = false;
        try {
            stmt = con.createStatement();
            String sql = "DELETE FROM TBLUSERLOGINCREDENTIALS where seniorcitizenIDnum = "+seniorIDNum+"";
            //for int "+variableName+" for string '"+variableName+"'
            if(stmt.executeUpdate(sql)!= 0) {
                 flag=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag; 
    
    }
    
    public boolean deleteUserScheduleRecord(int seniorIDNum){
        boolean flag = false;
        try {
            stmt = con.createStatement();
            String sql = "DELETE FROM TBLUSEREVENTSSCHEDULES where seniorcitizenIDnum = "+seniorIDNum+"";
            //for int "+variableName+" for string '"+variableName+"'
            if(stmt.executeUpdate(sql)!= 0) {
                 flag=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag; 
    
    }
    
    public void DisconnectDB(){
         try {
            if (con != null)
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
 
}
