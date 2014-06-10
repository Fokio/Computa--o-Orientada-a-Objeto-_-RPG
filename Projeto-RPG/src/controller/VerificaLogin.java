//pacote controller 
package controller;
//bibiliotecas que serão necessarias
import javax.swing.JOptionPane;

public class VerificaLogin {
    
    public void verificarLogin(){
        JOptionPane.showMessageDialog(null,"Aqui irá fazer a verifiação do login");
        loginValido();
    }
    public void loginValido(){
        PersonagemEscolher personagemEscolher = new PersonagemEscolher();
        personagemEscolher.escolherPersonagem();
    }
}
