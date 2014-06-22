
package controller;

import javax.swing.JOptionPane;

public class TelaPrincipalRPG {
    
    public void jogadas(Personagem personagem){
        int numero;
        Object[] options = { "Lutar","Mercado", "Salvar","Salvar/Sair" };
        
       numero = JOptionPane.showOptionDialog(null,personagem.getClasseoPersonagem()+" :  "+ personagem.getNome()+
               "\n\nNível: "+personagem.getNivel()+
               "\nDestreza: "+personagem.getDestreza()+
               "\nForça: "+personagem.getForca()+
               "\nInteligência: "+personagem.getInteligencia()+
               "\n$ Cash: "+personagem.getDinheiro() , "RPG",JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE, null, options, options[3]);
       
       switch ( numero ){
           case 0:
               Batalhas batalha = new Batalhas();
               batalha.lutar(personagem);
               break;
           case 1:
               Mercado mercado = new Mercado();
               mercado.comprar(personagem);
               break;
           case 2:
               JOptionPane.showMessageDialog(null,"Função não implementada");
               break;
           case 3:
               EscolhaOpcao escolha = new EscolhaOpcao();
               escolha.direcionar();
               break;
       }
    }
}
