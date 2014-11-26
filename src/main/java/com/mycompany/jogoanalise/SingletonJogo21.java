
package com.mycompany.jogoanalise;

public class SingletonJogo21 {

    private static SingletonJogo21 sing;  
    
    private SingletonJogo21(){}    
       
    public static SingletonJogo21 getInstance() {  
            if (sing == null) {  
                sing = new SingletonJogo21();
                System.out.println("Criando tabuleiro");
            }
            else{
                System.out.println("Tabuleiro criado");
            }
            return sing;  
        }
}


 