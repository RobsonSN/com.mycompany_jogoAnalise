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
public class Jogo21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Singleton*/
        SingletonJogo21 primeiro = SingletonJogo21.getInstance();
        SingletonJogo21 segundo = SingletonJogo21.getInstance();
    
        
        /*Observer*/
           
        ObserverJogada j1 = new Jogador1();
        ObserverJogada j2 = new Jogador2();
        //ObserverJogada outroObserver = new Jogador1();
        ObservableJogo21 observable = new ObservableJogo21();        
        observable.adicionarObserver(j1);
        observable.adicionarObserver(j2);
        observable.setEstado("novo");
        
        /*Factory*/
        FactoryCriarAcao fca = new FactoryCriarAcao();
        AcaoJogador acao = fca.criarAcao("Aguardar");
        acao.aguardarAdversario();
        
        FactoryCriarAcao fca1 = new FactoryCriarAcao();
        AcaoJogador acao1 = fca1.criarAcao("Jogar");
        acao1.efetuarJogada();
        
        
    }
}

    