package model;

import java.io.*;
import javax.swing.JOptionPane;
import controller.*;

public class ManipulacaoArquivo
{
    //Variável informando o caminho para a pasta Arquivo.
    private final String diretorioPrincipal = "../Arquivos";
    //Variável irfomando o caminho para dentro da pasta Arquivo.
    private final String diretorioConta = "../Arquivos/";

    //Metodo para criar o diretorio principal, onde ficará todos os dados salvos dos jogadores e do jogo.
    public void criarDiretorioPrincipal() throws IOException
    {
         File diretorio = new File(diretorioPrincipal);
         if (!diretorio.exists())
         {
              diretorio.mkdir();
         }
    }
    
    //Método para criar o diretorio dos usúarios caso não exista.
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
    
    //Método para criar o arquivo onde ficará salvo os dados de login no jogo.
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
    
    //Método para salvar as informações do usúario que deseja se cadastrar no jogo, onde irá salvar o E-Mail, Usúario e Senha.
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

    //Método para excluir a pasta criada com o valor que está no campo "usuario", caso o usúario não deseja se cadastrar no jogo.
    public void excluirPasta(String usuario)
    {
         File diretorio = new File(diretorioConta + usuario);
         diretorio.delete();
    }
    
    //Método para pesquisar se o usúario já existe, caso ele não exista irá lançar uma exceção.
    public void pesquisarUsuario(String usuario) throws IOException
    {
         File diretorio = new File(diretorioConta + usuario);
         if (!diretorio.exists())
         {
              throw new IOException();
         }
    }
    
    //Método para pesquisar a senha, se ela é igual a senha que foi armazenada quando o usúario se registrou no jogo.
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