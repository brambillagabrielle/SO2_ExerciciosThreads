package Exercicio_3_Tweets;

public class Usuario extends Thread {
    
    private EnviaDado enviaDado;

    public Usuario(EnviaDado enviaDado) {
        this.enviaDado = enviaDado;
    }
    
    public void run() {
        
        int cont = 0;
        
        while (!this.enviaDado.getParaPrograma()) {
            
            try {
                
                cont++;
                
                System.out.println("@user" + (int) Math.floor(Math.random()*(1000)));
                sleep(8000);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
        
    }
    
}
