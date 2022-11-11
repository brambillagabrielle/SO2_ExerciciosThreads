package Exercicio5_BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Entregador extends Thread {

    private BlockingQueue<Item> carga;

    public Entregador(BlockingQueue<Item> carga) {
        this.carga = carga;
    }

    public void run() {

        while (true) {

            try {
                System.out.println("Item entregue: " + this.carga.take().getNome());
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            if (carga.isEmpty())
                break;

        }

    }

}
