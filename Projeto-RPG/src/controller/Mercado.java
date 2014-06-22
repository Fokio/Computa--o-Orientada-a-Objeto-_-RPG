
package controller;

import javax.swing.JOptionPane;

public class Mercado {
    
    public void comprar(Personagem personagem){

        if ( personagem.getClasseoPersonagem().equals("Arqueiro") ){
            MercadoArqueiro mercadoArqueiro = new MercadoArqueiro();
            mercadoArqueiro.comprarArqueiro(personagem);
        }
        else if ( personagem.getClasseoPersonagem().equals("Guerreiro") ){
            MercadoGuerreiro mercadoGuerreiro = new MercadoGuerreiro();
            mercadoGuerreiro.comprarGuerreiro(personagem);
        }
        else if ( personagem.getClasseoPersonagem().equals("Mago") ){
            MercadoMago mercadoMago = new MercadoMago();
            mercadoMago.comprarMago(personagem);
        }
        else {
            MercadoMago mercadoMago = new MercadoMago();
            mercadoMago.comprarMago(personagem);
        }
            
    }
}
