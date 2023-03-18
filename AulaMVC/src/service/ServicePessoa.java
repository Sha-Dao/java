/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import controller.ControlePrincipal;
import javax.swing.JOptionPane;
import model.Pessoa;
import model.PessoaDAO;
import model.Usuario;
import view.TelaPessoa;

/**
 *
 * @author j_ped
 */
public class ServicePessoa {
    private TelaPessoa telaPessoa;
    private PessoaDAO pessoaDAO;

    public ServicePessoa(TelaPessoa tela) {
 
        this.pessoaDAO = new PessoaDAO();
        
        this.telaPessoa = tela;
    }
    public void cadastrar() {
       
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(telaPessoa.getjTextFieldNome().getText());
        pessoa.setEmail(telaPessoa.getjTextFieldEmail().getText());
        pessoa.setEndereco(telaPessoa.getjTextFieldEndereco().getText());
        pessoa.setCpf(Integer.parseInt(telaPessoa.getjTextFieldCPF().getText()));
        pessoa.setTelefone(telaPessoa.getjTextFieldTelefone().getText());
        pessoaDAO.inserir(pessoa.getEmail(), pessoa.getNome(), pessoa.getEndereco(), pessoa.getTelefone(), pessoa.getCpf());
        
    }
}
