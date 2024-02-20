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
public class JavaApplication3 {
        
    /**
     * @param args the command line arguments

     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        
        SQliteDatabase databaseSqlite = new SQliteDatabase();
        String dataBase = "jdbc:sqlite:C:\\sqlite\\db\\book.db";
       
               
        appFrame appFrame1 = new appFrame();
            JTable table = appFrame1.getTable();
          
            
        databaseSqlite.SqliteInit(dataBase,table);

        appFrame1.setVisible(true);
   
    }
    
}
