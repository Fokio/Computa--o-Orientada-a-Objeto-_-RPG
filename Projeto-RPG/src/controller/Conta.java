//pacote controller
package controller;

public class Conta {
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
    public int setEmail(String email){
         try{
              if(email.isEmpty()){
                   throw new NullPointerException();
              }
              else{
                   this.email = email;
                   return 1;
              }
         }
         catch(NullPointerException erroEmail){
              return 0;
         } 
    }
    //metodo para mostrar o email informado
    public String getEmail(){
        return this.email;
    }
    //metodo para setar uma senha informada, se a senha for nula irá apresentar um erro
    public int setSenha(String senha){
        try{
            if ( senha.isEmpty() ){
                throw new NullPointerException();
            }else{
                this.senha = senha;
                return 1;
            }
        }
        catch(NullPointerException erroSenha){
            return 0;
        }
    }
    //metodo para mostrar a senha
    public String getSenha(){
        return this.senha;

    }
    //metodo para setar o usuário passado, se o usuário for nulo irá apresentar um erro 
    public int setUsuario(String usuario){
        try{
            if ( usuario.isEmpty() ){
                throw new NullPointerException();
            }else{
                this.usuario = usuario;
                return 1;
            }
        }
        catch(NullPointerException erroUsuario){
            return 0;
        }
    }
    //metodo para mostrar o usuário
    public String getUsuario(){
        return this.usuario;
    }
}
