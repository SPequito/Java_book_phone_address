/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author stefa
 */
public class Main {
        
    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException

     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        
        SQliteDatabase databaseSqlite = new SQliteDatabase();

            
            appFrame appFrame1 = new appFrame();
            JTable table = appFrame1.getTable();
            
            
            appFrame1.setVisible(true);
            databaseSqlite.SqliteInit(table);
                
   
    }
    
}
