package Exercicio3_Tweets;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hora extends Thread {
    
    EnviaDado enviaDado;

    public Hora(EnviaDado enviaDado) {
        this.enviaDado = enviaDado;
    }
    
    public void run() {
        
        int cont = 0;
        
        while (!this.enviaDado.getParaPrograma()) {
            
            try {
                
                cont++;
                System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
                sleep(10000);
                
                if (cont == 10)
                    this.enviaDado.setParaPrograma(true);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }
    
}
