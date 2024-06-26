/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Cliente;
import Model.Investimentos;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
    public void inserirInvestimento(){
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
    public List<Investimentos> listarInvestimentos() {
        List<Investimentos> investimentos = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName(driver);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        try {
            conn = DriverManager.getConnection(url, user, password);
            String sql = "SELECT * FROM Investimento;";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                String nome = rs.getString("nome");
                String codigo = rs.getString("codigo");
                float valor = rs.getFloat("valor");
                investimentos.add(new Investimentos(nome, codigo, valor));
            }

            rs.close();
            ps.close();
            conn.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return investimentos;
    }
    public void inserirCliente(Cliente c){
        Connection conn = null;
        PreparedStatement ps = null;
        
        try{
            Class.forName(driver);
        }catch(Exception ex){
              System.out.println(ex);
        }
        
        try{
            conn = DriverManager.getConnection(url,user,password);
            String sql1 = "INSERT INTO public.cliente(\n" +
                        " nome, endereco, cpf, telefone, genero, datanascimento, email,"
                         + " senha, saldo, qtdinvestimento)     "
                         + "VALUES(?,?,?,?,?,?,?,?,?,?);";
            ps = conn.prepareStatement(sql1);
            ps.setString(1,c.getNome());
            ps.setString(2,c.getEndereco());
            ps.setString(3,c.getCpf());
            ps.setString(4,c.getTelefone());
            ps.setString(5,c.getGenero());
            ps.setString(6,c.getDataNascimento());
            ps.setString(7,c.getEmail());
            ps.setString(8,c.getSenha());
            ps.setString(9,String.valueOf(c.getSaldo()));
            ps.setString(10,String.valueOf(c.getQuantidadeInvestimento()));
            ps.execute();
            ps.close();
            conn.close();
     
        }catch(Exception ex){
              System.out.println(ex);
        }
        
    }
    public List<Cliente> listarCliente() {
        List<Cliente> clientes = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName(driver);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        try {
            conn = DriverManager.getConnection(url, user, password);
            String sql = "SELECT * FROM Cliente;";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                String nome = rs.getString("nome");
                String endereco = rs.getString("endereco");
                String cpf = rs.getString("cpf");
                String telefone = rs.getString("telefone");
                String genero = rs.getString("genero");
                String dataNascimento = rs.getString("datanascimento");
                String email = rs.getString("email");
                String senha = rs.getString("senha");
                float saldo = rs.getFloat("saldo");
                int qtdinvestimento = rs.getInt("qtdinvestimento");
                clientes.add(new Cliente(nome, endereco, cpf, telefone,
                        genero, dataNascimento, email,senha, saldo, qtdinvestimento));
            }

            rs.close();
            ps.close();
            conn.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return clientes;
    }
    public void removerCliente(Cliente c){
        Connection conn = null;
        PreparedStatement ps = null;
        
        try{
            Class.forName(driver);
        }catch(Exception ex){
              System.out.println(ex);
        }
        
        try{
            conn = DriverManager.getConnection(url,user,password);
            String sql1 = "DELETE FROM public.cliente WHERE cpf = ?;";
            ps = conn.prepareStatement(sql1);
            ps.setString(1,c.getCpf());
            ps.execute();
            ps.close();
            conn.close();
     
        }catch(Exception ex){
              System.out.println(ex);
        }
        
    }
    public void alterarCliente(Cliente c){
        Connection conn = null;
        PreparedStatement ps = null;
        
        try{
            Class.forName(driver);
        }catch(Exception ex){
              System.out.println(ex);
        }
        
        try{
            conn = DriverManager.getConnection(url,user,password);
            String sql1 = "UPDATE public.cliente SET endereco = ? WHERE cpf = ?;";
            ps = conn.prepareStatement(sql1);
            ps.setString(1,c.getEndereco());
            ps.setString(2,c.getCpf());
            int rowsAffected = ps.executeUpdate();
            ps.execute();
            ps.close();
            conn.close();
     
        }catch(Exception ex){
              System.out.println(ex);
        }
        
    }
}
