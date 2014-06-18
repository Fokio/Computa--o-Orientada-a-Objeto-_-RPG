/*
##     ## ######## ##     ## 
##     ## ##       ##     ## 
##     ## ##       ##     ## 
##     ## ######   ##     ## 
##     ## ##        ##   ##  
##     ## ##         ## ##   
 #######  ##          ###    

Universidade Federal de ViÃ§osa - Campus Rio ParanaÃ­ba
SIN141 - ComputaÃ§Ã£o Orientada a Objetos

Projeto: Jogo RPG
Professor: Jader

Desenvolvido por:
Deivis Henrique Alves - MatrÃ­cula 2480
Danilo Lemos Prado - MatrÃ­cula 2489
Gustavo Amaral Silva - MatrÃ­cula 2464
*/

// Pacote View
package view;

// ImportaÃ§Ã£o das bibliotecas necessarias.
import java.io.*;
import controller.*;
import javax.swing.*;
import model.*;

public class Teste{
    
    public static void main(String arg[]){
        
        //Criando objetos das classes necessÃ¡rias.
        EscolhaOpcao escolhaOpcao = new EscolhaOpcao();
        ManipulacaoArquivo manipulaArquivo = new ManipulacaoArquivo();
        
        try
        {
              //Chamando o mÃ©todo criarDiretorioPrincipal() na classe manipulacaoArquivo, esse mÃ©todo irÃ¡ criar a pasta Arquivo se ela nÃ£o existir.
              manipulaArquivo.criarDiretorioPrincipal();
        }
        catch (IOException erroCriarArquivo)
        {
              //Reportando algum erro na criaÃ§Ã£o da pasta Arquivo.
              JOptionPane.showMessageDialog(null, "Erro! Houve um erro ao criar os arquivos necessÃ¡rios!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }

        //Chamando o mÃ©todo direcionar() da classe EscolhaOpcao
        escolhaOpcao.direcionar();
        
    }
}