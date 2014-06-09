//pacote controle
package controller;
//lugar para importar as bibliotecas necessárias
import javax.swing.JOptionPane;

public class FazerLogin {
    //metodo onde o usuário informa os dados para fazer o login
    public void fazerLogin(){
        //variaveis necessarias
        String usuario;
        String senha;
        int erro = 0;
        Login l = new Login();
        //irá executar enquanto a variável erro for igual a 0
        do{
            erro = l.setUsuario(JOptionPane.showInputDialog("Informe o usuário"));
        }while ( erro == 0 );
        //irá executar enquanto a variável erro for igual a 0
        do{ 
            erro = l.setSenha(JOptionPane.showInputDialog("Informe a senha"));
        }while ( erro == 0 );
        //chama o metodo verificarLogin()
        verificarLogin();
    }
    //metodo que chama a classe VerificaLogin()
    public void verificarLogin(){
        VerificaLogin vl = new VerificaLogin();
        
        vl.verificarLogin();
    }
    
}
