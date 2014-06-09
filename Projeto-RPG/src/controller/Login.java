
// Pacote controller
package controller;

public class Login
{
    // Variável que contem o nome para logar no sistema.
    private String usuario;
    // Variável que tem a senha do usúario para logar no sistema.
    private String senha;
    
    // Construtor padrão.
    public Login(){}
    // Construtor completo.
    public Login(String usuario, String senha){
         this.setUsuario(usuario);
         this.setSenha(senha);
    }
    
    // Método para setar o nome.
    public int setUsuario(String usuario){
         try{
            if(usuario.isEmpty()){
                throw new NullPointerException();
            }
            else{
                this.usuario = usuario;
                return 1;
            }
        }
        catch(NullPointerException erroUsuario){
            return 0;
        }
    }
    // Método para recuperar o conteúdo que está na variável nome.
    public String getUsuario(){
         return this.usuario;
    }
    // Método para atribuir valor a variável senha.
    public int setSenha(String senha){
         try{
              if(senha.isEmpty()){
                   throw new NullPointerException();
              }
              else{
                   this.senha = senha;
                   return 1;
              }
         }
         catch(NullPointerException erroNome){
              return 0;
         } 
    }
    //Método para recuperar o conteúdo que está na variável senha.
    public String getSenha(){
         return this.senha;
    }
}