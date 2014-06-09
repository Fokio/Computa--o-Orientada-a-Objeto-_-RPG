//pacote controller
package controller;
//biblioteca que serão necessarias
import javax.swing.JOptionPane;

public class VerificaConta {
    
    public void verificarConta(){
        JOptionPane.showMessageDialog(null,"Aqui irá fazer a verifiação da conta");
    }
    public void salvaConta(){
        FazerLogin fl = new FazerLogin();
        
        fl.fazerLogin();
    }
    public void contaJaExiste(){
        FazerLogin fl = new FazerLogin();
        
        JOptionPane.showMessageDialog(null,"A e-mail informado já existe.\nPor favor, faça o login");
        fl.fazerLogin();
    }
}
