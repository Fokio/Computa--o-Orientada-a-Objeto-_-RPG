//pacote controller
package controller;

import java.io.Serializable;

public class Conta implements Serializable {
    //variaveis usadas    
    private String email;
    private String senha;
    private String usuario;
    
    //construtor padrão
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
    
    //metodo para setar uma senha informada, se a senha for nula irá apresentar um erro
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
    
    //metodo para setar o usuário passado, se o usuário for nulo irá apresentar um erro 
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
    //metodo para mostrar o usuário
    public String getUsuario(){
        return this.usuario;
    }
}