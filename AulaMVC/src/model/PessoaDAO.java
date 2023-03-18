/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author j_ped
 */
public class PessoaDAO {
    public Pessoa inserir (String email, String nome, String endereco, String telefone, int cpf){
        String sql = "INSERT INTO `usuario`(`login`, `senha`,`email`,`nome`,`cpf`,`endereco`,`telefone`) VALUES (?,?, ?, ?, ?, ?, ?)";
        Pessoa pessoa = new Pessoa();
        PreparedStatement pst;
       
        
        try{
            pst = Conexao.getConexao().prepareStatement(sql);
            
            pst.setString(1, "teste");
            pst.setString(2, "teste2");
            pst.setString(3, email);
            pst.setString(4, nome);
            pst.setInt(5, cpf);
            pst.setString(6, endereco);
            pst.setString(7, telefone);
            pst.execute();
            pst.close();
            
        } catch (SQLException e){
 
             System.out.println(e);
                       
        }
        
        return pessoa;
           
    }

    
}
