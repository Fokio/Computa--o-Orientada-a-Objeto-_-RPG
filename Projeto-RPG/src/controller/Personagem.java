//pacote controller
package controller;


public abstract class Personagem {
    //variaveis necessarias
    private String nome;
    private int nivel;
    private double forca;
    private double destreza;
    private double inteligencia;
    //construtor padrão
    public Personagem(){};
    //construtor completo
    public Personagem(String nome, int nivel, double forca, double destreza, double inteligencia){
        this.setNome(nome);
        this.setNivel(nivel);
        this.setForca(forca);
        this.setDestreza(destreza);
        this.setInteligencia(inteligencia);
   }
    //metodo para setar o nome, se o valor informado for nulo irá informar um erro 
    public int setNome(String nome){
        try{
            if ( nome.isEmpty() ){
                throw new NullPointerException();
            }else{
                this.nome = nome;
                return 1;
            }
        }catch(NullPointerException erroNome){
            return 0;
        }
    }
    //metodo para mostar o nome
    public String getNome(){
        return this.nome;
    }
    //metodo para setar o nivel
    public void setNivel(int nivel){
        this.nivel = nivel;
    }
    //metodo para mostrar o nivel
    public int getNivel(){
        return this.nivel;
    }
    //metodo para setar a forca
    public void setForca(double forca){
        this.forca = forca;
    }
    //metodo para mostrar a força
    public double getForca(){
        return this.forca;
    }
    //metodo para setar a destreza
    public void setDestreza(double destreza){
        this.destreza = destreza;
    }
    //metodo para mostrar a destreza
    public double getDestreza(){
        return this.destreza;
    }
    //metodo para setar a inteligencia
    public void setInteligencia(double inteligencia){
        this.inteligencia = inteligencia;
    }
    //metodo para mostrar a inteligencia
    public double getInteligencia(){
        return this.inteligencia;
    }
    //metodos abstratos que terão obrigatoriamente serem implentados nas classes filhas de Personagem
    public abstract void valorForca();
    public abstract void valorInteligencia();
    public abstract void valorDestreza();

}
