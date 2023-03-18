
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    
    public Usuario acesso (String login, String senha){
        String sql = "Select * FROM usuario WHERE login = ? AND senha= ?";
        Usuario usuario = new Usuario();
        
        PreparedStatement pst;
        ResultSet rs;
        
        try{
            pst = Conexao.getConexao().prepareStatement(sql);
            pst.setString(1, login);
            pst.setString(2, senha);
            rs = pst.executeQuery();
                    
            while (rs.next()){
                usuario.setId(rs.getInt("id"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha (rs.getString("senha"));
                usuario.setEmail(rs.getString("email"));
            }     
            rs.close();
            pst.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Login ou senha incorretos!");
             System.out.println(e);
                       
        }
        return usuario;
           
    }

}
