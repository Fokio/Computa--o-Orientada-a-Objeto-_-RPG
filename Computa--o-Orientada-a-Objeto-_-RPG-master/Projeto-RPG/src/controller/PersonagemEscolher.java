//personagem controller
package controller;
//bibliotecas que serão usadas
import javax.swing.JOptionPane;

public class PersonagemEscolher {
    //método que cria uma tela onde o usuário tem que escolher entre 4 opções ( Arqueiro, Guerreiro, Mago, Voltar)
    public void escolherPersonagem(){
        int numero;
        Object[] options = { "Arqueiro", "Guerreiro","Mago","Voltar" };
        
       numero = JOptionPane.showOptionDialog(null,"Escolha uma das opções","PERSONAGEM",JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE, null, options, options[3]);
       //chama o método escolherOpcao e passa como parametro a variável numero
       escolherOpcao(numero);
    }
    //método que direciona o usuário de acordo com a opção escolhida acima
    public void escolherOpcao(int numero){
        //cria uma objeto da classe SobrePersonagem
        SobrePersonagem sobrePersonagem = new SobrePersonagem();
        //se numero for igual a 3, irá criar um objeto da classe EscolhaOpcao e chamar o metodo direcionar
        if ( numero == 3 ){
            EscolhaOpcao escolherOpcao = new EscolhaOpcao();
            escolherOpcao.direcionar();
        }
        /*se o numero for igual a 0, irá criar um objeto da classe PersonagemArqueiro e chamar os metodos
        dessa classe, também chamará o metodo sobre da classe SobrePersonagem
        */
        else if ( numero == 0 ){
            PersonagemArqueiro personagemArqueiro = new PersonagemArqueiro();
            personagemArqueiro.valorDestreza();
            personagemArqueiro.valorForca();
            personagemArqueiro.valorInteligencia();
            sobrePersonagem.sobre(numero);
        }
        /*se o numero for igual a 1, irá criar um objeto da classe PersonagemGuerreiro e chamar os metodos
        dessa classe, também chamará o metodo sobre da classe SobrePersonagem
        */
        else if ( numero == 1 ){
            PersonagemGuerreiro personagemGuerreiro = new PersonagemGuerreiro();
            personagemGuerreiro.valorDestreza();
            personagemGuerreiro.valorForca();
            personagemGuerreiro.valorInteligencia();
            sobrePersonagem.sobre(numero);
        }
        /*se o numero for diferente de todos acima, irá criar um objeto da classe PersonagemMago e chamar os metodos
        dessa classe, também chamará o metodo sobre da classe SobrePersonagem
        */
        else{
            PersonagemMago personagemMago = new PersonagemMago();
            personagemMago.valorDestreza();
            personagemMago.valorForca();
            personagemMago.valorInteligencia();
            sobrePersonagem.sobre(numero);
        }
    }
}
