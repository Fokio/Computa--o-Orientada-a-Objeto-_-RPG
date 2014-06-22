//pacote controle
package controller;
//bibliotecas que serão usadas
import javax.swing.JOptionPane;

public class PersonagemArqueiro extends Personagem{

    
    public PersonagemArqueiro(){};
    public PersonagemArqueiro(String nome, int nivel, double forca, double destreza, double inteligencia,String tipoPersonagem, double dinheiro){
        super(nome, nivel, forca, destreza, inteligencia, tipoPersonagem, dinheiro);
    }
    //método para usuário informar o nome do arqueiro
    public void criarArqueiro (){
        PersonagemArqueiro personagemArqueiro = new PersonagemArqueiro();
        personagemArqueiro.setNome(JOptionPane.showInputDialog("Informe o nome para o Arqueiro"));
        personagemArqueiro.valorDestreza();
        personagemArqueiro.valorForca();
        personagemArqueiro.valorInteligencia();
        personagemArqueiro.setDinheiro(10);
        personagemArqueiro.setClassePersonagem("Arqueiro");
        personagemArqueiro.setNivel(0);
        JOptionPane.showMessageDialog(null, "Arqueiro "+personagemArqueiro.getNome()+ " criado com sucesso!\n Faça login para jogar");
        TelaPrincipalRPG tela = new TelaPrincipalRPG();
        tela.jogadas(personagemArqueiro);
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
