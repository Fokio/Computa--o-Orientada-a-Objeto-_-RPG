//pacote controller
package controller;
//importação das classes necessárias
import javax.swing.JOptionPane;

public class EscolhaOpcao {
     
    //Método que cria uma tela para o usuário escolher entre 3 opções ( Criar Conta, Fazer Login , Sair )     
    public void direcionar(){
        int numero;
        Object[] options = { "Criar Conta", "Fazer Login","Sair" };
        
       numero = JOptionPane.showOptionDialog(null,"Escolha uma das opções","CONTA",JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE, null, options, options[2]);
       
       escolherOpcao(numero);
   }
    //Método que direciona se o usuário quer criar uma conta, fazer login ou sair    
    public void escolherOpcao(int numero){
        if ( numero == 0 ){
            CriarConta criarConta = new CriarConta();
            criarConta.criarConta();
        }
        else if ( numero == 1 ){
            Login login = new Login();
            login.fazerLogin();
        }
        else 
            System.exit(0);
   }
}