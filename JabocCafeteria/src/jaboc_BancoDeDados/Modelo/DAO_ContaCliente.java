/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jaboc_BancoDeDados.Modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import jaboc_BancoDeDados.Controle.Logavel;
import jaboc_BancoDeDados.Controle.SenhaEditavel;
import jaboc_Classes.Conta;
import jaboc_Classes.Conta_Cliente;
import jaboc_Classes.Login;
import jaboc_Classes.Pessoa;
/**
 *
 * @author guilh
 */
public class DAO_ContaCliente implements DAO, Logavel, SenhaEditavel{
    private static Conta_Cliente dadosCliente_emMemoria;
    
    @Override
    public ResultSet selectTodos(){
        
        
        String comandoSelect = "SELECT C.cpfCliente, C.senhaClente, C.gastoTotal, P.nome, P.endereco, P.telefone FROM "
                    + "jaboc_servidor.Conta_Funcionario C, jaboc_servidor.Pessoa P WHERE  P.cpf = C.cpfCliente;";
        
         ResultSet resultadosSelect = null;
        
        try(Connection conexao = this.conectar()){
                        
            resultadosSelect = conexao.createStatement().executeQuery(comandoSelect);
            
        }catch(SQLException | NullPointerException error){
            System.out.println("Erro no selectTodos() da ContaCliente: ");
            error.printStackTrace();
        }
        
        return resultadosSelect;
    }
    
    @Override
    public <T> ResultSet selectEspecifico(T cpfCliente){
         
        String comandoSelect = "SELECT C.cpfCliente, C.senhaCliente, C.gastoTotal, P.nome, P.endereco, P.telefone FROM "
                    + "jaboc_servidor.Conta_Cliente C, jaboc_servidor.Pessoa P WHERE cpfCliente = '"+ cpfCliente+ "' AND P.cpf = C.cpfCliente;";
        
         ResultSet resultadoSelect = null;
        
        try(Connection conexao = this.conectar()){
                        
            resultadoSelect = conexao.createStatement().executeQuery(comandoSelect);
            
        }catch(SQLException | NullPointerException error){
            System.out.println("Erro no selectEspecifico(String cpfCliente) da ContaCliente: ");
            error.printStackTrace();
        }
        
        return resultadoSelect;
    }
    
    @Override
    public boolean insert(Object o){
        
        if(o instanceof Conta_Cliente){
            Conta_Cliente inserirCliente = (Conta_Cliente) o;
            
            String comandoInsert = "INSERT INTO jaboc_servidor.Conta_Cliente (cpfCliente, senhaCliente) VALUES ('"+ inserirCliente.getTitular().getCpf() + "',"
                    + " '"+ inserirCliente.getSenha() + "');";
            
            try(Connection conexao = this.conectar()){
            
                boolean inseriu = conexao.createStatement().executeUpdate(comandoInsert) > 0;
                
                if(inseriu){
                    this.armazenarDados_Cadastro(inserirCliente);
                }
                
                return inseriu;
                
            }catch(SQLException | NullPointerException error){
                 System.out.println("Erro no insert(Object o) da ContaCliente: ");
                 error.printStackTrace();
            }
        }
        
        return false;
    }
    
    @Override
    public <T> boolean existeRegistro(T cpfCliente){
             
        String comandoSelect = "SELECT cpfCliente FROM "
                    + "jaboc_servidor.Conta_Cliente WHERE cpfCliente = '"+ cpfCliente+ "';";
        
        
        try(Connection conexao = this.conectar()){
            System.out.println(conexao);
            ResultSet resultadoSelect = conexao.createStatement().executeQuery(comandoSelect);
            return resultadoSelect.next();
            
        }catch(SQLException | NullPointerException error){
            System.out.println("Erro no existeRegistro(String cpfCliente) da ContaCliente: "); 
            error.printStackTrace();
        }
        
        return false;
    }
    
    @Override
    public <T> boolean delete(T cpfCliente){
        
        String comandoDelete = "DELETE FROM jaboc_servidor.Conta_Cliente WHERE cpfCliente = '"+ cpfCliente +"';";
    
        try(Connection conexao = this.conectar()){
         
            return conexao.createStatement().executeUpdate(comandoDelete) > 0;
            
        }catch(SQLException | NullPointerException error){
            System.out.println("Erro no delete(String cpfCliente) da ContaCliente: ");
            error.printStackTrace();
        }
        
        return false;
    }
    
    @Override
    public <T> boolean update(Object o, T cpfCliente){
        
        if(o instanceof Conta_Cliente){
            
            Conta_Cliente updateCliente = (Conta_Cliente) o;
            
            String comandoUpdate = "UPDATE jaboc_servidor.Conta_Cliente SET "
                    + "senhaCliente = '" + updateCliente.getSenha()+ "'"
                    + "gastoTotal = " + updateCliente.getGastoTotal() + ""
                    + "WHERE cpfCliente = '"+ cpfCliente+ "';";
        
            try(Connection conexao = this.conectar()){
            
                return conexao.createStatement().executeUpdate(comandoUpdate) > 0;
                    
            }catch(SQLException | NullPointerException error){
                System.out.println("Erro no update(Object o, String cpfCliente) da ContaCliente: ");
                error.printStackTrace();
            }       
        }
        
        return false;    
    }
    
