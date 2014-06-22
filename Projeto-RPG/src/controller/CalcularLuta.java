//pacote 
package controller;
//bibliotecas necessárias
import javax.swing.JOptionPane;


public class CalcularLuta {
    //metodo que recebe como parametro o personagem e o adversario e calcula quem ganha ou perde na luta    
    public void calcularLuta(Adversario adversario, Personagem personagem){
        System.out.println("ESTOU AQUI MOTHER");
            JOptionPane.showMessageDialog(null, "Temos que pensar um método de calcular a luta\n"
                    + "se o adversário for derrotado, o seu dinheiro passa para o personagem ...");
            TelaPrincipalRPG tela = new TelaPrincipalRPG();
            tela.jogadas(personagem);
    }
}
