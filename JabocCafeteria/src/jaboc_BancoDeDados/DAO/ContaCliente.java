/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jaboc_BancoDeDados.DAO;

import jaboc_BancoDeDados.ComandosSQL;
import jaboc_Classes.Conta_Cliente;
import java.sql.*;
/**
 *
 * @author guilh
 */
public class ContaCliente implements ComandosSQL{
    
    @Override
    public ResultSet selectTodos(){
        
        String comandoSelect = "SELECT C.cpfCliente, C.senhaClente, C.gastoTotal, P.nome, P.endereco, P.telefone FROM "
                    + "jaboc_servidor.Conta_Funcionario C, jaboc_servidor.Pessoa P WHERE  P.cpf = C.cpfCliente;";
        
         ResultSet resultadosSelect = null;
        
        try{
            
            Connection conexao = this.conectar();
            resultadosSelect = conexao.createStatement().executeQuery(comandoSelect);
            
        }catch(SQLException error){
            System.out.println("Erro no selectTodos() da ContaCliente: "+ error.getMessage());   
        }
        
        return resultadosSelect;
    }
    
    @Override
    public <T> ResultSet selectEspecifico(T cpfCliente){
         
        String comandoSelect = "SELECT C.cpfCliente, C.senhaClente, C.gastoTotal, P.nome, P.endereco, P.telefone FROM "
                    + "jaboc_servidor.Conta_Funcionario C, jaboc_servidor.Pessoa P WHERE cpfCliente = '"+ cpfCliente+ "' AND P.cpf = C.cpfCliente;";
        
         ResultSet resultadoSelect = null;
        
        try{
            
            Connection conexao = this.conectar();
            resultadoSelect = conexao.createStatement().executeQuery(comandoSelect);
            
        }catch(SQLException error){
            System.out.println("Erro no selectEspecifico(String cpfCliente) da ContaCliente: "+ error.getMessage());   
        }
        
        return resultadoSelect;
    }
    
    @Override
    public boolean insert(Object o){
        
        if(o instanceof Conta_Cliente){
            Conta_Cliente inserirCliente = (Conta_Cliente) o;
            
            String comandoInsert = "INSERT INTO jaboc_servidor.Conta_Cliente (cpfCliente, senhaCliente) VALUES ('"+ inserirCliente.getTitular().getCpf() + "',"
                    + " '"+ inserirCliente.getSenha() + "');";
            
            try{
            
                Connection conexao = this.conectar();
                return conexao.createStatement().executeUpdate(comandoInsert) > 0;
                
            }catch(SQLException error){
                 System.out.println("Erro no insert(Object o) da ContaCliente: "+ error.getMessage());   
            }
        }
        
        return false;
    }
    
    public <T> boolean existeRegistro(T cpfCliente){
             
        String comandoSelect = "SELECT C.cpfCliente, C.senhaClente, C.gastoTotal, P.nome, P.endereco, P.telefone FROM "
                    + "jaboc_servidor.Conta_Funcionario C, jaboc_servidor.Pessoa P WHERE cpfCliente = '"+ cpfCliente+ "' AND P.cpf = C.cpfCliente;";
        
        
        try{
            
            Connection conexao = this.conectar();
            ResultSet resultadoSelect = conexao.createStatement().executeQuery(comandoSelect);
            return resultadoSelect.next();
            
        }catch(SQLException error){
            System.out.println("Erro no selectEspecifico(String cpfCliente) da ContaCliente: "+ error.getMessage());   
        }
        
        return false;
    }
    
    @Override
    public <T> boolean delete(T cpfCliente){
        
        String comandoDelete = "DELETE FROM jaboc_servidor.Conta_Cliente WHERE cpfCliente = '"+ cpfCliente +"';";
    
        try{
         
            Connection conexao = this.conectar();
            return conexao.createStatement().executeUpdate(comandoDelete) > 0;
            
        }catch(SQLException error){
            System.out.println("Erro no delete(String cpfCliente) da ContaCliente: "+ error.getMessage());
        }
        
        return false;
    }
    
    @Override
    public <T> boolean update(Object o, T cpfCliente){
        
        if(o instanceof Conta_Cliente){
            
            Conta_Cliente updateCliente = (Conta_Cliente) o;
            
            String comandoUpdate = "UPDATE jaboc_servidor.Conta_Cliente SET "
                    + "senhaCliente = '" + updateCliente.getSenha() + "';";
        
            try{
            
                Connection conexao = this.conectar();
                return conexao.createStatement().executeUpdate(comandoUpdate) > 0;
                    
            }catch(SQLException error){
                System.out.println("Erro no update(Object o, String cpfCliente) da ContaCliente: "+ error.getMessage());
            }       
        }
        
        return false;    
    }
}