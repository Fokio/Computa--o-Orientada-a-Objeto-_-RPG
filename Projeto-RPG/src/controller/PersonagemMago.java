//pacote controller
package controller;
//bibliotecas que serão necessarias
import javax.swing.JOptionPane;

public class PersonagemMago extends Personagem{
    
    public PersonagemMago(){};
    public PersonagemMago(String nome, int nivel, double forca, double destreza, double inteligencia){
        super(nome, nivel, forca, destreza, inteligencia);
    }
    //método para usuário informar o nome do mago
    public void criarMago (){
        this.setNome(JOptionPane.showInputDialog("Informe o nome para o Mago"));
    }
    //método herdado da classe Personagem
    @Override
    public void valorForca() {
        this.setForca(23);
    }
    //método herdado da classe Personagem
    @Override
    public void valorInteligencia() {
        this.setInteligencia(54);
    }
    //método herdado da classe Personagem
    @Override
    public void valorDestreza() {
        this.setDestreza(2);
    }
}
