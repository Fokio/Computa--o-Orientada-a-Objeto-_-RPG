//pacote
package controller;

// importaÃ§Ã£o das classes necessÃ¡rias
import java.io.*;
import javax.swing.*;
import model.*;

public class CriarConta {
 
    //Criando um objeto das classes necessarias
    Conta c = new Conta();
    ManipulacaoArquivo manipulaArquivo = new ManipulacaoArquivo();
    
    String email;
    String usuario;
    String senha;
    boolean continuar = false;
    
    //MÃ©todo que pede para o usuÃ¡rio informar os dados para criaÃ§Ã£o de uma nova conta
    public void criarConta(){
         do{
              try
              {
                   email = JOptionPane.showInputDialog(null, "Informe o seu e-mail");
                   continuar = true;
              }
              catch(NullPointerException err)
              {
                   JOptionPane.showMessageDialog(null, "E-mail jÃ¡ existente, tente novamente!", "Aviso", JOptionPane.ERROR_MESSAGE);
              }
         }while( continuar == false );

         do{
              try
              {
                   usuario = JOptionPane.showInputDialog(null, "Informe o nome de usuÃ¡rio");
                   continuar = true;
              }
              catch(NullPointerException err)
              {
                   JOptionPane.showMessageDialog(null, "Informe o que foi pedido!", "Aviso", JOptionPane.ERROR_MESSAGE);
              }
         }while( continuar == false );
                  
         do{
              try
              {
                   senha = JOptionPane.showInputDialog(null, "Informe a senha");
                   continuar = true;
              }
              catch(NullPointerException err)
              {
                   JOptionPane.showMessageDialog(null, "Informe o que foi pedido!", "Aviso", JOptionPane.ERROR_MESSAGE);
              }
         }while( continuar == false );
        
        //chama o mÃ©todo mostrarDados()
        mostrarDados();
    }
    //MÃ©todo que o usuÃ¡rio escolhe entre 3 opÃ§oes ( Continuar, Alterar Dados, Voltar ) 
    public void mostrarDados(){
        //criaÃ§Ã£o das variÃ¡veis
        int numero;
        Object[] options = { "Confirmar", "Alterar dados","Voltar" };
      //criaÃ§Ã£o da tela com as 3 opÃ§Ãµes  
      numero = JOptionPane.showOptionDialog(null,"E-mail: "+email+"\nUsuÃ¡rio: "+
              usuario+"\nSenha: "+senha+"\nEscolha uma das opÃ§Ãµes","CRIAR CONTA",
              JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[2]);
        //chama o mÃ©todo escolheOpcao e passa como parametro a variÃ¡vel nÃºmero      
        escolherOpcao(numero);
    }
    //mÃ©todo que direciona o usuÃ¡rio para a tela desejada de acordo com a opÃ§Ã£o escolhida acima
    public void escolherOpcao(int numero){
         if ( numero == 0 )
         {
              try
              {
                   c.setEmail(email);
                   c.setUsuario(usuario);
                   c.setSenha(senha);
                   manipulaArquivo.criarDiretorioUsuario(usuario);
                   manipulaArquivo.criarArquivoInformacoes(c);
                   manipulaArquivo.salvarInformacoes(c);
              }
              catch (NullPointerException err)
              {
                   JOptionPane.showMessageDialog(null, "UsÃºario jÃ¡ existente!", "Aviso", JOptionPane.ERROR_MESSAGE);
              }
              catch (FileNotFoundException err)
              {
                   JOptionPane.showMessageDialog(null, "Arquivo nÃ£o encontrado!", "Aviso", JOptionPane.ERROR_MESSAGE);
              }
              catch (IOException err)
              {
                   JOptionPane.showMessageDialog(null, "ImpossivÃ©l de criar os arquivos necessarios!", "Aviso", JOptionPane.ERROR_MESSAGE);
              }
              JOptionPane.showMessageDialog(null, "Conta criada com sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
              EscolhaOpcao escolhaOpcao = new EscolhaOpcao();
              escolhaOpcao.direcionar();
         }
         else 
              if ( numero == 1 )
              {
                   manipulaArquivo.excluirPasta(usuario);
                   criarConta();
              }
         else
         {
              EscolhaOpcao escolhaOpcao = new EscolhaOpcao();
              escolhaOpcao.direcionar();
         }
    }
}