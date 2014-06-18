//pacote controller
package controller;
//importaÃ§Ã£o das classes necessÃ¡rias
import javax.swing.JOptionPane;

public class EscolhaOpcao {
     
    //MÃ©todo que cria uma tela para o usuÃ¡rio escolher entre 3 opÃ§Ãµes ( Criar Conta, Fazer Login , Sair )     
    public void direcionar(){
        int numero;
        Object[] options = { "Criar Conta", "Fazer Login","Sair" };
        
       numero = JOptionPane.showOptionDialog(null,"Escolha uma das opÃ§Ãµes","CONTA",JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE, null, options, options[2]);
       
       escolherOpcao(numero);
   }
    //MÃ©todo que direciona se o usuÃ¡rio quer criar uma conta, fazer login ou sair    
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