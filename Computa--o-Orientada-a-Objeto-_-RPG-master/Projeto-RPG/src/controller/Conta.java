//pacote controller
package controller;

import java.io.Serializable;

public class Conta implements Serializable {
    //variaveis usadas    
    private String email;
    private String senha;
    private String usuario;
    
    //construtor padrÃ£o
    public Conta(){};
    //contrutor completo
    public Conta ( String email, String senha, String usuario){
        this.setEmail(email);
        this.setSenha(senha);
        this.setUsuario(usuario);
    }
    
    //metodo para setar o email passado, se o email for nulo vai informar um erro
    public void setEmail(String email) throws NullPointerException{
         try{
              if(email == null)
              {
                   throw new NullPointerException();
              }
              else{
                   this.email = email;
              }
         }
         catch(NullPointerException erroNome){
              throw new NullPointerException();
         }
    }
    //metodo para mostrar o email informado
    public String getEmail(){
        return this.email;
    }
    
<<<<<<< HEAD:Projeto-RPG/src/controller/Conta.java
    //metodo para setar uma senha informada, se a senha for nula irÃ¡ apresentar um erro
=======
    //metodo para setar uma senha informada, se a senha for nula irá apresentar um erro
>>>>>>> origin/master:Computa--o-Orientada-a-Objeto-_-RPG-master/Projeto-RPG/src/controller/Conta.java
    public void setSenha(String senha){
        try{
            if ( senha == null ){
                throw new NullPointerException();
            }else{
                this.senha = senha;
            }
        }
        catch(NullPointerException erroSenha){
            throw new NullPointerException();
        }
    }
    //metodo para mostrar a senha
    public String getSenha(){
        return this.senha;

    }
    
<<<<<<< HEAD:Projeto-RPG/src/controller/Conta.java
    //metodo para setar o usuÃ¡rio passado, se o usuÃ¡rio for nulo irÃ¡ apresentar um erro 
=======
    //metodo para setar o usuário passado, se o usuário for nulo irá apresentar um erro 
>>>>>>> origin/master:Computa--o-Orientada-a-Objeto-_-RPG-master/Projeto-RPG/src/controller/Conta.java
    public void setUsuario(String usuario){
        try{
            if ( usuario == null ){
                throw new NullPointerException();
            }else{
                this.usuario = usuario;
            }
        }
        catch(NullPointerException erroUsuario){
              throw new NullPointerException();
        }
    }
    //metodo para mostrar o usuÃ¡rio
    public String getUsuario(){
        return this.usuario;
    }
}