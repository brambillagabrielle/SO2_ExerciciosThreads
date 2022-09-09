package Exercicio_5_BlockingQueue;

import java.util.concurrent.*;

/*
    Baseando-se na figura baixo implemente um programa produtor/consumidor
    utilizando alguma das opções de implementação BlockingQueue. A produtor
    (carregador) irá produzir itens (carregar as embalagens) e adicionará os mesmos
    em um buffer (caminhão). O consumidor (entregador) retira os itens do buffer e
    entrega ao cliente.
*/

public class Main {
    
    public static void main(String[] args) {
        
        BlockingQueue<Item> carga = new ArrayBlockingQueue<>(10);
        
        Carregador carregador = new Carregador(carga);
        Entregador entregador = new Entregador(carga);
        
        carregador.start();
        entregador.start();
        
    }
    
}
