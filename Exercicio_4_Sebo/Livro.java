package Exercicio_4_Sebo;

public class Livro {
    
    private String titulo;
    private Usuario leitorAtual = null;

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Usuario getLeitorAtual() {
        return leitorAtual;
    }

    public void setLeitorAtual() {        
        this.leitorAtual = leitorAtual;
    }
    
    public synchronized void retirada(Usuario usuario) {
        
        try {
            
            while(this.leitorAtual != null)
                wait();
            
            this.leitorAtual = usuario;
            notify();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public synchronized void devolucao() {
        
        try {
            
            while(this.leitorAtual == null)
                wait();
            
            this.leitorAtual = null;
            notify();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
