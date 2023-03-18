/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import service.ServiceLogin;
import view.TelaLogin;

/**
 *
 * @author curso
 */
public class ControleLogin implements ActionListener{
    private final TelaLogin telaLogin;
    private ServiceLogin serviceLogin;

    public ControleLogin() {
        telaLogin = new TelaLogin(null, true);
        serviceLogin = new ServiceLogin(telaLogin);
        telaLogin.getjButtonEntrar().addActionListener(this);
        telaLogin.setVisible(true);

    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(telaLogin.getjButtonEntrar())){
            serviceLogin.entrar();  
        }
    }

    
}
