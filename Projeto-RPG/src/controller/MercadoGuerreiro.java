//pacote
package controller;

import javax.swing.JOptionPane;

public class MercadoGuerreiro {
    
    public void comprarGuerreiro(Personagem personagem){
        TelaPrincipalRPG tela = new TelaPrincipalRPG();
        if ( personagem.getDinheiro() == 0 ){
            JOptionPane.showMessageDialog(null, "Você não tem grana, vá lutar para conseguir");
            tela.jogadas(personagem);
        }
        else{
            if ( personagem.getNivel() <= 5){
                JOptionPane.showMessageDialog(null, "Ainda não há itens disponíveis para você");
                tela.jogadas(personagem);
            }else if ( personagem.getNivel() > 5 && personagem.getNivel() <= 10 ){
                int numero;
                Object[] options = { "Macacão de Couro - R$6.00","Cueca de lã - R$3.20", "Pente ralo - R$2.00","Voltar" };
        
                numero = JOptionPane.showOptionDialog(null,"Itens disponíveis\n\n\n$ cash: "+personagem.getDinheiro(), "Mercado",JOptionPane.YES_NO_CANCEL_OPTION,
                     JOptionPane.PLAIN_MESSAGE, null, options, options[3]);
                
                switch ( numero ){
                    case 0:
                        Object[] options1 = { "Comprar","Voltar" };
        
                        numero = JOptionPane.showOptionDialog(null,"Macacão de couro\nVai aumentar suas forças"
                                + "\naumentar sua potência na cama\n\nPreço: R$6.00\n\n\n$ cash: "+personagem.getDinheiro(), "Mercado",JOptionPane.YES_NO_CANCEL_OPTION,
                         JOptionPane.PLAIN_MESSAGE, null, options1, options1[1]);
                        switch ( numero ){
                            case 0:
                                if ( personagem.getDinheiro() < 6 )
                                    JOptionPane.showMessageDialog(null, "Você não tem grana suficiente, batalhe!");
                                else{
                                    personagem.setDinheiro(personagem.getDinheiro() - 6);
                                    JOptionPane.showMessageDialog(null, "Macacão de couro comprado com sucesso");
                                }
                            case 1:
                                comprarGuerreiro(personagem);
                                break;
                        }
                        tela.jogadas(personagem);
                        break;
                    case 1: 
                        Object[] options2 = { "Comprar","Voltar" };
        
                        numero = JOptionPane.showOptionDialog(null,"Cueca de lã\nSua destreza vai pro além"
                                + "\nMijo na cueca ? Nunca mais\n\nPreço: R$3.20\n\n\n$ cash: "+personagem.getDinheiro(), "Mercado",JOptionPane.YES_NO_CANCEL_OPTION,
                         JOptionPane.PLAIN_MESSAGE, null, options2, options2[1]);
                        switch ( numero ){
                            case 0:
                                if ( personagem.getDinheiro() < 3.20 )
                                    JOptionPane.showMessageDialog(null, "Você não tem grana suficiente, batalhe!");
                                else{
                                    personagem.setDinheiro(personagem.getDinheiro() - 3.20);
                                    JOptionPane.showMessageDialog(null, "Cueca de lã comprada com sucesso");
                                }
                            case 1:
                                comprarGuerreiro(personagem);
                                break;
                        }
                        tela.jogadas(personagem);
                        break;
                    case 2:
                        Object[] options3 = { "Comprar","Voltar" };
        
                        numero = JOptionPane.showOptionDialog(null,"Pente ralo\nEisten terá inveja de sua inteligência"
                                + "\nAdeus piolhada \n\nPreço: R$2.00\n\n\n$ cash: "+personagem.getDinheiro(), "Mercado",JOptionPane.YES_NO_CANCEL_OPTION,
                         JOptionPane.PLAIN_MESSAGE, null, options3, options3[1]);
                        switch ( numero ){
                            case 0:
                                if ( personagem.getDinheiro() < 2 )
                                    JOptionPane.showMessageDialog(null, "Você não tem grana suficiente, batalhe!");
                                else{
                                    personagem.setDinheiro(personagem.getDinheiro() - 2 );
                                    JOptionPane.showMessageDialog(null, "Pente ralo comprado com sucesso");
                                }
                            case 1:
                                comprarGuerreiro(personagem);
                                break;
                        }
                        tela.jogadas(personagem);
                        break;
                    case 3:
                        tela.jogadas(personagem);
                        break;
                }
            }
        }
    }
}
