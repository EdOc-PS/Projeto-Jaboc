/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package jaboc_BancoDeDados.interfaces;

import jaboc_Classes.Login;
/**
 *
 * @author guilh
 */
public interface Logavel{
    public boolean login(Login logavel);
    public boolean existeCpf(String cpf);
    public void armazenarEmMemoria_dadosContaLogada(Login logavel);
        
}
