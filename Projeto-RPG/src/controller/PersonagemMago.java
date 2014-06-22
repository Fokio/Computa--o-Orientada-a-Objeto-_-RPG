//pacote controller
package controller;
//bibliotecas que serão necessarias
import javax.swing.JOptionPane;

public class PersonagemMago extends Personagem{
    
    //construtor padrão
    public PersonagemMago(){};
    //construtor completo
    public PersonagemMago(String nome, int nivel, double forca, double destreza, double inteligencia, String tipoPersonagem, double dinheiro){
        super(nome, nivel, forca, destreza, inteligencia, tipoPersonagem, dinheiro);
    }
    //método para usuário informar o nome do mago
    public void criarMago (){
        PersonagemMago personagemMago = new PersonagemMago();
        personagemMago.setNome(JOptionPane.showInputDialog("Informe o nome para o Mago"));
        personagemMago.valorDestreza();
        personagemMago.valorForca();
        personagemMago.valorInteligencia();
        personagemMago.setDinheiro(10);
        personagemMago.setClassePersonagem("Mago");
        personagemMago.setNivel(10);
        JOptionPane.showMessageDialog(null, "Mago "+personagemMago.getNome()+ " criado com sucesso!\n Faça login para jogar");
        TelaPrincipalRPG tela = new TelaPrincipalRPG();
        tela.jogadas(personagemMago);
    }
    //método herdado da classe Personagem
    @Override
    public void valorForca() {
        this.setForca(23);
    }
    //método herdado da classe Personagem
    @Override
    public void valorInteligencia() {
        this.setInteligencia(54);
    }
    //método herdado da classe Personagem
    @Override
    public void valorDestreza() {
        this.setDestreza(2);
    }
}
