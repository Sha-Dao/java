/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
    private static Connection conexao;
    
    
 public static Connection getConexao(){
     if (conexao==null){
         try{
             conexao= DriverManager.getConnection("jdbc:mysql://localhost:3306/usuario", "root", "#Moriarty4419@");
         }catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados!");
             System.out.println(e);
         }
     }
     return conexao;
         
}
}

