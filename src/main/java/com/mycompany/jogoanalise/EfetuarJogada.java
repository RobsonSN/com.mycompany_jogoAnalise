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
public class EfetuarJogada implements AcaoJogador {
    
    public void efetuarJogada() {
        System.out.println("Sua vez de jogar");
    }

    @Override
    public void aguardarAdversario() {
        System.out.println("Aguarde seu adversario!!");
    }
  
}