    @Override
    public boolean verificarSenha(String senhaInformada){
        
        String comandoSelect = "SELECT senhaCliente FROM jaboc_servidor.Conta_Cliente "
                + "WHERE cpfCliente = '"+ dadosCliente_emMemoria.getTitular().getCpf() + "';";
        
        try(Connection conexao = this.conectar()){
         
            ResultSet resultadoSelect = conexao.createStatement().executeQuery(comandoSelect);
            
            if(resultadoSelect.next()){
                String senhaFuncionario_FromSelect = resultadoSelect.getString("senhaCliente");
                
                return senhaFuncionario_FromSelect.equals(senhaInformada);
            }
        }catch(SQLException error){
            System.out.println("Erro no verificarSenha(String senhaInformada) da ContaCliente: "+ error.getMessage());
        }
        
        return false;
    }
    
    @Override
    public boolean atualizarSenha(String novaSenha, String cpfCliente){
        String comandoUpdate = "UPDATE jaboc_servidor.Conta_Cliente SET "
                + "senhaCliente = '" + novaSenha+ "' WHERE cpfCliente = '"+ cpfCliente+ "';";
        
        try(Connection conexao = this.conectar()){
            
            return conexao.createStatement().executeUpdate(comandoUpdate) > 0;
            
        }catch(SQLException | NullPointerException error){
             System.out.println("Erro no atualizarSenha(String novaSenha, String cpfCliente) da ContaCliente: ");
        }
        
        return false;
    }
  
    @Override
    public boolean login(Login clienteLogando){
        String comandoSelect = "SELECT senhaCliente FROM jaboc_servidor.Conta_Cliente "
                + "WHERE cpfCliente = '"+ clienteLogando.getCPF() + "';";
        
        try(Connection conexao = this.conectar()){
            
            ResultSet resultadoSelect = conexao.createStatement().executeQuery(comandoSelect);
            
            if(resultadoSelect.next()){
                String senhaCliente_FromSelect = resultadoSelect.getString("senhaCliente");

                if(senhaCliente_FromSelect.equals(clienteLogando.getSENHA())){
                    this.armazenarDados_Login(clienteLogando);
                    return true;
                }else{
                    return false;
                }
            }            
            
        }catch(SQLException | NullPointerException error){
            System.out.println("Erro no login(Login clienteLogando) da ContaCliente: ");
            error.printStackTrace();
        }
        
        return false;
    }
    
    @Override
    public boolean existeCpf(String cpfCliente){
        String comandoSelect = "SELECT cpfCliente FROM jaboc_servidor.Conta_Cliente "
                + "WHERE cpfCliente = '"+ cpfCliente + "';";
        
        try(Connection conexao = this.conectar()){
            ResultSet clienteExiste = conexao.createStatement().executeQuery(comandoSelect);
            return clienteExiste.next();
            
        }catch(SQLException |NullPointerException error){
            System.out.println("Erro no existeCpf(Login clienteLogando) da ContaCliente: ");
            error.printStackTrace();
        }
        
        return false;
    }
    
    private void armazenarDados_Login(Login clienteLogando){
        DAO_Pessoa dadosPessoa = new DAO_Pessoa();
        ResultSet selectPessoa = dadosPessoa.selectEspecifico(clienteLogando.getCPF());       
        ResultSet selectContaCliente = this.selectEspecifico(clienteLogando.getCPF());
        
        try{  
            selectPessoa.next();
            selectContaCliente.next();
            
            String nomePessoa = selectPessoa.getString("nome");
            String cpfPessoa = selectPessoa.getString("cpf");
            String enderecoPessoa = selectPessoa.getString("endereco");
            String telefonePessoa = selectPessoa.getString("telefone");
            
            Pessoa dados_tabelaPessoaBD = new Pessoa(nomePessoa, cpfPessoa, enderecoPessoa, telefonePessoa);
            
            String senhaContaCliente = selectContaCliente.getString("senhaCliente");
            double gastoTotal = selectContaCliente.getDouble("gastoTotal");
            
            dadosCliente_emMemoria = new Conta_Cliente(dados_tabelaPessoaBD, senhaContaCliente, gastoTotal);
        }catch(SQLException | NullPointerException error){
            System.out.println("Erro no armazenarDadosLogin(Login clienteLogando) da ContaCliente: ");
            error.printStackTrace();
        }
    }
    
    private void armazenarDados_Cadastro(Conta clienteCadastrado){
        dadosCliente_emMemoria = (Conta_Cliente) clienteCadastrado; 
    }
    
    public static Conta_Cliente getClienteLogado(){
        return dadosCliente_emMemoria; 
    }
    
    public static void limparDados_Memoria(){
        dadosCliente_emMemoria = null;
    }
}
