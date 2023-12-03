/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jaboc_BancoDeDados.DAO;

import jaboc_BancoDeDados.interfaces.Logavel;
import jaboc_BancoDeDados.interfaces.ComandosSQL;
import java.sql.*;
import jaboc_Classes.Conta_Cliente;
/**
 *
 * @author guilh
 */
public class DAO_ContaCliente implements ComandosSQL, Logavel{
    private Conta_Cliente objetoCliente;
    
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
    
    @Override
    public <T> boolean existeRegistro(T cpfCliente){
             
        String comandoSelect = "SELECT C.cpfCliente, C.senhaClente, C.gastoTotal, P.nome, P.endereco, P.telefone FROM "
                    + "jaboc_servidor.Conta_Funcionario C, jaboc_servidor.Pessoa P WHERE cpfCliente = '"+ cpfCliente+ "' AND P.cpf = C.cpfCliente;";
        
        
        try{
            
            Connection conexao = this.conectar();
            ResultSet resultadoSelect = conexao.createStatement().executeQuery(comandoSelect);
            return resultadoSelect.next();
            
        }catch(SQLException error){
            System.out.println("Erro no existeRegistro(String cpfCliente) da ContaCliente: "+ error.getMessage());   
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
    
    @Override
    public String alertaErro(Object o, String frase){
        if(o instanceof Conta_Cliente){
            Conta_Cliente especificarErro = (Conta_Cliente) o;

            return especificarErro.getTitular().getNome() + " " + frase;
        }
        
        return "Erro";
    }
    
    @Override
    public boolean login(String cpfLogin_Cliente, String senhaLogin_Cliente){
        String comandoSelect = "SELECT senhaCliente FROM jaboc_servidor.Conta_Cliente "
                + "WHERE cpfCliente = '"+ cpfLogin_Cliente + "';";
        
        try{
            
            Connection conexao = this.conectar();
            ResultSet resultadoSelect = conexao.createStatement().executeQuery(comandoSelect);
            
            if(resultadoSelect.next()){
                String senhaCliente_FromSelect = resultadoSelect.getString("senhaCliente");

                return  senhaCliente_FromSelect.equals(senhaLogin_Cliente);
            }            
            
        }catch(SQLException error){
            System.out.println("Erro no login(String cpfCliente, String senhaCliente) da ContaCliente: "+ error.getMessage());
        }
        
        return false;
    }
}
