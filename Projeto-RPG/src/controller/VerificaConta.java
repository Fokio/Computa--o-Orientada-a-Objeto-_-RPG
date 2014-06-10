//pacote controller
package controller;
//biblioteca que serão necessarias
import javax.swing.JOptionPane;

public class VerificaConta {
    
    FazerLogin fazerLogin = new FazerLogin();
    
    public void verificarConta(){
        JOptionPane.showMessageDialog(null,"Aqui irá fazer a verifiação da conta");
    }
    public void salvaConta(){
        fazerLogin.fazerLogin();
    }
    public void contaJaExiste(){
        JOptionPane.showMessageDialog(null,"A e-mail informado já existe.\nPor favor, faça o login");
        fazerLogin.fazerLogin();
    }
}
