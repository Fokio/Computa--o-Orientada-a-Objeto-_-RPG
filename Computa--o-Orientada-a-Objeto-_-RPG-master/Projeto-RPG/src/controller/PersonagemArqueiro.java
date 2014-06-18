//pacote controle
package controller;
//bibliotecas que serão usadas
import javax.swing.JOptionPane;

public class PersonagemArqueiro extends Personagem{

    //método para usuário informar o nome do arqueiro
    public void criarArqueiro (){
        this.setNome(JOptionPane.showInputDialog("Informe o nome para o Arqueiro"));
    }
    //método herdado da classe Personagem
    @Override
    public void valorForca() {
        this.setForca(10);
    }
    //método herdado da classe Personagem
    @Override
    public void valorInteligencia() {
        this.setInteligencia(20);
    }
    //método herdado da classe Personagem
    @Override
    public void valorDestreza() {
        this.setDestreza(30);
    }
    
}
