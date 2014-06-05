/*
 * A classe login irá garantir que o usúario faço o login no sistema do jogo. 
 */

package modelo;

public class Login
{
    private String nome;
    private String senha;
    
    public Login(){}
    public Login(String nome, String senha)
    {
         this.setNome(nome);
         this.setSenha(senha);
    }
    
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
    public String getNome()
    {
         return this.nome;
    }
    
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
    public String getSEnha()
    {
         return this.senha;
    }
}