//pacote
package controller;

// importação das classes necessárias
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
    
    //Método que pede para o usuário informar os dados para criação de uma nova conta
    public void criarConta(){
         do{
              try
              {
                   email = JOptionPane.showInputDialog(null, "Informe o seu e-mail");
                   continuar = true;
              }
              catch(NullPointerException err)
              {
                   JOptionPane.showMessageDialog(null, "E-mail já existente, tente novamente!", "Aviso", JOptionPane.ERROR_MESSAGE);
              }
         }while( continuar == false );

         do{
              try
              {
                   usuario = JOptionPane.showInputDialog(null, "Informe o nome de usuário");
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
        
        //chama o método mostrarDados()
        mostrarDados();
    }
    //Método que o usuário escolhe entre 3 opçoes ( Continuar, Alterar Dados, Voltar ) 
    public void mostrarDados(){
        //criação das variáveis
        int numero;
        Object[] options = { "Confirmar", "Alterar dados","Voltar" };
      //criação da tela com as 3 opções  
      numero = JOptionPane.showOptionDialog(null,"E-mail: "+email+"\nUsuário: "+
              usuario+"\nSenha: "+senha+"\nEscolha uma das opções","CRIAR CONTA",
              JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[2]);
        //chama o método escolheOpcao e passa como parametro a variável número      
        escolherOpcao(numero);
    }
    //método que direciona o usuário para a tela desejada de acordo com a opção escolhida acima
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
                   JOptionPane.showMessageDialog(null, "Usúario já existente!", "Aviso", JOptionPane.ERROR_MESSAGE);
              }
              catch (FileNotFoundException err)
              {
                   JOptionPane.showMessageDialog(null, "Arquivo não encontrado!", "Aviso", JOptionPane.ERROR_MESSAGE);
              }
              catch (IOException err)
              {
                   JOptionPane.showMessageDialog(null, "Impossivél de criar os arquivos necessarios!", "Aviso", JOptionPane.ERROR_MESSAGE);
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