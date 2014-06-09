//pacote controller
package controller;
//bibliotecas necessárias
import javax.swing.JOptionPane;

public class PersonagemGuerreiro extends Personagem{
    
    public PersonagemGuerreiro(){};
    public PersonagemGuerreiro(String nome, int nivel, double forca, double destreza, double inteligencia){
        super(nome, nivel, forca, destreza, inteligencia);
    }
    //método para usuário informar o nome do guerreiro
    public void criarGuerreiro (){
        this.setNome(JOptionPane.showInputDialog("Informe o nome para o Guerreiro"));
    }
    //método herdado da classe Personagem
    @Override
    public void valorForca() {
        this.setForca(92);
    }
    //método herdado da classe Personagem
    @Override
    public void valorInteligencia() {
        this.setInteligencia(43);
    }
    //método herdado da classe Personagem
    @Override
    public void valorDestreza() {
        this.setDestreza(4);
    }
    

    
}
