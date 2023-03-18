/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import controller.ControlePrincipal;
import javax.swing.JOptionPane;
import model.Usuario;
import model.UsuarioDAO;
import view.TelaLogin;

public class ServiceLogin {
    
    private TelaLogin telaLogin;
    private UsuarioDAO usuarioDAO;

    public ServiceLogin(TelaLogin tela) {
        this.telaLogin = tela;
        this.usuarioDAO = new UsuarioDAO();
    }
    public void entrar() {
        Usuario usuarioLogin = usuarioDAO.acesso(telaLogin.getjTextFieldUsuario().getText(), String.valueOf(telaLogin.
                getjPasswordField2().getPassword()));
        
        if (usuarioLogin.getId() > 0) {
            
            JOptionPane.showMessageDialog(telaLogin,"Login feito com sucesso!");
            telaLogin.dispose();
            ControlePrincipal cp = new ControlePrincipal();
        
    }else{
            JOptionPane.showMessageDialog(telaLogin,"Dados incorretos!");
            
        }
    }
    
    
    
    
}
