//pacote
package controller;
//bibliotecas necessárias
import javax.swing.JOptionPane;

public class Batalhas {
    //método lutar que recebe como parametro personagem, o metodo mostra qual adversário o personagem irá lutar
    //e ele tem a opção de lutar ou voltar atrás
    public void lutar(Personagem personagem ){

        int numero;
        if ( personagem.getNivel() == 0 ){
            Object[] options = { "Lutar","Voltar" };
        
                numero = JOptionPane.showOptionDialog(null,"Adversário: Minhoca"
                        + "\nNível:  0"
                        + "\nDestreza: 1"
                        + "\nInteligência: Sem cérebro"
                        + "\nForça: 1"
                        + "\nDinheiro: R$0.00", "Batalha",JOptionPane.YES_NO_CANCEL_OPTION,
                     JOptionPane.PLAIN_MESSAGE, null, options, options[1]);
                
                switch ( numero ){
                    case 0:
                        System.out.println("AQUI MAMAE");
                        Adversario adversario = new Adversario();
                        adversario.setDestreza(1);
                        adversario.setDinheiro(0);
                        adversario.setForca(1);
                        adversario.setInteligencia(0);
                        adversario.setNivel(0);
                        adversario.setNome("Minhoca");
                        CalcularLuta calcular = new CalcularLuta();
                        calcular.calcularLuta(adversario, personagem);
                        break;
                    case 1:
                        TelaPrincipalRPG tela = new TelaPrincipalRPG();
                        tela.jogadas(personagem);
                        break;
                }
        }
        
    }
    
}
