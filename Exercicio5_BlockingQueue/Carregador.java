package Exercicio5_BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Carregador extends Thread {

    private BlockingQueue<Item> carga;

    public Carregador(BlockingQueue<Item> carga) {
        this.carga = carga;
    }

    public void run() {
        
        int contCarregados = 0;
        
        while (contCarregados < 50) {
            
            try {
            
                this.carga.put(new Item("Item " + contCarregados));
                System.out.println("Item carregado: " + contCarregados);
                contCarregados++;
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }

    }

}
