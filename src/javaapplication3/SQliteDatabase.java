/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author stefa
 */
public final class SQliteDatabase {

   
    private String data;
    private JTable table;
    private String[] columns = {"id","First Name","Last Name", "Phone", "Address", "Email"};
    
    
    
    public void SqliteInit(String data, JTable table) throws SQLException, ClassNotFoundException{
       this.data = data;
       this.table = table;
       SQliteDatabase(data);
       populateTable(table);

    }

    public void SQliteDatabase(String data) throws SQLException, ClassNotFoundException  {   
      Connection connection ;
      Statement stat;
      String insertQuery = "INSERT INTO booking(first_name, last_name, phone, adress, email) VALUES (?, ?, ?, ?, ?)";
      PreparedStatement preStat;      
      Class.forName("org.sqlite.JDBC");
      connection = DriverManager.getConnection(data);
      if ( connection!= null)
         System.out.println("Connection to SQLite has been established.");
        /*   preStat = connection.prepareStatement(insertQuery);
      preStat.setString(1,"Stefan");   
      preStat.setInt(3,1234567);
      preStat.setString(4,"Sail fish 2323");
      preStat.setString(5,"Stefan.Almeida@gmail.com");
      preStat.executeUpdate();

      preStat.close();*/
        connection.close();
    }

    public void populateTable(JTable table) throws ClassNotFoundException, SQLException {
       
  
        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection(data);
        Statement stat = connection.createStatement();
        ResultSet rs = stat.executeQuery("SELECT id,* FROM booking");
        
        while(rs.next()){
            Object[] row = new Object[columns.length];
            for(int i = 1; i < columns.length; i++){
                row[i-1] = rs.getObject(i);        
            }
        ((DefaultTableModel) table.getModel()).insertRow(rs.getRow()-1, row);

        }

        rs.close();
        connection.close();

    }
}
