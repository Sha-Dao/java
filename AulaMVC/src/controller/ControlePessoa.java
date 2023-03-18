
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import service.ServiceLogin;
import service.ServicePessoa;
import view.TelaPessoa;
import view.TelaPrincipal;


public class ControlePessoa implements ActionListener {
    
    private final TelaPessoa telaPessoa;
    private ServicePessoa servicePessoa;
    
    public ControlePessoa(TelaPrincipal telaPrincipal){
        telaPessoa = new TelaPessoa(null, true);
        servicePessoa = new ServicePessoa(telaPessoa);
        telaPessoa.getjButtonLimpar().addActionListener(this);
        telaPessoa.getjButtonCadastrar().addActionListener(this);
        
        telaPessoa.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource().equals(telaPessoa.getjButtonLimpar())){
            limpar();
            
            

        }else if ((e.getSource().equals(telaPessoa.getjButtonCadastrar()))&& (!(telaPessoa.getjTextFieldNome().getText().equals("")))
                && (!(telaPessoa.getjTextFieldEmail().getText().equals(""))) && (!(telaPessoa.getjTextFieldEndereco().getText().equals("")))
                &&(!(telaPessoa.getjTextFieldTelefone().getText().equals("")))) {
            
                cadastrar();
                
                JOptionPane.showMessageDialog(null, "Dados cadastrados");
                telaPessoa.dispose();
                TelaPessoa telaPessoa = new TelaPessoa(null, true);
                telaPessoa.setVisible(true);
        
            
                
        }else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        
        }
    }

    private void limpar() {
        telaPessoa.getjTextFieldCPF().setText("");
        telaPessoa.getjTextFieldEndereco().setText("");
        telaPessoa.getjTextFieldNome().setText("");
        telaPessoa.getjTextFieldTelefone().setText("");
        telaPessoa.getjTextFieldEmail().setText("");
        telaPessoa.getjTextFieldLogin().setText("");
        telaPessoa.getjTextFieldSenha().setText("");
    }

    private void cadastrar() {
        servicePessoa.cadastrar(); 
        
    }
   
    
}
