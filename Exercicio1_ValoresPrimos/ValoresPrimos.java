package Exercicio1_ValoresPrimos;

public class ValoresPrimos extends Thread {
    
    private int min;
    private int max;
    
    public ValoresPrimos(int min, int max) {
        super("Thread " + min + " - " + max);
        this.min = min;
        this.max = max;
    }
    
    public void run() {
        
        boolean primo = false;
        
        for (int val = min; val < max; val++) {
            
            if (val > 1 && (val == 2 || val % 2 != 0)) {
                
                primo = true;
                
                for (int i = 2; i <= val/2; i++) {
                    
                    if (val % i == 0)
                        primo = false;
                    
                }

                if (primo)
                    System.out.println(this.getName() + ": " + val);
                    
            }
                
        }
            
    }
    
}

