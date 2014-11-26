package com.mycompany.jogoanalise;


import java.util.ArrayList;
import java.util.List;

public class ObservableJogo21 {
    List<ObserverJogada> listaDeObservers = new ArrayList<>();
    private String estado;
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
        notificarTodos();
    }
    
    public void adicionarObserver(ObserverJogada observerJogada){
        listaDeObservers.add(observerJogada);
    }
  
    public void notificarTodos(){
        for (ObserverJogada p:listaDeObservers){
            p.receberNotificacao();
        }
    }
    
}
