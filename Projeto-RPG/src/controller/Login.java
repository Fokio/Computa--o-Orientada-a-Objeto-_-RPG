// Pacote controller
package controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;
import model.ManipulacaoArquivo;

public class Login
{
    // Construtor padrÃ£o.
    public Login(){}

    //MÃ©todo para fazer login no jogo, esse mÃ©todo irÃ¡ pegar os dados de login, como usÃºario e senha, irÃ¡ verificar no sistema se os dados sÃ£o consistentes
    public Conta fazerLogin(){
        //variaveis necessarias
         ManipulacaoArquivo manipulaArquivo = new ManipulacaoArquivo();
         String usuario = "";
         String senha = "";
         boolean continuar = false;
         Conta conta = new Conta();
         do
         {
            try
            {
                 usuario = JOptionPane.showInputDialog(null, "Informe o usuÃ¡rio");
                 manipulaArquivo.pesquisarUsuario(usuario);
                 continuar = true;
            }
            catch (IOException e)
            {
                   JOptionPane.showMessageDialog(null, "Informe um usÃºario vÃ¡lido!", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
         }while ( continuar == false );

         do
         {
              
              try
              {
                   senha = JOptionPane.showInputDialog(null, "Informe a senha");
                   conta = manipulaArquivo.pesquisarSenha(usuario,senha);
                   continuar = true;
                   JOptionPane.showMessageDialog(null, "Login realizado com sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
              }
              catch (FileNotFoundException err)
              {
                   JOptionPane.showMessageDialog(null, "Erro! Arquivo nÃ£o encontrado!", "Aviso", JOptionPane.ERROR_MESSAGE);
              }
              catch (IOException err)
              {
                   JOptionPane.showMessageDialog(null, "Erro! NÃ£o foi possivel acessar os dados!", "Aviso", JOptionPane.ERROR_MESSAGE);
              }
              catch (ClassNotFoundException err)
              {
                   JOptionPane.showMessageDialog(null, "Erro! Senha errado!", "Aviso", JOptionPane.ERROR_MESSAGE);
              }
         }while ( continuar == false );
         return conta;
    }
}