/*
##     ## ######## ##     ## 
##     ## ##       ##     ## 
##     ## ##       ##     ## 
##     ## ######   ##     ## 
##     ## ##        ##   ##  
##     ## ##         ## ##   
 #######  ##          ###    

Universidade Federal de Viçosa - Campus Rio Paranaíba
SIN141 - Computação Orientada a Objetos

Projeto: Jogo RPG
Professor: Jader

Desenvolvido por:
Deivis Henrique Alves - Matrícula 2480
Danilo Lemos Prado - Matrícula 2489
Gustavo Amaral Silva - Matrícula 2464
*/

// Pacote View
package view;

// Importação das bibliotecas necessarias.
import java.io.*;
import controller.*;
import javax.swing.*;
import model.*;

public class Teste{
    
    public static void main(String arg[]){
        
        //Criando objetos das classes necessárias.
        EscolhaOpcao escolhaOpcao = new EscolhaOpcao();
        ManipulacaoArquivo manipulaArquivo = new ManipulacaoArquivo();
        
        try
        {
              //Chamando o método criarDiretorioPrincipal() na classe manipulacaoArquivo, esse método irá criar a pasta Arquivo se ela não existir.
              manipulaArquivo.criarDiretorioPrincipal();
        }
        catch (IOException erroCriarArquivo)
        {
              //Reportando algum erro na criação da pasta Arquivo.
              JOptionPane.showMessageDialog(null, "Erro! Houve um erro ao criar os arquivos necessários!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }

        //Chamando o método direcionar() da classe EscolhaOpcao
        escolhaOpcao.direcionar();
        
    }
}