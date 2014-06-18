package model;

import java.io.*;
import javax.swing.JOptionPane;
import controller.*;

public class ManipulacaoArquivo
{
    //VariÃ¡vel informando o caminho para a pasta Arquivo.
    private final String diretorioPrincipal = "../Arquivos";
    //VariÃ¡vel irfomando o caminho para dentro da pasta Arquivo.
    private final String diretorioConta = "../Arquivos/";

    //Metodo para criar o diretorio principal, onde ficarÃ¡ todos os dados salvos dos jogadores e do jogo.
    public void criarDiretorioPrincipal() throws IOException
    {
         File diretorio = new File(diretorioPrincipal);
         if (!diretorio.exists())
         {
              diretorio.mkdir();
         }
    }
    
    //MÃ©todo para criar o diretorio dos usÃºarios caso nÃ£o exista.
    public void criarDiretorioUsuario(String usuario) throws IOException
    {
         File diretorio = new File(diretorioConta + usuario);
         if (!diretorio.exists())
         {
               diretorio.mkdir();
         }
         else
         {
              throw new IOException();
         }
    }
    
    //MÃ©todo para criar o arquivo onde ficarÃ¡ salvo os dados de login no jogo.
    public void criarArquivoInformacoes(Conta c) throws IOException
    {
         String arquivo = diretorioConta + c.getUsuario() + "/Contato.txt";
         File arquivoInformacoes = new File(arquivo);
         FileWriter criarContato;
         try
         {
              criarContato = new FileWriter(arquivoInformacoes);
              criarContato.close();
         }
         catch (IOException erroCriarArquivos)
         {
              throw new IOException();
         }
    }
    
    //MÃ©todo para salvar as informaÃ§Ãµes do usÃºario que deseja se cadastrar no jogo, onde irÃ¡ salvar o E-Mail, UsÃºario e Senha.
    public void salvarInformacoes(Conta c) throws FileNotFoundException , IOException
    {
         String diretorio = diretorioConta + c.getUsuario() + "/Contato.txt";
         FileOutputStream linkDiretorio = new FileOutputStream(diretorio);
         ObjectOutputStream linkArquivo = new ObjectOutputStream(linkDiretorio);

         try
         {
              linkArquivo.writeObject(c);
         }
         catch (FileNotFoundException err)
         {
              throw new FileNotFoundException();
         }
         catch (IOException err)
         {
              throw new IOException();
         }
         finally
         {
              linkDiretorio.close();
              linkArquivo.close();
         }
    }

    //MÃ©todo para excluir a pasta criada com o valor que estÃ¡ no campo "usuario", caso o usÃºario nÃ£o deseja se cadastrar no jogo.
    public void excluirPasta(String usuario)
    {
         File diretorio = new File(diretorioConta + usuario);
         diretorio.delete();
    }
    
    //MÃ©todo para pesquisar se o usÃºario jÃ¡ existe, caso ele nÃ£o exista irÃ¡ lanÃ§ar uma exceÃ§Ã£o.
    public void pesquisarUsuario(String usuario) throws IOException
    {
         File diretorio = new File(diretorioConta + usuario);
         if (!diretorio.exists())
         {
              throw new IOException();
         }
    }
    
    //MÃ©todo para pesquisar a senha, se ela Ã© igual a senha que foi armazenada quando o usÃºario se registrou no jogo.
    public Conta pesquisarSenha(String usuario, String senha) throws FileNotFoundException, IOException, ClassNotFoundException
    {
         String diretorio = diretorioConta + usuario + "/Contato.txt";
         FileInputStream linkDiretorio = new FileInputStream(diretorio);
         ObjectInputStream linkArquivo = new ObjectInputStream(linkDiretorio);
         Conta aux;
         try
         {
              aux = (Conta) linkArquivo.readObject();
              if(aux.getSenha().equals(senha))
              {
                   return aux;
              }
              else
              {
                   throw new ClassNotFoundException();
              }
         }
         catch (FileNotFoundException err)
         {
              throw new FileNotFoundException();
         }
         catch (IOException err)
         {
              throw new IOException();
         }
         catch (ClassNotFoundException err)
         {
              throw new ClassNotFoundException();
         }
         finally
         {
             System.out.printf("10");
              linkDiretorio.close();
              System.out.printf("11");
              linkArquivo.close();
         }
    }
}