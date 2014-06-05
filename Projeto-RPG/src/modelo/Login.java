/*
 * A classe login irá garantir que o usúario faço o login no sistema do jogo. 
 */

// Pacote Modelo
package modelo;

public class Login
{
    // Variável que contem o nome para logar no sistema.
    private String nome;
    // Variável que tem a senha do usúario para logar no sistema.
    private String senha;
    
    // Construtor padrão.
    public Login(){}
    // Construtor completo.
    public Login(String nome, String senha)
    {
         this.setNome(nome);
         this.setSenha(senha);
    }
    
    // Método para setar o nome.
    public void setNome(String nome)
    {
         try{
            if(nome.isEmpty()){
                throw new NullPointerException();
            }
            else{
                this.nome = nome;
            }
        }
        catch(NullPointerException erroNome){
            throw new NullPointerException();
        }
    }
    // Método para recuperar o conteúdo que está na variável nome.
    public String getNome()
    {
         return this.nome;
    }
    
    // Método para atribuir valor a variável senha.
    public void setSenha(String senha)
    {
         try{
              if(nome.isEmpty()){
                   throw new NullPointerException();
              }
              else{
                   this.nome = nome;
              }
         }
         catch(NullPointerException erroNome){
              throw new NullPointerException();
         } 
    }
    //Método para recuperar o conteúdo que está na variável senha.
    public String getSenha()
    {
         return this.senha;
    }
}