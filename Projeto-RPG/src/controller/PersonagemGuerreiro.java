//pacote controller
package controller;
//bibliotecas necessárias
import javax.swing.JOptionPane;

public class PersonagemGuerreiro extends Personagem{
    
    //construtor padrão
    public PersonagemGuerreiro(){};
    //construtor completo
    public PersonagemGuerreiro(String nome, int nivel, double forca, double destreza, double inteligencia, String tipoPersonagem, double dinheiro){
        super(nome, nivel, forca, destreza, inteligencia, tipoPersonagem, dinheiro);
    }
    //método para usuário informar o nome do guerreiro
    public void criarGuerreiro (){
        PersonagemGuerreiro personagemGuerreiro = new PersonagemGuerreiro();
        personagemGuerreiro.setNome(JOptionPane.showInputDialog("Informe o nome para o Guerreiro"));
        personagemGuerreiro.valorDestreza();
        personagemGuerreiro.valorForca();
        personagemGuerreiro.valorInteligencia();
        personagemGuerreiro.setDinheiro(10);
        personagemGuerreiro.setClassePersonagem("Guerreiro");
        personagemGuerreiro.setNivel(10);
        JOptionPane.showMessageDialog(null, "Guerreiro "+personagemGuerreiro.getNome()+ " criado com sucesso!\n Faça login para jogar");
        TelaPrincipalRPG tela = new TelaPrincipalRPG();
        tela.jogadas(personagemGuerreiro);
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
