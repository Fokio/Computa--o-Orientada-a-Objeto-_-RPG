
package controller;

public class Adversario {
 
    private String nome;
    private int nivel;
    private double forca;
    private double destreza;
    private double inteligencia;
    private double dinheiro;
    
    public Adversario(){};
    public Adversario(String nome, int nivel, double forca, double destreza, double inteligencia, double dinheiro){
        this.setNome(nome);
        this.setNivel(nivel);
        this.setForca(forca);
        this.setDestreza(destreza);
        this.setInteligencia(inteligencia);
        this.setDinheiro(dinheiro);
    }
    
    //metodo para setar o nome
      public void setNome(String nome){
        this.nome = nome;
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
    //metodo para setar o dinheiro do personagem
    public void setDinheiro(double dinheiro){
        this.dinheiro = dinheiro;
    }
    //metodo para exibir o dinheirodo personagem
    public Double getDinheiro(){
        return this.dinheiro;
    }
}
