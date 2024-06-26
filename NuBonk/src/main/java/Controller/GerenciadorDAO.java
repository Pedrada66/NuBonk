/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Investimentos;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author pedro
 */
public class GerenciadorDAO {
    static String url = "jdbc:postgresql://localhost:5432";
    static String driver = "org.postgresql.Driver";
    static String user = "postgres";
    static String password = "3523";
    
    public GerenciadorDAO() {
    }
    
    //manipulações SQL
    public void inserirInvestimento()
    {
        Connection conn = null;
        PreparedStatement ps = null;
        
        try{
            Class.forName(driver);
        }catch(Exception ex){
              System.out.println(ex);
        }
        
        try{
            conn = DriverManager.getConnection(url,user,password);
            String sql1 = "INSERT INTO Investimento(nome, codigo, valor) VALUES(?,?,?,?);";
            ps = conn.prepareStatement(sql1);
            ps.setString(1,"PEPSICO");
            ps.setString(2,"PEPB34");
            ps.setString(3,"34.00");
            ps.execute();
            ps.close();
            conn.close();
     
        }catch(Exception ex){
              System.out.println(ex);
        }
        
    }
}
