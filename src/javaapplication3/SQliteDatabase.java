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

   
    private String data = null;
    private static JTable table;
    Connection connection;
    String dataBase = "jdbc:sqlite:C:\\sqlite\\db\\book.db";
    
    
    
    public void SqliteInit( JTable table) throws SQLException, ClassNotFoundException{

       SQliteDatabase.table = table;
       populateTable(table);

    }

    public void populateTable(JTable table) throws ClassNotFoundException, SQLException {

        connect();
        Statement stat = connection.createStatement();
        ResultSet rs = stat.executeQuery("SELECT *,* FROM booking");
        
        while(rs.next()){
            Object[] row = new Object[table.getColumnCount() + 1];
            for(int i = 1; i < table.getColumnCount() + 1; i++){
                row[i-1] = rs.getObject(i);        
            }
        ((DefaultTableModel) table.getModel()).insertRow(rs.getRow()-1, row);
        

        }

        rs.close();
        connection.close();

    }
    
    public void add(Object first_name,Object last_name,Object phone,Object adress,Object email) throws ClassNotFoundException, SQLException{
        
        int lastRowIndex = table.getRowCount() - 1;
        
        connect();
        PreparedStatement preStat;  
        String insertQuery = "INSERT INTO booking(first_name, last_name, phone, adress, email) VALUES (?, ?, ?, ?, ?)";
        preStat = connection.prepareStatement(insertQuery);
        preStat.setString(1, first_name.toString());
        preStat.setString(2, last_name.toString());
        preStat.setString(3, phone.toString());
        preStat.setString(4, adress.toString());
        preStat.setString(5, email.toString());
        preStat.executeUpdate();
        ((DefaultTableModel) table.getModel()).fireTableRowsInserted(lastRowIndex, lastRowIndex);
        ((DefaultTableModel) table.getModel()).fireTableDataChanged();


    }

    public void delete(String row) throws ClassNotFoundException, SQLException {
        connect();
        Statement stat = connection.createStatement();
        stat.executeUpdate("DELETE FROM booking WHERE id =" + row + ";");
        System.out.println(row);
        ((DefaultTableModel) table.getModel()).removeRow(Integer.parseInt(row) - 1);
        
        connection.close();

    }
    
    private void connect() throws ClassNotFoundException, SQLException{  
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection(dataBase);
    
    }
}
