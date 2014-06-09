//pacote
package controller;
// importação das classes necessárias
import javax.swing.JOptionPane;

public class CriarConta {
 
    //Criando um objeto da classe Conta
    Conta c = new Conta();
    //método que pede para o usuário informar os dados para criação de uma nova conta
    public void criarConta(){
        //variáveis usadas para criação da conta
        String email;
        String usuario;
        String senha;
        int erro = 0;
        //repeti enquanto a variável erro for igual a 0
        do{
            erro = c.setEmail(JOptionPane.showInputDialog("Informa o seu e-mail")); 
        }while( erro == 0 );   
        //repeti enquanto a variável erro for igual a 0
        do{
            erro = c.setUsuario(JOptionPane.showInputDialog("Informe o nome de usuário"));
        }while( erro == 0 );
        //repeti enquanto a variável erro for igual a 0
        do{
            erro = c.setSenha(JOptionPane.showInputDialog("Informe a senha"));
        }while ( erro == 0 );
        
        //chama o método mostrarDados()
        mostrarDados();
    }
    //Método que o usuário escolhe entre 3 opçoes ( Continuar, Alterar Dados, Voltar ) 
    public void mostrarDados(){
        //criação das variáveis
        int numero;
        Object[] options = { "Confirmar", "Alterar dados","Voltar" };
      //criação da tela com as 3 opções  
      numero = JOptionPane.showOptionDialog(null,"E-mail: "+c.getEmail()+"\nUsuário: "+
              c.getUsuario()+"\nSenha: "+c.getSenha()+"\nEscolha uma das opções","CRIAR CONTA",
              JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[2]);
        //chama o método escolheOpcao e passa como parametro a variável número      
        escolherOpcao(numero);
    }
    //método que direciona o usuário para a tela desejada de acordo com a opção escolhida acima
    public void escolherOpcao(int numero){
        if ( numero == 0 ){
            VerificaConta gc = new VerificaConta();
            gc.verificarConta();
        }
        else if ( numero == 1 )
            criarConta();
        else{
            EscolhaOpcao ec = new EscolhaOpcao();
            ec.direcionar();
        }
    }
}
