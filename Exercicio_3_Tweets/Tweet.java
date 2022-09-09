package Exercicio_3_Tweets;

public class Tweet extends Thread {
    
    private EnviaDado enviaDado;

    public Tweet(EnviaDado enviaDado) {
        this.enviaDado = enviaDado;
    }
    
    public void run() {
        
        int cont = 0;
        
        while (!this.enviaDado.getParaPrograma()) {
            
            try {
                
                cont++;
                
                System.out.println("Tweet " + cont);
                sleep(8000);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
        
    }
    
}
