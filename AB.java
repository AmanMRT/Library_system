
import java.sql.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 55555555555555555555
 */
public class AB {
    public static void main(String[] bb)
    { 
     try
     {
     Class.forName("org.gjt.mm.mysql.Driver");
     Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1","root","");
     PreparedStatement stmt=con.prepareStatement("create database Library");
     stmt.executeUpdate();
     stmt=con.prepareStatement("use Library");
     stmt.executeUpdate();
     stmt=con.prepareStatement("CREATE TABLE USERS(ulogin varchar(20),upassword varchar(20))");
     stmt.executeUpdate();
     stmt=con.prepareStatement("CREATE TABLE BOOKS(bcode int,Tittle varchar(30),Authors varchar(30),Categeory varchar(40),Publisher varchar(30),Edition int,Status varchar(1))");
     stmt.executeUpdate();
     stmt=con.prepareStatement("CREATE TABLE MEMBERS(Mid int,Name varchar(20),Address varchar(40),City varchar(20),State varchar(20),Mobile long)");
     stmt.executeUpdate();
     stmt=con.prepareStatement("CREATE TABLE TRANSATIONS(Tid int,Bcode int,Mid int,IssueDate Date,ReturnDate Date,ARDate Date)");
     stmt.executeUpdate();
     System.out.println("DONE");
     }catch(Exception ee){System.out.println(ee);} 
    }
}
