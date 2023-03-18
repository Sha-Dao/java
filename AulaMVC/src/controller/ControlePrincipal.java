/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaPrincipal;

/**
 *
 * @author curso
 */
public class ControlePrincipal implements ActionListener {
    
    private final TelaPrincipal telaPrincipal;
            
    public  ControlePrincipal(){
        
        telaPrincipal = new TelaPrincipal();
        telaPrincipal.getjMenuItemPessoa().addActionListener(this);
        telaPrincipal.setVisible(true);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(telaPrincipal.getjMenuItemPessoa()));
        ControlePessoa controlePessoa = new ControlePessoa(telaPrincipal);
    }
    
}
