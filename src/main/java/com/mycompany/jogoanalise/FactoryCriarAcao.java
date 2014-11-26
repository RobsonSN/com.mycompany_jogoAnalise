/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jogoanalise;

/**
 *
 * @author Robson
 */
public class FactoryCriarAcao {
    
    public AcaoJogador criarAcao(String acao)
    {
        if(acao.equals("Aguardar Jogador"))
        {
            return new EfetuarJogada();
        }
        else 
        {
            return new AguardarJogador();
        }
      
    }
}
