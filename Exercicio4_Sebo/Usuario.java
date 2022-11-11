package Exercicio4_Sebo;

public class Usuario extends Thread {
    
    Livro livro;

    public Usuario(String nome, Livro livro) {
        super(nome);
        this.livro = livro;
    }
    
    public void run() {
        
        try {
            
            int interesse = 10;
            
            while (interesse > 4) {
                
                interesse = (int)Math.floor(Math.random()*(10));
                
                livro.retirada(this);
                System.out.println(livro.getLeitorAtual().getName() + " retirou o livro..... ");
                sleep(3000);
                
                System.out.println(livro.getLeitorAtual().getName()
                        + " devolveu o livro com " + interesse + " de interesse em retirar novamente");
                livro.devolucao();
                sleep((10 - interesse) * 1000);
               
            }
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
