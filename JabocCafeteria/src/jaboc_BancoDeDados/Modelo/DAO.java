/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jaboc_BancoDeDados.Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
/**
 *
 * @author guilh
 */
public interface DAO {
    
    default Connection conectar(){
        Connection conexao = null;
        
        try{
            Class.forName("org.postgresql.Driver");           
            conexao = DriverManager.getConnection("jdbc:postgresql://200.18.128.54:5432/Jaboc", "aula", "aula");           
        }
        catch(ClassNotFoundException err){
            System.out.println("Driver não encontrado!");
        }
        catch (SQLException err) {
            System.out.println("Não foi possível realizar a conexão - Causa do erro: "+ err.getMessage());
        }
        return conexao;
    }  
    
    
    public ResultSet selectTodos();
    public <T> ResultSet selectEspecifico(T param);
    public <T> boolean existeRegistro(T param);
    public boolean insert(Object o);
    public <T> boolean delete(T param);
    public <T> boolean update(Object o, T param);
    
}
