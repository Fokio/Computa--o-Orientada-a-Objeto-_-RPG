//pacote controller
package controller;
//bibliotecas necessárias
import javax.swing.JOptionPane;

public class SobrePersonagem {
    //método que permiti o usuário se ele quer ou não tal personagem
    public void sobre(int numero){
        Object[] options = { "Continuar","Voltar" };
        //se o número for igual a 0 ele podera ler sobre o que é arqueiro, sobre quanto ele terá de 
        //força, destreza e inteligencia e optar se vai ou não escolher o arqueiro
        if ( numero == 0 ){
              numero = JOptionPane.showOptionDialog(null, "ARQUEIRO" +
            "\nForça: xxx\nDestreza: xxx\nInteligência: xxx"
                      + "\nDeseja Continuar?", "PERSONAGEM - ARQUEIRO",
                  JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, options, options[1]);
              //se o número for igual a 0, irá será criado um arqueiro
              if ( numero == 0 ){
                  PersonagemArqueiro pa = new PersonagemArqueiro();
                  pa.criarArqueiro();
              }
              //senão for igual a 0, irá voltar na tela para o usuário escolher um novo personagem
              else{
                  PersonagemEscolher pe = new PersonagemEscolher();
                  pe.escolherPersonagem();
              }
        }
        //se o número for igual a 1 ele podera ler sobre o que é guerreiro, sobre quanto ele terá de 
        //força, destreza e inteligencia e optar se vai ou não escolher o guerreiro
        else if ( numero == 1){
             numero = JOptionPane.showOptionDialog(null, "GUERREIRO: " +
              "\nForça: 111\nDestreza: 111\nInteligência: 111"
                      + "\nDeseja Continuar?", "PERSONAGEM - GUERREIRO",
                  JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, options, options[1]);
             //se o número for igual a 0, irá será criado um guerreiro
              if ( numero == 0 ){
                  PersonagemGuerreiro pg = new PersonagemGuerreiro();
                  pg.criarGuerreiro();
              }
              //senão for igual a 0, irá voltar na tela para o usuário escolher um novo personagem
              else{
                  PersonagemEscolher pe = new PersonagemEscolher();
                  pe.escolherPersonagem();
              }
        }
        //se o número for igual a 2 ele podera ler sobre o que é mago, sobre quanto ele terá de 
        //força, destreza e inteligencia e optar se vai ou não escolher o mago
        else if ( numero == 2 ){
             numero = JOptionPane.showOptionDialog(null, "MAGO: " +
             "\nForça: ccc\nDestreza: ccc\nInteligência: ccc"
                      + "\nDeseja Continuar?", "PERSONAGEM - MAGO",
                  JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, options, options[1]);
             //se o número for igual a 0, irá será criado um mago
              if ( numero == 0 ){
                  PersonagemMago pm = new PersonagemMago();
                  pm.criarMago();
              }
               //senão for igual a 0, irá voltar na tela para o usuário escolher um novo personagem
              else{
                  PersonagemEscolher pe = new PersonagemEscolher();
                  pe.escolherPersonagem();
              }
        }
    }
}
